package com.exos.services.boosterOrchestration;

import com.exos.GatewayRequest;
import com.exos.HttpHeader;
import com.exos.Serializer;
import com.exos.dto.services.boosterorchestration.ServiceValidationErrorResp;
import com.exos.dto.services.boosterorchestration.ServiceValidationReq;
import com.exos.dto.services.boosterorchestration.ServiceValidationResp;
import com.exos.helpers.MandatoryHeaders;
import org.testng.annotations.Test;

import static com.exos.helpers.AssertHelper.*;

public class TestServiceValidation {

    @Test
    public void test_valid_access_number() {

        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(MandatoryHeaders.getHeaders())
                .forService()
                .boosterOrchestrationService()
                .serviceValidation(ServiceValidationReq.builder()
                        .accessNo("07781100506")
                        .build())
                .send();

        assertResponseCode(gatewayRequest, 200);

        ServiceValidationResp response = (ServiceValidationResp) gatewayRequest.getSerializedResponse();

        assertResponseBodyContains("status_code", response.getStatusCode(), 200);
        assertResponseBodyContains("tariffCode", response.getTariffCode(), "G053000");
        assertResponseBodyContains("isPostPaid", response.isPostPaid(), true);
    }

    @Test
    public void test_invalid_access_number() {

        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(MandatoryHeaders.getHeaders())
                .forService()
                .boosterOrchestrationService()
                .serviceValidation(ServiceValidationReq.builder()
                        .accessNo("01111111111")
                        .build())
                .send();

        assertResponseCode(gatewayRequest, 400);

        ServiceValidationErrorResp response = (ServiceValidationErrorResp) Serializer.serialize(gatewayRequest.getHttpResponse(), ServiceValidationErrorResp.class);

        assertResponseBodyContains("status_code", response.getStatusCode(), 200);
        assertResponseBodyContains("tariffCode", response.getMessage(), "Request Failed , Bad request");
    }

    @Test
    public void test_missing_correlation_header() {

        HttpHeader headers = MandatoryHeaders.getHeaders();
        headers.removeHeader("correlation-id");

        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(headers)
                .forService()
                .boosterOrchestrationService()
                .serviceValidation(ServiceValidationReq.builder()
                        .accessNo("07781100506")
                        .build())
                .send();

        assertResponseCode(gatewayRequest, 400);
        assertMissingMandatoryHeadersErrorMessage(gatewayRequest.getHttpResponse());
    }

    @Test
    public void test_missing_x_correlation_header() {

        HttpHeader headers = MandatoryHeaders.getHeaders();
        headers.removeHeader("x-correlation-id");

        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(headers)
                .forService()
                .boosterOrchestrationService()
                .serviceValidation(ServiceValidationReq.builder()
                        .accessNo("07781100506")
                        .build())
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
                .boosterOrchestrationService()
                .serviceValidation(ServiceValidationReq.builder()
                        .accessNo("07781100506")
                        .build())
                .send();

        assertResponseCode(gatewayRequest, 400);
        assertMissingMandatoryHeadersErrorMessage(gatewayRequest.getHttpResponse());
    }

    @Test
    public void test_missing_email_header() {

        HttpHeader headers = MandatoryHeaders.getHeaders();
        headers.removeHeader("email");

        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(headers)
                .forService()
                .boosterOrchestrationService()
                .serviceValidation(ServiceValidationReq.builder()
                        .accessNo("07781100506")
                        .build())
                .send();

        assertResponseCode(gatewayRequest, 400);
        assertMissingMandatoryHeadersErrorMessage(gatewayRequest.getHttpResponse());
    }

    @Test
    public void test_missing_full_name_header() {

        HttpHeader headers = MandatoryHeaders.getHeaders();
        headers.removeHeader("full-name");

        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(headers)
                .forService()
                .boosterOrchestrationService()
                .serviceValidation(ServiceValidationReq.builder()
                        .accessNo("07781100506")
                        .build())
                .send();

        assertResponseCode(gatewayRequest, 400);
        assertMissingMandatoryHeadersErrorMessage(gatewayRequest.getHttpResponse());
    }


}

