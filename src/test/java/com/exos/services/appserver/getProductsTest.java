package com.exos.services.appserver;

import com.aventstack.extentreports.Status;
import com.exos.BaseTest;
import com.exos.GatewayRequest;
import com.exos.services.products.GetProductsReq;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class getProductsTest extends BaseTest {

    @Test
    public void returns_200_OK_response_getProducts() {

        GetProductsReq getProductsReq = GetProductsReq.builder()
                .handle("test")
                .build();

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .getProducts(getProductsReq)
                .send();

        assertThat(gatewayRequest.getHttpResponse().getStatus(), is(200));
        getTestReporter().log(Status.PASS, "Returned 200 OK response");
    }
}
