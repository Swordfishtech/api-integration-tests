package com.exos.services.ordermanagement;

import com.exos.BaseTest;
import com.exos.GatewayRequest;
import com.exos.Serializer;
import com.exos.SqlQuery;
import com.exos.dto.services.ordermanagement.CreateProductOrderReq;
import com.exos.dto.services.ordermanagement.GetProductOrderReq;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static com.exos.helpers.AssertHelper.assertResponseCode;

public class TestGetProductOrder extends BaseTest {


    @Test(groups = "SURE-149")
    public void test_get_product_order() {

        // create a order in the db
        CreateProductOrderReq createOrder = (CreateProductOrderReq) Serializer.convertJsonStringToObject("ProductOrder.json", CreateProductOrderReq.class);

        new GatewayRequest()
                .forService()
                .orderManagement()
                .createProductOrder(createOrder)
                .send();

        // retrieve the order
        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .orderManagement()
                .getProductOrder(GetProductOrderReq
                        .builder()
                        .productOrderId(1)
                        .build())
                .send();

        assertResponseCode(gatewayRequest, 200);

        //todo validate response body
    }

    @Test(groups = "SURE-149")
    public void test_using_id_that_does_not_exist() {

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .orderManagement()
                .getProductOrder(GetProductOrderReq
                        .builder()
                        .productOrderId(1000000)
                        .build())
                .send();

        assertResponseCode(gatewayRequest, 404);
    }

    @Test(groups = "SURE-149")
    public void test_using_null_id() {
        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .orderManagement()
                .getProductOrder(GetProductOrderReq
                        .builder()
                        .productOrderId(null)
                        .build())
                .send();

        assertResponseCode(gatewayRequest, 404);
    }

    @AfterTest
    public void clearDownDatabase() {
        SqlQuery.clearDownOrderManagementServiceDatabases();
    }
}
