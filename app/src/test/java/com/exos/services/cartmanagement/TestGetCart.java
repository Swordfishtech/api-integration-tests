package com.exos.services.cartmanagement;

  import com.aventstack.extentreports.Status;
  import com.exos.BaseTest;
import com.exos.GatewayRequest;
import com.exos.HttpHeader;
import com.exos.Serializer;
import com.exos.helpers.MandatoryHeaders;
import com.exos.dto.services.cartmanagement.*;
import com.exos.dto.services.generic.ErrorMessage;
import org.testng.annotations.Test;

  import static com.exos.helpers.AssertHelper.*;

public class TestGetCart extends BaseTest {


    @Test(groups = {"SURE-262"})
    public void test_using_valid_cart_id() {

        String shoppingCartId = createShoppingCart();

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .cartManagement()
                .getCart(GetShoppingCart.builder().cartId(shoppingCartId).build())
                .send();

        GetShoppingCartResp getCart = (GetShoppingCartResp) gatewayRequest.getSerializedResponse();
        assertResponseCode(gatewayRequest, 200);
        assertResponseBodyContains("id", getCart.getId(), Integer.valueOf(shoppingCartId));

        //todo need to verify extra parts of the response body after discussion with developer as there are issues in the response body
    }

    @Test(groups = {"SURE-262", "SURE-312-BUG"})
    public void test_using_cart_id_that_does_not_exist() {

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .cartManagement()
                .getCart(GetShoppingCart.builder().cartId("100000").build())
                .send();

        assertResponseCode(gatewayRequest, 404);
        GetShoppingCartErrorResp error = (GetShoppingCartErrorResp) Serializer.serialize(gatewayRequest.getHttpResponse(), GetShoppingCartErrorResp.class);
        assertResponseBodyContains("Code", error.getCode(), 404);
        assertResponseBodyContains("Status Code", error.getStatusCode(), 404);
        assertResponseBodyContains("Reference Error", error.getReferenceError(), "Detail Not Found");
        assertResponseBodyContains("Detail", error.getDetail(), "Not found");
        assertResponseBodyContains("Reason", error.getReason(), "No ShoppingCart matches the given query");
        assertResponseBodyContains("Message", error.getMessage(), "No ShoppingCart matches the given query");
    }

    @Test(groups = {"SURE-262", "SURE-312-BUG"})
    public void test_using_a_null_cart_id_value() {

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .cartManagement()
                .getCart(GetShoppingCart.builder().cartId("null").build())
                .send();

        assertResponseCode(gatewayRequest, 404);
        GetShoppingCartErrorResp error = (GetShoppingCartErrorResp) Serializer.serialize(gatewayRequest.getHttpResponse(), GetShoppingCartErrorResp.class);
        assertResponseBodyContains("Detail", error.getDetail(), "Not found");
        assertResponseBodyContains("Code", error.getCode(), 404);
        assertResponseBodyContains("Status Code", error.getStatusCode(), 404);
        assertResponseBodyContains("Reference Error", error.getReferenceError(), "Detail Not Found");
        assertResponseBodyContains("Reason", error.getReason(), "Please provide valid ID");
        assertResponseBodyContains("Message", error.getMessage(), "Please provide valid ID");
    }

    @Test(groups = {"SURE-262"})
    public void test_not_providing_a_cart_id() {

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .cartManagement()
                .getCart(GetShoppingCart.builder().build())
                .send();

        assertResponseCode(gatewayRequest, 400);
        assertMissingMandatoryHeadersErrorMessage(gatewayRequest.getHttpResponse());
    }

    @Test(groups = {"SURE-262","SURE-311-BUG"})
    public void test_using_an_invalid_cart_id() {

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .cartManagement()
                .getCart(GetShoppingCart.builder().cartId("aaa").build())
                .send();

        assertResponseCode(gatewayRequest, 400);
        assertMissingMandatoryHeadersErrorMessage(gatewayRequest.getHttpResponse());

    }

    @Test(groups = "SURE-273-BUG")
    public void test_empty_x_correlation_id_request_header_value() {

        HttpHeader headers = MandatoryHeaders.getHeaders();
        headers.addHeader("x-correlation-id", "");

        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(headers)
                .forService()
                .cartManagement()
                .getCart(GetShoppingCart.builder().cartId("1").build())
                .send();

        assertResponseCode(gatewayRequest, 400);
        assertMissingMandatoryHeadersErrorMessage(gatewayRequest.getHttpResponse());


    }

    @Test(groups = "SURE-273-BUG")
    public void test_empty_login_name_request_header_value() {

        HttpHeader headers = MandatoryHeaders.getHeaders();
        headers.addHeader("login-name", "");

        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(headers)
                .forService()
                .cartManagement()
                .getCart(GetShoppingCart.builder().cartId("1").build())
                .send();

        assertResponseCode(gatewayRequest, 400);
        assertMissingMandatoryHeadersErrorMessage(gatewayRequest.getHttpResponse());
    }

    @Test
    public void test_missing_login_name_header() {

        HttpHeader headers = MandatoryHeaders.getHeaders();
        headers.removeHeader("login-name");

        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(headers)
                .forService()
                .cartManagement()
                .getCart(GetShoppingCart.builder().cartId("1").build())
                .send();

        assertResponseCode(gatewayRequest, 400);
        ErrorMessage errorMsg = (ErrorMessage) Serializer.serialize(gatewayRequest.getHttpResponse(), ErrorMessage.class);
        assertMissingMandatoryHeadersErrorMessage(gatewayRequest.getHttpResponse());
    }

    @Test
    public void test_missing_email_header() {

        HttpHeader headers = MandatoryHeaders.getHeaders();
        headers.removeHeader("email");

        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(headers)
                .forService()
                .cartManagement()
                .getCart(GetShoppingCart.builder().cartId("1").build())
                .send();

        assertResponseCode(gatewayRequest, 400);
        assertMissingMandatoryHeadersErrorMessage(gatewayRequest.getHttpResponse());
    }

    private String createShoppingCart() {

        getTestReporter().log(Status.INFO, "Creating test data");
        CreateShoppingCart createShoppingCart = (CreateShoppingCart) Serializer.convertJsonStringToObject("CreateCart.json", CreateShoppingCart.class);

        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(MandatoryHeaders.getHeaders())
                .forService()
                .cartManagement()
                .createCart(createShoppingCart)
                .send();

        assertResponseCode(gatewayRequest, 201);
        CreateShoppingCartResp shoppingCart = (CreateShoppingCartResp) gatewayRequest.getSerializedResponse();
        return String.valueOf(shoppingCart.getId());
    }
}
