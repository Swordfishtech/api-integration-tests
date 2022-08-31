package com.exos.services.appserver;

import com.exos.BaseTest;
import com.exos.GatewayRequest;
import com.exos.services.login.LoginReq;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class loginTest extends BaseTest {


    @Test
    public void returns_200_OK_response() {

        LoginReq loginReq = LoginReq.builder()
                .username("username")
                .password("password")
                .build();

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .login(loginReq)
                .send();

        assertThat(gatewayRequest.getHttpResponse().getStatus(), is(200));
    }
}
