package com.exos.services.appserver;

import com.exos.BaseTest;
import com.exos.GatewayRequest;
import com.exos.dto.services.Session;
import com.exos.dto.services.Attributes;
import com.exos.dto.services.productsController.GetDetailForProductReq;
import com.exos.dto.services.productsController.GetDetailForProductResp;
import com.exos.helpers.AssertHelper;
import org.testng.annotations.Test;

import java.util.UUID;

public class TestGetDetailForProduct extends BaseTest {


    @Test
    public void test_returns_correct_product() {

        GetDetailForProductReq request = getDefaultReq();

        GatewayRequest gateway = new GatewayRequest()
                .forService()
                .productsController()
                .getDetailForProduct(request)
                .send();

        AssertHelper.assertResponseCode(gateway, 200);
        GetDetailForProductResp resp = (GetDetailForProductResp) gateway.getSerializedResponse();
        AssertHelper.assertResponseBodyContains("tarriffCode", resp.getProductDetailItemInfo().getTariffCode(), "GJ1");
    }

    public void test_missing_tariff_code_in_request() {

        GetDetailForProductReq request = getDefaultReq();
        request.setTariffCode("");

        GatewayRequest gateway = new GatewayRequest()
                .forService()
                .productsController()
                .getDetailForProduct(request)
                .send();

        AssertHelper.assertResponseCode(gateway, 400);



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
