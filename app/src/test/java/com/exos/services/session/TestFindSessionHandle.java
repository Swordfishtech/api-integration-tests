package com.exos.services.session;

import com.exos.BaseTest;
import com.exos.GatewayRequest;
import com.exos.Serializer;
import com.exos.TestData;
import com.exos.dto.services.Attributes;
import com.exos.dto.services.ErrorMessage;
import com.exos.dto.services.session.SessionResp;
import com.exos.dto.services.session.SessionReq;
import org.testng.annotations.Test;

import java.util.UUID;

import static com.exos.helpers.AssertHelper.*;
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
        assertResponseBodyValueIsNotEmptyString("sessionHandle", resp.getSessionHandle());
        assertThat(resp.getAccountNos(), hasSize(2));
        assertThat(resp.getAccountNos(), hasItems(10001010, 10001011));
    }

    @Test
    public void test_user_is_not_allowed_access_to_cerillion() {

        SessionReq session = getDefaultRequestObj();
        session.setEmail(TestData.LIMITED_ACCESS_EMAIL_ADDRESS).setSystemTypeCd("cerillion");

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .sessionController()
                .findSessionHandle(session)
                .send();

        assertResponseCode(gatewayRequest, 502); //todo this needs to be handled better

        ErrorMessage error = (ErrorMessage) Serializer.serialize(gatewayRequest.getHttpResponse(), ErrorMessage.class);
        assertResponseBodyContains("message", error.getMessage(), "Exception:Unauthenticated user");
        assertSessionInfoLogLine(session, error.getTrackingId());

    }

    @Test
    public void test_invalid_systemTypeCd_value() {

        SessionReq session = getDefaultRequestObj();
        session.setSystemTypeCd("ceril");

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .sessionController()
                .findSessionHandle(session)
                .send();

        assertResponseCode(gatewayRequest, 400);

        ErrorMessage error = (ErrorMessage) Serializer.serialize(gatewayRequest.getHttpResponse(), ErrorMessage.class);
        assertResponseBodyContains("message", error.getMessage(), "Invalid SystemTypeCd");
        assertSessionInfoLogLine(session, error.getTrackingId());
    }

    @Test
    public void test_invalid_vault_secret_key() {

        SessionReq session = getDefaultRequestObj();
        session.setEmail(TestData.MISSING_SECRET_VALUE_EMAIL_ADDRESS);

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .sessionController()
                .findSessionHandle(session)
                .send();

        assertResponseCode(gatewayRequest, 400);

        ErrorMessage error = (ErrorMessage) Serializer.serialize(gatewayRequest.getHttpResponse(), ErrorMessage.class);
        assertResponseBodyContains("message", error.getMessage(), "User password not found");
        assertSessionInfoLogLine(session, error.getTrackingId() );
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
        assertResponseBodyValueIsNotEmptyString("sessionHandle", resp.getSessionHandle());
        assertThat(resp.getAccountNos(), is(nullValue()));
    }

    @Test
    public void test_user_is_not_allowed_access_to_zendesk() {

        SessionReq session = getDefaultRequestObj();
        session.setEmail(TestData.LIMITED_ACCESS_EMAIL_ADDRESS).setSystemTypeCd("zendesk");

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .sessionController()
                .findSessionHandle(session)
                .send();

        assertResponseCode(gatewayRequest, 403);

        ErrorMessage error = (ErrorMessage) Serializer.serialize(gatewayRequest.getHttpResponse(), ErrorMessage.class);
        assertResponseBodyContains("message", error.getMessage(), "zendesk access not allowed");
        assertSessionInfoLogLine(session, error.getTrackingId());
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
        assertResponseBodyValueIsNotEmptyString("sessionHandle", resp.getSessionHandle());
        assertThat(resp.getAccountNos(), is(nullValue()));
    }

    @Test
    public void test_user_is_not_allowed_access_to_i3() {

        SessionReq session = getDefaultRequestObj();
        session.setEmail(TestData.LIMITED_ACCESS_EMAIL_ADDRESS).setSystemTypeCd("i3");

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .sessionController()
                .findSessionHandle(session)
                .send();

        assertResponseCode(gatewayRequest, 403);

        ErrorMessage error = (ErrorMessage) Serializer.serialize(gatewayRequest.getHttpResponse(), ErrorMessage.class);
        assertResponseBodyContains("message", error.getMessage(), "i3 access not allowed");
        assertSessionInfoLogLine(session, error.getTrackingId());
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
        assertSessionInfoLogLine(session, error.getTrackingId());
    }




    private SessionReq getDefaultRequestObj() {
        return SessionReq.builder()
                .correlationId(UUID.randomUUID().toString())
                .xCorrelationId(UUID.randomUUID().toString())
                .email(TestData.EMAIL_ADDRESS)
                .loginName(TestData.NAME)
                .fullName("Automation Test")
                .systemTypeCd("cerillion")
                .attributes(Attributes.builder()
                        .additionalProp1("property 1")
                        .additionalProp2("property 2")
                        .additionalProp3("property 3")
                        .build())
                .build();
    }
}
