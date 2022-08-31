package com.exos.services.ordermanagement;

import com.exos.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.HashMap;

import static com.exos.AssertHelper.assertResponseCode;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CreateProductOrderTest extends BaseTest {

    private CreateProductOrderReq request;


    @BeforeTest
    public void setup() {
        request = (CreateProductOrderReq) Serializer.convertJsonStringToObject("ProductOrder.json", CreateProductOrderReq.class);
    }

    @Test
    public void returns_201_created() {

        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(getDefaultHeaders())
                .forService()
                .orderManagement()
                .createProductOrder(request)
                .send();

        assertResponseCode(gatewayRequest, 201);
    }

    @Test
    public void create_order_using_existing_id_returns_400_bad_request(){

        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(getDefaultHeaders())
                .forService()
                .orderManagement()
                .createProductOrder(request)
                .send();

        assertResponseCode(gatewayRequest, 400);
        ProductOrderInvalidRequestResp error = (ProductOrderInvalidRequestResp) new Serializer().serialize(gatewayRequest.getHttpResponse(), ProductOrderInvalidRequestResp.class);
        assertThat(error.getCode(), is(400));
        assertThat(error.getReason(), is("Error in creating product order"));
        assertThat(error.getStatus(), is("ERROR"));
        //todo does this need to be changed?
        assertThat(error.getMessage(), is("[{'non_field_errors': [ErrorDetail(string='Agreement with this id already exists', code='invalid')]}, {'non_field_errors': [ErrorDetail(string='Agreement with this id already exists', code='invalid')]}]"));

    }

    @Test
    public void missing_mandatory_fields_in_request_body_returns_400_bad_request() {

        request.billingAccount.id = null;

        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(getDefaultHeaders())
                .forService()
                .orderManagement()
                .createProductOrder(request)
                .send();

        assertResponseCode(gatewayRequest, 400);
        //todo validate message which is  -> 'id'

    }

    public void no_value_in_mandatory_fields_in_request_body_returns_400_bad_request() {

        request.billingAccount.id = "";

        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(getDefaultHeaders())
                .forService()
                .orderManagement()
                .createProductOrder(request)
                .send();

        assertResponseCode(gatewayRequest, 400);
        //todo validate message which is  -> {'billing_account': {'id': [ErrorDetail(string='This field may not be blank.', code='blank')]}}

    }

    @Test
    public void empty_mandatory_header_correlation_id_value_should_return_400_bad_request() {

        HttpHeader headers = getDefaultHeaders();
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

    @Test
    public void empty_mandatory_header_x_correlation_id_value_should_return_400_bad_request() {

        HttpHeader headers = getDefaultHeaders();
        headers.addHeader("x_correlation-id", "");

        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(headers)
                .forService()
                .orderManagement()
                .createProductOrder(request)
                .send();

        assertResponseCode(gatewayRequest, 400);
        validateResponseBody(gatewayRequest);

    }

    @Test
    public void empty_mandatory_header_login_name_value_should_return_400_bad_request() {

        HttpHeader headers = getDefaultHeaders();
        headers.addHeader("login_name", "");

        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(headers)
                .forService()
                .orderManagement()
                .createProductOrder(request)
                .send();

        assertResponseCode(gatewayRequest, 400);
        validateResponseBody(gatewayRequest);

    }

    @Test
    public void empty_mandatory_header_email_value_should_return_400_bad_request() {

        HttpHeader headers = getDefaultHeaders();
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

    @Test
    public void empty_mandatory_header_full_name_value_should_return_400_bad_request() {

        HttpHeader headers = getDefaultHeaders();
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

    @AfterTest
    public void clearDownDatabase() {
        SqlQuery.clearDownOrderManagementServiceDatabases();
    }

    private HttpHeader getDefaultHeaders() {
        //todo should this be moved out of here
        HttpHeader headers = new HttpHeader();
        HashMap<String, String> map = new HashMap<>();
        map.put("correlation-id", "3177be48-59a7-4889-9025-e5232b0fef8e");
        map.put("x-correlation-id", "3177be48-59a7-4889-9025-e5232b0fef8e");
        map.put("login-name", "Dora12");
        map.put("email", "nimish.nagapure@swordfishtech.co.uk");
        map.put("full-name", "test");
        headers.setHeaders(map);
        return headers;
    }

    private void validateResponseBody(GatewayRequest gatewayRequest) {
        //todo this error message should be amended as mentioned in SURE-270
        ProductOrderInvalidRequestResp error = (ProductOrderInvalidRequestResp) new Serializer().serialize(gatewayRequest.getHttpResponse(), ProductOrderInvalidRequestResp.class);
        assertThat(error.getCode(), is(400));
        assertThat(error.getReason(), is("Error in creating product order"));
        assertThat(error.getStatus(), is("ERROR"));
        assertThat(error.getMessage(), is("Missing mandatory parameters"));
    }
}
