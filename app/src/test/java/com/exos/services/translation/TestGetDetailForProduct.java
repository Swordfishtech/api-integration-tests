package com.exos.services.translation;

import com.exos.BaseTest;
import com.exos.GatewayRequest;
import com.exos.Serializer;
import com.exos.dto.services.ErrorMessage;
import com.exos.dto.services.Session;
import com.exos.dto.services.Attributes;
import com.exos.dto.services.translation.products.GetDetailForProductReq;
import com.exos.dto.services.translation.products.GetDetailForProductResp;
import org.testng.annotations.Test;

import java.util.UUID;

import static com.exos.helpers.AssertHelper.assertResponseBodyContains;
import static com.exos.helpers.AssertHelper.assertResponseCode;

public class TestGetDetailForProduct extends BaseTest {


    @Test
    public void test_valid_tariff_code_returns_correct_product() {

        GetDetailForProductReq request = getDefaultReq();

        GatewayRequest gateway = new GatewayRequest()
                .forService()
                .productsController()
                .getDetailForProduct(request)
                .send();

        assertResponseCode(gateway, 200);
        GetDetailForProductResp resp = (GetDetailForProductResp) gateway.getSerializedResponse();
        assertResponseBodyContains("tarriffCode", resp.getProductDetailItemInfo().getTariffCode(), "GJ1");
    }

    @Test
    public void test_non_existing_tariff_code_does_not_return_product() {

        //todo need to speak to Arpan about this
        GetDetailForProductReq request = getDefaultReq();

        GatewayRequest gateway = new GatewayRequest()
                .forService()
                .productsController()
                .getDetailForProduct(request)
                .send();

        assertResponseCode(gateway, 404);

    }

    public void test_missing_tariff_code_in_request() {

        GetDetailForProductReq request = getDefaultReq();
        request.setTariffCode("");

        GatewayRequest gateway = new GatewayRequest()
                .forService()
                .productsController()
                .getDetailForProduct(request)
                .send();

        assertResponseCode(gateway, 400);

        ErrorMessage err = (ErrorMessage) Serializer.serialize(gateway.getHttpResponse(), ErrorMessage.class);
        assertResponseBodyContains("message", err.getMessage(), "Exception: Input parameters to request are mandatory");
        assertResponseBodyContains("trackingId", err.getTrackingId(), String.format("Session Info: {Login Name: %s, Full Name: %s, Email: %s, Correlation ID: %s, xCorrelation ID: %s}", request.getSession().getLoginName(),
                request.getSession().getFullName(), request.getSession().getEmail(), request.getSession().getCorrelationId(), request.getSession().getXCorrelationId()));
    }

    private GetDetailForProductReq getDefaultReq() {

        return GetDetailForProductReq.builder()
                .handle("handle")
                .session(Session.builder()
                        .correlationId(UUID.randomUUID().toString())
                        .xCorrelationId(UUID.randomUUID().toString())
                        .email("arpan.nandanwar@gmail.com") //todo make this a property?
                        .fullName("arpan nandanwar")
                        .loginName("test")
                        .attributes(Attributes.builder()
                                .additionalProp1("prop1")
                                .additionalProp2("prop2")
                                .additionalProp3("prop3")
                                .build())
                        .build())
                .tariffCode("GJ1")
                .build();
    }
}
