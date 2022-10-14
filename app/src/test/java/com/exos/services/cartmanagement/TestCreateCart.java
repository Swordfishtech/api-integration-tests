package com.exos.services.cartmanagement;

import com.exos.*;
import com.exos.helpers.MandatoryHeaders;
import com.exos.dto.services.cartmanagement.CreateShoppingCart;
import com.exos.dto.services.generic.ErrorMessage;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.exos.helpers.AssertHelper.*;

public class TestCreateCart extends BaseTest {

    private CreateShoppingCart createShoppingCart;

    @Test(groups = "SURE-237")
    public void test_create_cart_as_guest_user() {

        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(MandatoryHeaders.getHeaders())
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
        assertMissingMandatoryHeadersErrorMessage(gatewayRequest.getHttpResponse());
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
        assertMissingMandatoryHeadersErrorMessage(gatewayRequest.getHttpResponse());
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
        assertMissingMandatoryHeadersErrorMessage(gatewayRequest.getHttpResponse());
    }

    @Test
    public void test_missing_correlation_id_header() {

        HttpHeader headers = MandatoryHeaders.getHeaders();
        headers.removeHeader("correlation-id");

        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(headers)
                .forService()
                .cartManagement()
                .createCart(createShoppingCart)
                .send();

        assertResponseCode(gatewayRequest, 400);
        assertMissingMandatoryHeadersErrorMessage(gatewayRequest.getHttpResponse());
    }

    @Test
    public void test_missing_x_correlation_id_header() {

        HttpHeader headers = MandatoryHeaders.getHeaders();
        headers.removeHeader("x-correlation-id");

        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(headers)
                .forService()
                .cartManagement()
                .createCart(createShoppingCart)
                .send();

        assertResponseCode(gatewayRequest, 400);
        assertMissingMandatoryHeadersErrorMessage(gatewayRequest.getHttpResponse());
    }

    @BeforeClass
    public void setupRequest() {
        createShoppingCart = (CreateShoppingCart) Serializer.convertJsonStringToObject("CreateCart.json", CreateShoppingCart.class);
    }

}
