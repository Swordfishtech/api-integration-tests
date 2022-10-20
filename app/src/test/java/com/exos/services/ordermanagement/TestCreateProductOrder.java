package com.exos.services.ordermanagement;

import com.exos.*;
import com.exos.dto.services.ordermanagement.CreateProductOrderReq;
import com.exos.helpers.MandatoryHeaders;
import com.exos.dto.services.generic.ErrorMessage;
import org.testng.annotations.*;

import static com.exos.helpers.AssertHelper.*;

public class TestCreateProductOrder extends BaseTest {

    private CreateProductOrderReq request;

    @BeforeMethod(alwaysRun = true)
    public void setupRequest() {
        request = (CreateProductOrderReq) Serializer.convertJsonStringToObject("templates/ProductOrder.json", CreateProductOrderReq.class);
    }

    @Test(groups = "SURE-148")
    public void test_create_product_order() {

        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(MandatoryHeaders.getHeaders())
                .forService()
                .orderManagement()
                .createProductOrder(request)
                .send();

        assertResponseCode(gatewayRequest, 201);
    }

    @Test(groups = "SURE-148")
    public void test_create_product_order_using_existing_id(){

        // Create an order
        createOrder();

        // try to create the same order again
        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(MandatoryHeaders.getHeaders())
                .forService()
                .orderManagement()
                .createProductOrder(request)
                .send();

        assertResponseCode(gatewayRequest, 400);

        ErrorMessage error = (ErrorMessage) new Serializer().serialize(gatewayRequest.getHttpResponse(), ErrorMessage.class);
        assertResponseBodyContains("Code", String.valueOf(error.getCode()), "400"); //todo this shouldn't be a string
        assertResponseBodyContains("Reason", error.getReason(), "agreement with this id already exists");
        assertResponseBodyContains("Status", String.valueOf(error.getStatus()), "400 Bad Request"); //todo this shouldn't be a string
        assertResponseBodyContains("Reference Error", error.getReferenceError(), "agreement with this id already exists");
        assertResponseBodyContains("Message", error.getMessage(), "Unable to create product order");
    }

    @Test(groups = {"SURE-148"})
    public void test_missing_mandatory_fields_in_request_body() {

        request.billingAccount.id = null;

        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(MandatoryHeaders.getHeaders())
                .forService()
                .orderManagement()
                .createProductOrder(request)
                .send();

        assertResponseCode(gatewayRequest, 400);

        ErrorMessage error = (ErrorMessage) Serializer.serialize(gatewayRequest.getHttpResponse(), ErrorMessage.class);
        assertResponseBodyContains("Reason", error.getReason(), "{'billing_account': {'id': [ErrorDetail(string='id is required in billingAccount', code='required')]}}");
        assertResponseBodyContains("Code", String.valueOf(error.getCode()), "400"); //todo shouldn't be a string
        assertResponseBodyContains("Message", error.getMessage(), "Unable to create product order");
        assertResponseBodyContains("Reference Error", error.getReferenceError(), "{'billing_account': {'id': [ErrorDetail(string='id is required in billingAccount', code='required')]}}");
        assertResponseBodyContains("Status", String.valueOf(error.getCode()), "400 Bad Request"); //todo shouldn't be a string

    }

    @Test(groups = "SURE-148")
    public void test_no_value_in_mandatory_request_body_field() {

        request.billingAccount.id = "";

        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(MandatoryHeaders.getHeaders())
                .forService()
                .orderManagement()
                .createProductOrder(request)
                .send();

        assertResponseCode(gatewayRequest, 400);

        ErrorMessage error = (ErrorMessage) Serializer.serialize(gatewayRequest.getHttpResponse(), ErrorMessage.class);
        assertResponseBodyContains("Reason", error.getReason(), "{'billing_account': {'id': [ErrorDetail(string='This field may not be blank.', code='blank')]}}");
        assertResponseBodyContains("Code", String.valueOf(error.getCode()), "400"); //todo shouldn't be a string
        assertResponseBodyContains("Message", error.getMessage(), "Unable to create product order");
        assertResponseBodyContains("Reference Error", error.getReferenceError(), "{'billing_account': {'id': [ErrorDetail(string='This field may not be blank.', code='blank')]}}");
        assertResponseBodyContains("Status", String.valueOf(error.getCode()), "400 Bad Request"); //todo shouldn't be a string
    }

    @Test(groups = "SURE-270")
    public void test_empty_correlation_id_header_value() {

        HttpHeader headers = MandatoryHeaders.getHeaders();
        headers.addHeader("correlation-id", "");

        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(headers)
                .forService()
                .orderManagement()
                .createProductOrder(request)
                .send();

        assertResponseCode(gatewayRequest, 400);
        assertMissingMandatoryHeadersErrorMessage(gatewayRequest.getHttpResponse());
    }

    @Test(groups = "SURE-270")
    public void test_empty_x_correlation_id_header_value() {

        HttpHeader headers = MandatoryHeaders.getHeaders();
        headers.addHeader("x-correlation-id", "");

        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(headers)
                .forService()
                .orderManagement()
                .createProductOrder(request)
                .send();

        assertResponseCode(gatewayRequest, 400);
        assertMissingMandatoryHeadersErrorMessage(gatewayRequest.getHttpResponse());

    }

    @Test(groups = "SURE-270")
    public void test_empty_login_name_header_value() {

        HttpHeader headers = MandatoryHeaders.getHeaders();
        headers.addHeader("login-name", "");

        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(headers)
                .forService()
                .orderManagement()
                .createProductOrder(request)
                .send();

        assertResponseCode(gatewayRequest, 400);
        assertMissingMandatoryHeadersErrorMessage(gatewayRequest.getHttpResponse());

    }

    @Test(groups = "SURE-270")
    public void test_empty_email_header_value() {

        HttpHeader headers = MandatoryHeaders.getHeaders();
        headers.addHeader("email", "");

        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(headers)
                .forService()
                .orderManagement()
                .createProductOrder(request)
                .send();

        assertResponseCode(gatewayRequest, 400);
        assertMissingMandatoryHeadersErrorMessage(gatewayRequest.getHttpResponse());

    }

    @Test(groups = "SURE-270")
    public void test_empty_full_name_header_value() {

        HttpHeader headers = MandatoryHeaders.getHeaders();
        headers.addHeader("full-name", "");

        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(headers)
                .forService()
                .orderManagement()
                .createProductOrder(request)
                .send();

        assertResponseCode(gatewayRequest, 400);
        assertMissingMandatoryHeadersErrorMessage(gatewayRequest.getHttpResponse());

    }

    @BeforeMethod(alwaysRun = true)
    public void clearDownDatabase() {

        SqlQuery.clearDownOrderManagementServiceDatabases();
    }

    private void createOrder() {

        GatewayRequest createOrder = new GatewayRequest()
                .usingHeaders(MandatoryHeaders.getHeaders())
                .forService()
                .orderManagement()
                .createProductOrder(request)
                .send();
    }
}
