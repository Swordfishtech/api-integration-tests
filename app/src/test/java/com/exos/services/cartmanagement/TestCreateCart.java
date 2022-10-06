package com.exos.services.cartmanagement;

import com.exos.*;
import com.exos.helpers.MandatoryHeaders;
import com.exos.dto.services.cart.CreateShoppingCart;
import com.exos.dto.services.generic.ErrorMessage;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.exos.helpers.AssertHelper.assertResponseBodyContains;
import static com.exos.helpers.AssertHelper.assertResponseCode;

public class TestCreateCart extends BaseTest {

    private CreateShoppingCart createShoppingCart;

    @Test(groups = "SURE-237")
    public void test_create_cart_as_guest_user() {

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .cartManagement()
                .createCart(createShoppingCart)
                .send();

        assertResponseCode(gatewayRequest, 201);

        //todo: validate response body, raised a few concerns with the developer around this
    }

    @Test(groups = "SURE-238")
    public void test_create_cart_as_existing_user() {

        throw new SkipException("Need to implement?");
    }

    @Test(groups = "SURE-237")
    public void test_missing_request_body() {

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .cartManagement()
                .createCart(CreateShoppingCart.builder().build())
                .send();

        assertResponseCode(gatewayRequest, 400);
        ErrorMessage errorMsg = (ErrorMessage) Serializer.serialize(gatewayRequest.getHttpResponse(), ErrorMessage.class);
        assertResponseBodyContains("Code", errorMsg.getCode(), "400");
        assertResponseBodyContains("Status", errorMsg.getStatus(), "400");
        assertResponseBodyContains("Reason", errorMsg.getReason(), "Error while creating Shopping Cart");
        assertResponseBodyContains("Message", errorMsg.getMessage(), "Please provide valid input json body with required parameters");
        assertResponseBodyContains("Reference Error", errorMsg.getReferenceError(), "Please provide valid input json body with required parameters");

    }

    @Test(groups = "SURE-273")
    public void test_empty_correlation_id_header_value() {

        HttpHeader headers = MandatoryHeaders.getHeaders();
        headers.addHeader("correlation-id", "");

        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(headers)
                .forService()
                .cartManagement()
                .createCart(createShoppingCart)
                .send();

        assertResponseCode(gatewayRequest, 400);

        ErrorMessage errorMsg = (ErrorMessage) Serializer.serialize(gatewayRequest.getHttpResponse(), ErrorMessage.class);
        assertResponseBodyContains("Code", errorMsg.getCode(), "400");
        assertResponseBodyContains("Status", errorMsg.getStatus(), "400");
        assertResponseBodyContains("Reason", errorMsg.getReason(), "Required headers are missing, please verify and try again");
        assertResponseBodyContains("Message", errorMsg.getMessage(), "Please provide all the necessary and required http headers");
        assertResponseBodyContains("Reference Error", errorMsg.getReferenceError(), "Please provide all the necessary and required http headers");
    }

    @Test(groups = "SURE-273")
    public void test_empty_full_name_header_value() {

        HttpHeader headers = MandatoryHeaders.getHeaders();
        headers.addHeader("full-name", "");

        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(headers)
                .forService()
                .cartManagement()
                .createCart(createShoppingCart)
                .send();

        assertResponseCode(gatewayRequest, 400);

        ErrorMessage errorMsg = (ErrorMessage) Serializer.serialize(gatewayRequest.getHttpResponse(), ErrorMessage.class);
        assertResponseBodyContains("Code", errorMsg.getCode(), "400");
        assertResponseBodyContains("Status", errorMsg.getStatus(), "400");
        assertResponseBodyContains("Reason", errorMsg.getReason(), "Required headers are missing, please verify and try again");
        assertResponseBodyContains("Message", errorMsg.getMessage(), "Please provide all the necessary and required http headers");
        assertResponseBodyContains("Reference Error", errorMsg.getReferenceError(), "Please provide all the necessary and required http headers");
    }

    @BeforeClass
    public void setupRequest() {
        createShoppingCart = (CreateShoppingCart) Serializer.convertJsonStringToObject("CreateCart.json", CreateShoppingCart.class);
    }

}
