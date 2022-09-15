package com.exos.services.translation;

import com.exos.BaseTest;
import com.exos.GatewayRequest;
import com.exos.dto.services.translation.products.GetProductsReq;
import com.exos.dto.services.translation.products.GetProductsResp;
import org.testng.annotations.Test;

import static com.exos.helpers.AssertHelper.assertResponseBodyContains;
import static com.exos.helpers.AssertHelper.assertResponseCode;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;


public class TestGetProducts extends BaseTest {

    @Test
    public void test_get_products() {

        GetProductsReq getProductsReq = GetProductsReq.builder()
                .handle("test")
                .build();

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .getProducts(getProductsReq)
                .send();

        assertResponseCode(gatewayRequest, 200);

        GetProductsResp resp = (GetProductsResp) gatewayRequest.getSerializedResponse();
        assertThat(resp.getProductLimitedDetails(),hasSize(2));
        assertResponseBodyContains("groupCode", resp.getProductLimitedDetails().get(0).getGroupCode(), "ACOF");
        assertResponseBodyContains("code", resp.getProductLimitedDetails().get(0).getGroupProducts().get(0).getCode(), "COM104A");
        assertResponseBodyContains("desc", resp.getProductLimitedDetails().get(0).getGroupProducts().get(0).getDesc(), "xJSY Sure 125");
        assertResponseBodyContains("srvCode", resp.getProductLimitedDetails().get(0).getGroupProducts().get(0).getSrvCode(), "GM");
        assertResponseBodyContains("typeCode", resp.getProductLimitedDetails().get(0).getGroupProducts().get(0).getTypeCode(), "CHARGEABLE");
        assertResponseBodyContains("pkg", resp.getProductLimitedDetails().get(0).getGroupProducts().get(0).getPkg(), false);
    }

    @Test(groups = "BUG")
    public void test_empty_request_body() {

        GetProductsReq getProductsReq = GetProductsReq.builder()
                .build();

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .getProducts(getProductsReq)
                .send();

        assertResponseCode(gatewayRequest, 400);

    }
}
