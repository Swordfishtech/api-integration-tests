package com.exos.services.cartmanagement;

import com.exos.BaseTest;
import com.exos.GatewayRequest;
import com.exos.HttpHeader;
import com.exos.Serializer;
import com.exos.helpers.MandatoryHeaders;
import com.exos.services.cartManagement.CreateShoppingCart;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.exos.AssertHelper.assertResponseCode;

public class CreateCartTest extends BaseTest {

    private CreateShoppingCart createShoppingCart;

    @Test
    public void create_cart_returns_201_Created() {

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .cartManagement()
                .createCart(createShoppingCart)
                .send();

        assertResponseCode(gatewayRequest, 201);

    }

    @Test
    public void empty_correlation_id_header_returns_400_BadRequest() {

        HttpHeader headers = MandatoryHeaders.getHeaders();
        headers.addHeader("correlation-id", "");

        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(headers)
                .forService()
                .cartManagement()
                .createCart(createShoppingCart)
                .send();

        assertResponseCode(gatewayRequest, 400);

    }

    @Test
    public void empty_full_name_header_returns_400_BadRequest() {

        HttpHeader headers = MandatoryHeaders.getHeaders();
        headers.addHeader("full-name", "");

        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(headers)
                .forService()
                .cartManagement()
                .createCart(createShoppingCart)
                .send();

        assertResponseCode(gatewayRequest, 400);

    }

    @BeforeClass
    public void setupRequest() {
        createShoppingCart = (CreateShoppingCart) Serializer.convertJsonStringToObject("CreateCart.json", CreateShoppingCart.class);
    }

}
