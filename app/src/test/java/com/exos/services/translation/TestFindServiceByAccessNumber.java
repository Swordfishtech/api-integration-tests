package com.exos.services.translation;

import com.exos.BaseTest;
import com.exos.GatewayRequest;
import com.exos.dto.services.translation.service.FindServiceByAccessNumberReq;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestFindServiceByAccessNumber extends BaseTest {

    @Test
    public void test_find_service_by_access_number() {

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
