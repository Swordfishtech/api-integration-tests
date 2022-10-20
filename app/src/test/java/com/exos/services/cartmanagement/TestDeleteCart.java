package com.exos.services.cartmanagement;

import static com.exos.helpers.AssertHelper.*;
import static org.hamcrest.Matchers.*;

import com.exos.*;
import com.exos.helpers.MandatoryHeaders;
import com.exos.dto.services.cartmanagement.*;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.hamcrest.MatcherAssert.assertThat;

public class TestDeleteCart extends BaseTest {


    @Test(groups = "SURE-262")
    public void test_delete_cart() {

        // create a cart first
        String cartId = createShoppingCart();

        // delete the cart
        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(MandatoryHeaders.getHeaders())
                .forService()
                .cartManagement()
                .deleteCart(DeleteShoppingCart.builder()
                        .build()
                        .setCartId(cartId))
                .send();

        assertResponseCode(gatewayRequest, 204);

        // attempt to retrieve the cart
        GatewayRequest getCart = new GatewayRequest()
                .usingHeaders(MandatoryHeaders.getHeaders())
                .forService()
                .cartManagement()
                .getCart(GetShoppingCart.builder()
                        .cartId(cartId)
                        .build())
                .send();

        assertResponseCode(getCart, 404);
    }

    @Test(groups = {"SURE-262","SURE-313-BUG"}, description = "Returning incorrect status code")
    public void test_using_a_cart_id_that_does_not_exist() {

        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(MandatoryHeaders.getHeaders())
                .forService()
                .cartManagement()
                .deleteCart(DeleteShoppingCart.builder()
                        .build()
                        .setCartId("100000"))
                .send();

        assertResponseCode(gatewayRequest, 404);
        GetShoppingCartErrorResp errorMsg = (GetShoppingCartErrorResp) Serializer.serialize(gatewayRequest.getHttpResponse(), GetShoppingCartErrorResp.class);
        assertResponseBodyContains("Detail", errorMsg.getDetail(), "Not found");
        assertResponseBodyContains("Code", errorMsg.getCode(), 400);
        assertResponseBodyContains("Status Code", errorMsg.getStatusCode(), 404);
        assertResponseBodyContains("Reference Error", errorMsg.getReferenceError(), "Detail Not Found");
        assertResponseBodyContains("Reason", errorMsg.getReason(), "No ShoppingCart matches the given query");
        assertResponseBodyContains("Message", errorMsg.getMessage(), "No ShoppingCart matches the given query");

    }

    @Test(groups = "SURE-283-BUG")
    public void test_soft_delete() {

        // create a cart
        String cart_id = createShoppingCart();

        // check soft_delete is set to false
        ResultSet result = SqlQuery.selectAnotherQuery(String.format("SELECT is_deleted FROM public.shopping_cart WHERE id = %s;", cart_id));
        boolean is_deleted = false;

        try {
            result.next();
            is_deleted = result.getBoolean("is_deleted");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        assertThat(is_deleted,is(false));

        // delete a cart
        GatewayRequest delete = new GatewayRequest()
                .usingHeaders(MandatoryHeaders.getHeaders())
                .forService()
                .cartManagement()
                .deleteCart(DeleteShoppingCart.builder()
                        .build()
                        .setCartId(cart_id))
                .send();

        assertResponseCode(delete, 204);

        // check carts soft_deleted in db
        result = SqlQuery.selectAnotherQuery(String.format("SELECT is_deleted FROM public.shopping_cart WHERE id = %s;", cart_id));

        try {
            result.next();
            is_deleted = result.getBoolean("is_deleted");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        assertThat(is_deleted,is(true));

        // check you can't retrieve the cart anymore
        GatewayRequest getCart = new GatewayRequest()
                .usingHeaders(MandatoryHeaders.getHeaders())
                .forService()
                .cartManagement()
                .getCart(GetShoppingCart.builder()
                        .cartId(cart_id)
                        .build())
                .send();

        assertResponseCode(getCart, 404);

    }

    @Test(groups = {"SURE-262"})
    public void test_empty_email_request_header_value() {

        HttpHeader headers = MandatoryHeaders.getHeaders();
        headers.addHeader("email", "");

        String cartId = createShoppingCart();

        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(headers)
                .forService()
                .cartManagement()
                .deleteCart(DeleteShoppingCart.builder()
                        .build()
                        .setCartId(cartId))
                .send();

        assertResponseCode(gatewayRequest, 400);
    }

    @Test
    public void test_missing_full_name_header() {

        HttpHeader headers = MandatoryHeaders.getHeaders();
        headers.removeHeader("full-name");

        String cartId = createShoppingCart();

        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(headers)
                .forService()
                .cartManagement()
                .deleteCart(DeleteShoppingCart.builder()
                        .build()
                        .setCartId(cartId))
                .send();

        assertResponseCode(gatewayRequest, 400);
        assertMissingMandatoryHeadersErrorMessage(gatewayRequest.getHttpResponse());
    }


    private String createShoppingCart() {
        CreateShoppingCart request = (CreateShoppingCart) Serializer.convertJsonStringToObject("CreateCart.json", CreateShoppingCart.class);

        GatewayRequest create = new GatewayRequest()
                .usingHeaders(MandatoryHeaders.getHeaders())
                .forService()
                .cartManagement()
                .createCart(request)
                .send();

        assertResponseCode(create, 201);
        CreateShoppingCartResp createdCart = (CreateShoppingCartResp) create.getSerializedResponse();
        return String.valueOf(createdCart.getId());
    }

}
