package com.exos.services.cartmanagement;

import static org.hamcrest.Matchers.*;

import com.exos.*;
import com.exos.helpers.MandatoryHeaders;
import com.exos.services.cartManagement.CreateShoppingCart;
import com.exos.services.cartManagement.CreateShoppingCartResp;
import com.exos.services.cartManagement.DeleteShoppingCart;
import com.exos.services.cartManagement.GetShoppingCart;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.exos.AssertHelper.assertResponseCode;
import static org.hamcrest.MatcherAssert.assertThat;

public class DeleteCartTest extends BaseTest {


    @Test
    public void delete_cart_returns_200_OK() {

        // create a cart first
        String cartId = createShoppingCart();

        // delete the cart
        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .cartManagement()
                .deleteCart(DeleteShoppingCart.builder()
                        .build()
                        .setCartId(cartId))
                .send();

        assertResponseCode(gatewayRequest, 200);

        // attempt to retrieve the cart
        GatewayRequest getCart = new GatewayRequest()
                .forService()
                .cartManagement()
                .getCart(GetShoppingCart.builder()
                        .cartId(cartId)
                        .build())
                .send();

        assertResponseCode(getCart, 404);

    }

    @Test
    public void deleting_a_cart_using_a_cart_id_that_does_not_exist_returns_404_NotFound() {

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .cartManagement()
                .deleteCart(DeleteShoppingCart.builder()
                        .build()
                        .setCartId("100000"))
                .send();

        assertResponseCode(gatewayRequest, 404);

    }

    @Test(groups = "SURE-283")
    public void deleting_cart_sets_is_deleted_flag_in_database_to_true() {

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
                .forService()
                .cartManagement()
                .getCart(GetShoppingCart.builder()
                        .cartId(cart_id)
                        .build())
                .send();

        assertResponseCode(getCart, 404);

    }

    @Test
    public void empty_email_header_returns_400_BadRequest() {

        HttpHeader headers = MandatoryHeaders.getHeaders();
        headers.addHeader("email", "");

        GatewayRequest getCart = new GatewayRequest()
                .forService()
                .cartManagement()
                .getCart(GetShoppingCart.builder()
                        .cartId("1")
                        .build())
                .send();

        assertResponseCode(getCart, 400);

    }


    private String createShoppingCart() {
        CreateShoppingCart request = (CreateShoppingCart) Serializer.convertJsonStringToObject("CreateCart.json", CreateShoppingCart.class);

        GatewayRequest create = new GatewayRequest()
                .forService()
                .cartManagement()
                .createCart(request)
                .send();

        assertResponseCode(create, 201);
        CreateShoppingCartResp createdCart = (CreateShoppingCartResp) create.getSerializedResponse();
        return String.valueOf(createdCart.getId());
    }

}
