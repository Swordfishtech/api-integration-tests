package com.exos.services;

import com.exos.BaseTest;
import com.exos.GatewayRequest;
import com.exos.services.service.FindServiceByAccessNumberReq;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class findServiceByAccessNumberTest extends BaseTest {

    @Test
    public void returns_200_OK_response() {

        FindServiceByAccessNumberReq findServiceByAccessNumberReq = FindServiceByAccessNumberReq.builder()
                .accessNo("1")
                .handle("string")
                .build();

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .findServiceByAccessNumber(findServiceByAccessNumberReq)
                .send();

        assertThat(gatewayRequest.getHttpResponse().getStatus(), is(200));

    }
}
