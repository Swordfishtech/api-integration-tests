package com.exos.services.ordermanagement;

import com.aventstack.extentreports.Status;
import com.exos.*;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class PatchProductOrderTest extends BaseTest {

    private PatchProductOrderReq patchOrder;


    @Test()
    public void patch_order_successfully_patches_order_status() {

        setupDatabase();

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .orderManagement()
                .patchProductOrder(patchOrder.setProductId("1"))
                .send();

        AssertHelper.assertResponseCode(gatewayRequest, 200);

        PatchProductOrderResp patchResponse = (PatchProductOrderResp) gatewayRequest.getSerializedResponse();
        assertThat(patchResponse.getState(),is("rejected"));
        getTestReporter().log(Status.INFO, "Validated order state is set to rejected");
        assertThat(patchResponse.getProductOrderItem().get(0).getState(), is("rejected"));
        getTestReporter().log(Status.INFO, "Validated ProductOrderItem.state is set to rejected");
    }

    @Test
    public void patch_order_that_does_not_exist_returns_404_NotFound() {

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .orderManagement()
                .patchProductOrder(patchOrder.setProductId("1000"))
                .send();

        AssertHelper.assertResponseCode(gatewayRequest, 404);

        /**
         * {
         *     "code": 400,
         *     "reason": "Error in creating product order",
         *     "message": "Product order not found",
         *     "status": "ERROR",
         *     "referenceError": "Product order not found",
         *     "@baseType": "ProductOrderSerializer",
         *     "@schemaLocation": "https://schema.org/ServiceUnavailableError",
         *     "@type": "ServiceUnavailableError"
         * }
         */


    }

    @Test
    public void patch_order_to_unrecognised_state_returns_400_BadRequest() {
        patchOrder.setProductId("1");
        patchOrder.setState("test");

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .orderManagement()
                .patchProductOrder(patchOrder)
                .send();

        AssertHelper.assertResponseCode(gatewayRequest, 400);

    }

    @Test
    public void patch_order_using_an_invalid_order_id_returns_400_BadRequest() {

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .orderManagement()
                .patchProductOrder(patchOrder.setProductId("a"))
                .send();

        AssertHelper.assertResponseCode(gatewayRequest, 400);
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
 }
