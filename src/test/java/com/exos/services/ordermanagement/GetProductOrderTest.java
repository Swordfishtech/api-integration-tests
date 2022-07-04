package com.exos.services.ordermanagement;

import com.exos.BaseTest;
import com.exos.GatewayRequest;
import com.exos.Serializer;
import com.exos.SqlQuery;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static com.exos.AssertHelper.assertResponseCode;

public class GetProductOrderTest extends BaseTest {


    @Test()
    public void get_existing_order_returns_200_OK() {

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
    }

    @Test
    public void get_order_using_id_that_does_not_exist_returns_404_NotFound() {

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

    @Test
    public void get_order_using_null_id_returns_400_BadRequest() {
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
