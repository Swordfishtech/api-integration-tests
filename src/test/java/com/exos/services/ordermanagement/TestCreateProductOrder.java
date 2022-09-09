package com.exos.services.ordermanagement;

import com.exos.*;
import com.exos.dto.services.ordermanagement.CreateProductOrderReq;
import com.exos.helpers.MandatoryHeaders;
import com.exos.dto.services.generic.ErrorMessage;
import org.testng.annotations.*;

import static com.exos.helpers.AssertHelper.assertResponseBodyContains;
import static com.exos.helpers.AssertHelper.assertResponseCode;

public class TestCreateProductOrder extends BaseTest {

    private CreateProductOrderReq request;

    @BeforeMethod(alwaysRun = true)
    public void setupRequest() {
        request = (CreateProductOrderReq) Serializer.convertJsonStringToObject("ProductOrder.json", CreateProductOrderReq.class);
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
        assertResponseBodyContains("Code", error.getCode(), "400");
        assertResponseBodyContains("Reason", error.getReason(), "Error in creating product order");
        assertResponseBodyContains("Status", error.getStatus(), "ERROR");
        assertResponseBodyContains("Message", error.getMessage(), "[{'non_field_errors': [ErrorDetail(string='Agreement with this id already exists', code='invalid')]}, {'non_field_errors': [ErrorDetail(string='Agreement with this id already exists', code='invalid')]}]");
    }

    @Test(groups = {"SURE-148","SURE-314-BUG"}, description = "The error message is too vague and needs rewording")
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
        assertResponseBodyContains("Reason", error.getReason(), "Error in creating product order");
        assertResponseBodyContains("Code", error.getCode(), "400");
        assertResponseBodyContains("Message", error.getMessage(), "id");
        assertResponseBodyContains("Reference Error", error.getReferenceError(), "id");
        assertResponseBodyContains("Status", error.getStatus(), "ERROR");

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
        assertResponseBodyContains("Reason", error.getReason(), "Error in creating product order");
        assertResponseBodyContains("Code", error.getCode(), "400");
        assertResponseBodyContains("Message", error.getMessage(), "{'billing_account': {'id': [ErrorDetail(string='This field may not be blank.', code='blank')]}}");
        assertResponseBodyContains("Reference Error", error.getReferenceError(), "{'billing_account': {'id': [ErrorDetail(string='This field may not be blank.', code='blank')]}}");
        assertResponseBodyContains("Status", error.getStatus(), "ERROR");
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
        validateResponseBody(gatewayRequest);
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
        validateResponseBody(gatewayRequest);

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
        validateResponseBody(gatewayRequest);

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
        validateResponseBody(gatewayRequest);

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
        validateResponseBody(gatewayRequest);

    }

    @AfterMethod(alwaysRun = true)
    public void clearDownDatabase() {

        SqlQuery.clearDownOrderManagementServiceDatabases();
    }

    private void validateResponseBody(GatewayRequest gatewayRequest) {
        //todo this error message should be amended as mentioned in SURE-270
        ErrorMessage error = (ErrorMessage) new Serializer().serialize(gatewayRequest.getHttpResponse(), ErrorMessage.class);
        assertResponseBodyContains("Code", error.getCode(), "400");
        assertResponseBodyContains("Reason", error.getReason(), "Error in creating product order");
        assertResponseBodyContains("Message", error.getMessage(), "Missing mandatory parameters");
        assertResponseBodyContains("Reference Error", error.getReferenceError(), "Missing mandatory parameters");
        assertResponseBodyContains("Status", error.getStatus(), "ERROR");

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
