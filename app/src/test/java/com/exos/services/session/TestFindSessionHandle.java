package com.exos.services.session;

import com.exos.BaseTest;
import com.exos.GatewayRequest;
import com.exos.Serializer;
import com.exos.dto.services.Attributes;
import com.exos.dto.services.ErrorMessage;
import com.exos.dto.services.sessionController.SessionResp;
import com.exos.dto.services.sessionController.SessionReq;
import org.testng.annotations.Test;

import java.util.UUID;

import static com.exos.helpers.AssertHelper.assertResponseBodyContains;
import static com.exos.helpers.AssertHelper.assertResponseCode;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestFindSessionHandle extends BaseTest {


    @Test
    public void test_user_is_allowed_access_to_cerillion() {

        SessionReq session = getDefaultRequestObj();

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .sessionController()
                .findSessionHandle(session)
                .send();

        assertResponseCode(gatewayRequest, 200);

        SessionResp resp = (SessionResp) gatewayRequest.getSerializedResponse();
        assertResponseBodyContains("systemTypeCd", resp.getSystemTypeCd(), "cerillion");
        assertResponseBodyContains("sessionHandle", resp.getSessionHandle(), "cidgurde");
        assertThat(resp.getAccountNos(), hasSize(2));
        assertThat(resp.getAccountNos(), hasItems(10001010, 10001011));
    }

    @Test
    public void test_invalid_systemTypeCd_cerillion() {

        SessionReq session = getDefaultRequestObj();
        session.setSystemTypeCd("ceril"); //todo bug, this should not case sensitive surely?, it doesn't like ZENDESK, CERILLION

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .sessionController()
                .findSessionHandle(session)
                .send();

        assertResponseCode(gatewayRequest, 400);

        ErrorMessage error = (ErrorMessage) Serializer.serialize(gatewayRequest.getHttpResponse(), ErrorMessage.class);
        assertResponseBodyContains("message", error.getMessage(), "Invalid SystemTypeCd");
        assertResponseBodyContains("trackingId", error.getTrackingId(), getExpectedTrackingIdMsg(session));
    }

    @Test
    public void test_invalid_vault_secret_key() {

        SessionReq session = getDefaultRequestObj();
        session.setEmail("arpan.nandanwar1@gmail.com");

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .sessionController()
                .findSessionHandle(session)
                .send();

        assertResponseCode(gatewayRequest, 404); //todo or should this be a 400 bad request

        ErrorMessage error = (ErrorMessage) Serializer.serialize(gatewayRequest.getHttpResponse(), ErrorMessage.class);
        assertResponseBodyContains("message", error.getMessage(), "user linked password not available in vault");
        assertResponseBodyContains("trackingId", error.getTrackingId(), "Session Info: {Login Name: test, Full Name: test, Email: arpan.nandanwar1@gmail.com, Correlation ID: string, xCorrelation ID: 123, ");
    }

    @Test
    public void test_user_is_allowed_access_to_zendesk() {

        SessionReq session = getDefaultRequestObj();
        session.setSystemTypeCd("zendesk");

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .sessionController()
                .findSessionHandle(session)
                .send();

        assertResponseCode(gatewayRequest, 200);
        SessionResp resp = (SessionResp) gatewayRequest.getSerializedResponse();
        assertResponseBodyContains("systemTypeCd", resp.getSystemTypeCd(), "zendesk");
        assertResponseBodyContains("sessionHandle", resp.getSessionHandle(), "Basic YXJwYW43ODYxNEBnbWFpbC5jb20vdG9rZW46MG1ZMnZmOGNVRXRRaFNiZTUxOEhBem9kVjdPbjRMbUhIQm1xWUpoWQ==");
        assertThat(resp.getAccountNos(), is(nullValue()));
    }

    @Test
    public void test_user_is_not_allowed_access_to_zendesk() {

        SessionReq session = getDefaultRequestObj();
        session.setEmail("arpan.nandanwar2@gmail.com").setSystemTypeCd("zendesk");

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .sessionController()
                .findSessionHandle(session)
                .send();

        assertResponseCode(gatewayRequest, 403);

        ErrorMessage error = (ErrorMessage) Serializer.serialize(gatewayRequest.getHttpResponse(), ErrorMessage.class);
        assertResponseBodyContains("message", error.getMessage(), "zendesk access not allowed");
        assertResponseBodyContains("trackingId", error.getTrackingId(), getExpectedTrackingIdMsg(session));
    }

    @Test
    public void test_user_is_allowed_access_to_i3() {

        SessionReq session = getDefaultRequestObj();
        session.setSystemTypeCd("i3");

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .sessionController()
                .findSessionHandle(session)
                .send();

        assertResponseCode(gatewayRequest, 200);

        assertResponseCode(gatewayRequest, 200);
        SessionResp resp = (SessionResp) gatewayRequest.getSerializedResponse();
        assertResponseBodyContains("systemTypeCd", resp.getSystemTypeCd(), "i3");
        assertResponseBodyContains("sessionHandle", resp.getSessionHandle(), "i3test");
        assertThat(resp.getAccountNos(), is(nullValue()));
    }

    @Test
    public void test_user_is_not_allowed_access_to_i3() {

        SessionReq session = getDefaultRequestObj();
        session.setEmail("arpan.nandanwar2@gmail.com").setSystemTypeCd("i3");

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .sessionController()
                .findSessionHandle(session)
                .send();

        assertResponseCode(gatewayRequest, 403);

        ErrorMessage error = (ErrorMessage) Serializer.serialize(gatewayRequest.getHttpResponse(), ErrorMessage.class);
        assertResponseBodyContains("message", error.getMessage(), "i3 access not allowed");
        assertResponseBodyContains("trackingId", error.getTrackingId(), getExpectedTrackingIdMsg(session));
    }

    @Test
    public void test_unrecognised_email() {

        SessionReq session = getDefaultRequestObj();
        session.setEmail("test@gmail.com");

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .sessionController()
                .findSessionHandle(session)
                .send();

        assertResponseCode(gatewayRequest, 400);

        ErrorMessage error = (ErrorMessage) Serializer.serialize(gatewayRequest.getHttpResponse(), ErrorMessage.class);
        assertResponseBodyContains("message", error.getMessage(), "User not found");
        assertResponseBodyContains("trackingId", error.getTrackingId(), getExpectedTrackingIdMsg(session));
    }




    private SessionReq getDefaultRequestObj() {
        return SessionReq.builder()
                .correlationId(UUID.randomUUID().toString())
                .xCorrelationId(UUID.randomUUID().toString())
                .email("arpan.nandanwar@gmail.com")
                .loginName("arpan")
                .fullName("arpan nandanwar")
                .systemTypeCd("cerillion")
                .attributes(Attributes.builder()
                        .additionalProp1("property 1")
                        .additionalProp2("property 2")
                        .additionalProp3("property 3")
                        .build())
                .build();
    }

    private String getExpectedTrackingIdMsg(SessionReq request) {

        return String.format("Session Info: {Login Name: %s, Full Name: %s, Email: %s, Correlation ID: %s, xCorrelation ID: %s}",
                request.getLoginName(), request.getFullName(), request.getEmail(), request.getCorrelationId(), request.getXCorrelationId());
    }
}
