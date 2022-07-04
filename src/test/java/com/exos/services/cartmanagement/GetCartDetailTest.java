package com.exos.services.cartmanagement;

import com.exos.BaseTest;
import com.exos.GatewayRequest;
import com.exos.HttpHeader;
import com.exos.Serializer;
import com.exos.helpers.MandatoryHeaders;
import com.exos.services.cartManagement.CreateShoppingCart;
import com.exos.services.cartManagement.CreateShoppingCartResp;
import com.exos.services.cartManagement.GetShoppingCart;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.exos.AssertHelper.assertResponseCode;

public class GetCartDetailTest extends BaseTest {

    private String shoppingCartId;

    @Test
    public void get_cart_using_valid_cart_id_returns_200_OK() {

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .cartManagement()
                .getCart(GetShoppingCart.builder().cartId(shoppingCartId).build())
                .send();

        assertResponseCode(gatewayRequest, 200);
        //todo validate response returns correct id and maybe one or two more vals

    }

    @Test
    public void get_cart_using_cart_id_that_does_not_exist_returns_404_NotFound() {

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .cartManagement()
                .getCart(GetShoppingCart.builder().cartId("1000").build())
                .send();

        assertResponseCode(gatewayRequest, 404);

        // todo validate response message too

    }

    @Test
    public void get_cart_using_null_cart_id_returns_404_NotFound() {

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .cartManagement()
                .getCart(GetShoppingCart.builder().cartId(null).build())
                .send();

        assertResponseCode(gatewayRequest, 404);

    }

    @Test
    public void empty_x_correlation_id_header_returns_400_BadRequest() {

        HttpHeader headers = MandatoryHeaders.getHeaders();
        headers.addHeader("x-correlation-id", "");

        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(headers)
                .forService()
                .cartManagement()
                .getCart(GetShoppingCart.builder().cartId(null).build())
                .send();

        assertResponseCode(gatewayRequest, 400);

    }

    @Test
    public void empty_login_name_header_returns_400_BadRequest() {

        HttpHeader headers = MandatoryHeaders.getHeaders();
        headers.addHeader("login-name", "");

        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(headers)
                .forService()
                .cartManagement()
                .getCart(GetShoppingCart.builder().cartId(null).build())
                .send();

        assertResponseCode(gatewayRequest, 400);
    }

    @BeforeClass
    public void setupTestData() {

        CreateShoppingCart createShoppingCart = (CreateShoppingCart) Serializer.convertJsonStringToObject("CreateCart.json", CreateShoppingCart.class);

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .cartManagement()
                .createCart(createShoppingCart)
                .send();

        assertResponseCode(gatewayRequest, 201);
        CreateShoppingCartResp shoppingCart = (CreateShoppingCartResp) gatewayRequest.getSerializedResponse();
        shoppingCartId = String.valueOf(shoppingCart.getId());
    }
}
