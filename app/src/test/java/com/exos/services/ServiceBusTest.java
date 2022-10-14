package com.exos.services;

import com.exos.*;
import com.exos.dto.ServiceBusEvent;
import com.exos.dto.services.ordermanagement.CreateProductOrderReq;
import com.exos.dto.services.ordermanagement.PatchProductOrderReq;
import com.exos.helpers.MandatoryHeaders;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static com.exos.helpers.AssertHelper.assertResponseBodyContains;
import static com.exos.helpers.AssertHelper.assertResponseCode;

public class ServiceBusTest extends BaseTest {

    private String correlationId;
    private GatewayRequest gatewayRequest;
    private CreateProductOrderReq createProductOrderReq;

    @Test
    public void create_product_order_fires_event() {

        // create a new product order
        createProductOrder();
        HttpHeader headers = gatewayRequest.getHeaders();

        // connect to Service Bus and search for the fired event based on the correlation-id sent in the create product order request
        String message = new ServiceBus().searchForMessageByCorrelationId(correlationId);
        ServiceBusEvent event = (ServiceBusEvent) Serializer.serialize(message, ServiceBusEvent.class);

        assertResponseBodyContains("email", event.getSession().getEmail(), headers.getHeaders().get("email"));
        assertResponseBodyContains("fullName", event.getSession().getFullName(), headers.getHeaders().get("full-name"));
        assertResponseBodyContains("loginName", event.getSession().getLoginName(), headers.getHeaders().get("login-name"));
        assertResponseBodyContains("x-correlation-id", event.getSession().getXCorrelationId(), headers.getHeaders().get("x-correlation-id"));
        assertResponseBodyContains("eventType", event.getEventType(), "ProductOrderCreateEvent");

        assertResponseBodyContains("description", event.getEvent().getProductOrder().getDescription(), createProductOrderReq.getDescription());
        assertResponseBodyContains("category", event.getEvent().getProductOrder().getCategory(), createProductOrderReq.getCategory());
        assertResponseBodyContains("externalId", event.getEvent().getProductOrder().getExternalId(), createProductOrderReq.getExternalId());
        assertResponseBodyContains("product order state", event.getEvent().getProductOrder().getProductOrderItem().get(0).getState(), createProductOrderReq.getProductOrderItem().get(0).getState());
    }

    @Test
    public void patch_product_order_fires_event() {

        List<PatchProductOrderReq.ProductOrderItem> orderItems = new ArrayList<>();

        PatchProductOrderReq.ProductOrderItem orderItem = PatchProductOrderReq.ProductOrderItem.builder()
                .id("string")
                .quantity(0)
                .action("add")
                .state("rejected")
                .baseType("string")
                .schemaLocation("string")
                .type("string")
                .build();

        orderItems.add(orderItem);
        PatchProductOrderReq patchOrder = PatchProductOrderReq.builder()
                .productId("1")
                .state("rejected")
                .baseType("string")
                .schemaLocation("string")
                .type("string")
                .productOrderItem(orderItems)
                .build();


        // Create order
        createProductOrder();
        HttpHeader header = MandatoryHeaders.getHeaders();
        String correlationId = header.getHeaders().get("correlation-id"); // todo add a get correaltion id header method in Mandatory headers class

        gatewayRequest
                .usingHeaders(header)
                .forService()
                .orderManagement()
                .patchProductOrder(patchOrder)
                .send();

        assertResponseCode(gatewayRequest, 200);

        String message = new ServiceBus().searchForMessageByCorrelationId(correlationId);
        ServiceBusEvent event = (ServiceBusEvent) Serializer.serialize(message, ServiceBusEvent.class);

        assertResponseBodyContains("eventType", event.getEventType(), "ProductOrderStateChangeEvent");
        assertResponseBodyContains("productOrder.state", event.getEvent().getProductOrder().getState(), patchOrder.getProductOrderItem().get(0).getState());
        assertResponseBodyContains("productOrderItem.state", event.getEvent().getProductOrder().getProductOrderItem().get(0).getState(), patchOrder.getProductOrderItem().get(0).getState());
    }


    @AfterMethod(alwaysRun = true)
    public void clearDownDatabase() {
        SqlQuery.clearDownOrderManagementServiceDatabases();
    }

    @BeforeMethod(alwaysRun = true)
    public void cleanDatabase() {
        SqlQuery.clearDownOrderManagementServiceDatabases();
    }

    private void createProductOrder() {

        // build product order request
        createProductOrderReq = (CreateProductOrderReq) Serializer.convertJsonStringToObject("ProductOrder.json", CreateProductOrderReq.class);

        HttpHeader headers = MandatoryHeaders.getHeaders();
        correlationId = headers.getHeaders().get("correlation-id");

        // send a product order through
        gatewayRequest = new GatewayRequest()
                .usingHeaders(headers)
                .forService()
                .orderManagement()
                .createProductOrder(createProductOrderReq)
                .send();

        assertResponseCode(gatewayRequest, 201);
    }
}
