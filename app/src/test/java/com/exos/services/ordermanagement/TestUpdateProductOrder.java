package com.exos.services.ordermanagement;

import com.aventstack.extentreports.Status;
import com.exos.*;
import com.exos.dto.services.ordermanagement.CreateProductOrderReq;
import com.exos.dto.services.ordermanagement.PatchProductOrderReq;
import com.exos.dto.services.ordermanagement.PatchProductOrderResp;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static com.exos.helpers.AssertHelper.assertResponseCode;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestUpdateProductOrder extends BaseTest {

    private PatchProductOrderReq patchOrder;

    @BeforeMethod(alwaysRun = true)
    public void setupCreateOrderRequest() {
        // Create a Patch product order object
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
        patchOrder = PatchProductOrderReq.builder()
                .state("rejected")
                .baseType("string")
                .schemaLocation("string")
                .type("string")
                .productOrderItem(orderItems)
                .build();
    }

    @Test()
    public void test_update_product_order() {

        setupDatabase();

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .orderManagement()
                .patchProductOrder(patchOrder.setProductId("1"))
                .send();

        assertResponseCode(gatewayRequest, 200);

        PatchProductOrderResp patchResponse = (PatchProductOrderResp) gatewayRequest.getSerializedResponse();
        assertThat(patchResponse.getState(),is("rejected"));
        getTestReporter().log(Status.INFO, "Validated order state is set to rejected");
        assertThat(patchResponse.getProductOrderItem().get(0).getState(), is("rejected"));
        getTestReporter().log(Status.INFO, "Validated ProductOrderItem.state is set to rejected");
    }

    @Test(groups = "BUG")
    public void test_update_order_that_does_not_exist() {

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .orderManagement()
                .patchProductOrder(patchOrder.setProductId("1000"))
                .send();

        //todo this should return a 404 Not Found
        assertResponseCode(gatewayRequest, 404);
    }

    @Test(groups = "BUG")
    public void test_update_order_to_unrecognised_state() {

        patchOrder.setProductId("1");
        patchOrder.setState("test");

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .orderManagement()
                .patchProductOrder(patchOrder)
                .send();

        assertResponseCode(gatewayRequest, 400);
    }

    @Test(groups = "BUG")
    public void test_update_order_using_invalid_order_id() {

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .orderManagement()
                .patchProductOrder(patchOrder.setProductId("a"))
                .send();

        assertResponseCode(gatewayRequest, 400);
    }

    private void setupDatabase() {

        // remove all values from the database
        SqlQuery.clearDownOrderManagementServiceDatabases();

        // Create a new order in the database
        CreateProductOrderReq createOrder = (CreateProductOrderReq) Serializer.convertJsonStringToObject("ProductOrder.json", CreateProductOrderReq.class);
        new GatewayRequest()
                .forService()
                .orderManagement()
                .createProductOrder(createOrder)
                .send();
    }
 }
