package com.exos.services.ordermanagement;

<<<<<<< HEAD
import com.exos.BaseTest;
import com.exos.GatewayRequest;
import com.exos.Serializer;
import com.exos.SqlQuery;
import com.exos.dto.services.ordermanagement.CreateProductOrderReq;
import com.exos.dto.services.ordermanagement.GetProductOrderReq;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

=======
import com.exos.*;
import com.exos.dto.services.ordermanagement.CreateProductOrderReq;
import com.exos.dto.services.ordermanagement.GetProductOrderReq;
import com.exos.dto.services.ordermanagement.GetProductOrderResp;
import com.exos.helpers.MandatoryHeaders;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.exos.helpers.AssertHelper.assertResponseBodyContains;
>>>>>>> 5ad3d1b (created dockerfile)
import static com.exos.helpers.AssertHelper.assertResponseCode;

public class TestGetProductOrder extends BaseTest {


    @Test(groups = "SURE-149")
    public void test_get_product_order() {

<<<<<<< HEAD
        // create a order in the db
        CreateProductOrderReq createOrder = (CreateProductOrderReq) Serializer.convertJsonStringToObject("ProductOrder.json", CreateProductOrderReq.class);

        new GatewayRequest()
=======
        // create an order in the db
        CreateProductOrderReq createOrder = (CreateProductOrderReq) Serializer.convertJsonStringToObject("ProductOrder.json", CreateProductOrderReq.class);

        new GatewayRequest()
                .usingHeaders(MandatoryHeaders.getHeaders())
>>>>>>> 5ad3d1b (created dockerfile)
                .forService()
                .orderManagement()
                .createProductOrder(createOrder)
                .send();

        // retrieve the order
        GatewayRequest gatewayRequest = new GatewayRequest()
<<<<<<< HEAD
=======
                .usingHeaders(MandatoryHeaders.getHeaders())
>>>>>>> 5ad3d1b (created dockerfile)
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

<<<<<<< HEAD
=======
    @Test(groups = "SURE-315")
    public void test_get_product_order_returns_geographic_address_block() {

        // create an order in the db
        CreateProductOrderReq createOrder = (CreateProductOrderReq) Serializer.convertJsonStringToObject("ProductOrder.json", CreateProductOrderReq.class);

        new GatewayRequest()
                .usingHeaders(MandatoryHeaders.getHeaders())
                .forService()
                .orderManagement()
                .createProductOrder(createOrder)
                .send();

        // retrieve the order
        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(MandatoryHeaders.getHeaders())
                .forService()
                .orderManagement()
                .getProductOrder(GetProductOrderReq
                        .builder()
                        .productOrderId(1)
                        .build())
                .send();

        assertResponseCode(gatewayRequest, 200);

        GetProductOrderResp response = (GetProductOrderResp) gatewayRequest.getSerializedResponse();
        GetProductOrderResp.GeographicAddressValidation geographicAddress = response.getProductOrderItem().get(0).getProduct().getPlace().get(0).getGeographicAddressValidation();

        assertResponseBodyContains("geographicAddressValidation.submittedGeographicAddress.city", geographicAddress.getSubmittedGeographicAddress().getCity(), "London");
        assertResponseBodyContains("geographicAddressValidation.submittedGeographicAddress.country", geographicAddress.getSubmittedGeographicAddress().getCountry(), "United Kingdom");
        assertResponseBodyContains("geographicAddressValidation.submittedGeographicAddress.streetName", geographicAddress.getSubmittedGeographicAddress().getStreetName(), "Test Road");
        assertResponseBodyContains("geographicAddressValidation.submittedGeographicAddress.geographicLocation.name", geographicAddress.getSubmittedGeographicAddress().getGeographicLocation().getName(), "Test Location");
        assertResponseBodyContains("geographicAddressValidation.submittedGeographicAddress.geographicSubAddress.buildingName", geographicAddress.getSubmittedGeographicAddress().getGeographicSubAddress().get(0).getBuildingName(), "Big Building");

    }

>>>>>>> 5ad3d1b (created dockerfile)
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

<<<<<<< HEAD
    @AfterTest
=======
    @BeforeMethod(alwaysRun = true)
>>>>>>> 5ad3d1b (created dockerfile)
    public void clearDownDatabase() {
        SqlQuery.clearDownOrderManagementServiceDatabases();
    }
}
