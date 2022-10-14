package com.exos.services.communication;

import com.exos.BaseTest;
import com.exos.GatewayRequest;
import com.exos.dto.services.communication.SendCommunicationEmailReq;
import com.exos.dto.services.communication.SendCommunicationEmailResp;
import com.exos.helpers.AssertHelper;
import org.testng.annotations.Test;

import static com.exos.helpers.AssertHelper.assertResponseBodyContains;
import static com.exos.helpers.AssertHelper.assertResponseCode;

public class TestSendCommunicationEmail extends BaseTest {


    @Test
    public void test_create_email_template() {

        GatewayRequest request = new GatewayRequest()
                .forService()
                .communicationService()
                .sendCommunicationEmail(SendCommunicationEmailReq.builder()
                        .templateKey("order_rejection")
                        .callingApplication("Order Management")
                        .externalUserId("iosdev424@gmail.com")
                        .senderDetails("test@test.com")
                        .recieverDetails("gurdee@test.com")
                        .inputParameters(SendCommunicationEmailReq.InputParameters.builder()
                                .customerName("Gurdeep")
                                .customerId("test123")
                                .build())
                        .build())
                .send();

        assertResponseCode(request, 200);

        SendCommunicationEmailResp response = (SendCommunicationEmailResp) request.getSerializedResponse();
        assertResponseBodyContains("message", response.getMessage(), "Email Sent Successfully");
    }

    @Test
    public void test_invalid_template_key() {

        GatewayRequest request = new GatewayRequest()
                .forService()
                .communicationService()
                .sendCommunicationEmail(SendCommunicationEmailReq.builder()
                        .templateKey("invalid")
                        .callingApplication("Order Management")
                        .externalUserId("iosdev424@gmail.com")
                        .senderDetails("test@test.com")
                        .recieverDetails("gurdee@test.com")
                        .inputParameters(SendCommunicationEmailReq.InputParameters.builder()
                                .customerName("Gurdeep")
                                .customerId("test123")
                                .build())
                        .build())
                .send();

        assertResponseCode(request, 400);
        SendCommunicationEmailResp response = (SendCommunicationEmailResp) request.getSerializedResponse();
        assertResponseBodyContains("message", response.getMessage(), "Template does not exists with provided key.");
    }

    @Test
    public void test_missing_sender_email() {

        GatewayRequest request = new GatewayRequest()
                .forService()
                .communicationService()
                .sendCommunicationEmail(SendCommunicationEmailReq.builder()
                        .templateKey("invalid")
                        .callingApplication("Order Management")
                        .externalUserId("iosdev424@gmail.com")
                        .recieverDetails("gurdee@test.com")
                        .inputParameters(SendCommunicationEmailReq.InputParameters.builder()
                                .customerName("Gurdeep")
                                .customerId("test123")
                                .build())
                        .build())
                .send();

        assertResponseCode(request, 400);
        SendCommunicationEmailResp response = (SendCommunicationEmailResp) request.getSerializedResponse();
        assertResponseBodyContains("message", response.getMessage(), "Please provide the sender email");
    }

    @Test
    public void test_multiple_receiver_emails_are_accepted() {

        GatewayRequest request = new GatewayRequest()
                .forService()
                .communicationService()
                .sendCommunicationEmail(SendCommunicationEmailReq.builder()
                        .templateKey("order_rejection")
                        .callingApplication("Order Management")
                        .externalUserId("iosdev424@gmail.com")
                        .senderDetails("test@test.com")
                        .recieverDetails("gurdeep@test.com, gurdeep2@test.com")
                        .inputParameters(SendCommunicationEmailReq.InputParameters.builder()
                                .customerName("Gurdeep")
                                .customerId("test123")
                                .build())
                        .build())
                .send();

        assertResponseCode(request, 200);

        SendCommunicationEmailResp response = (SendCommunicationEmailResp) request.getSerializedResponse();
        assertResponseBodyContains("message", response.getMessage(), "Email Sent Successfully");

    }


    @Test
    public void test_missing_receiver_email() {

        GatewayRequest request = new GatewayRequest()
                .forService()
                .communicationService()
                .sendCommunicationEmail(SendCommunicationEmailReq.builder()
                        .templateKey("invalid")
                        .callingApplication("Order Management")
                        .externalUserId("iosdev424@gmail.com")
                        .senderDetails("gurdee@test.com")
                        .inputParameters(SendCommunicationEmailReq.InputParameters.builder()
                                .customerName("Gurdeep")
                                .customerId("test123")
                                .build())
                        .build())
                .send();

        assertResponseCode(request, 400);
        SendCommunicationEmailResp response = (SendCommunicationEmailResp) request.getSerializedResponse();
        assertResponseBodyContains("message", response.getMessage(), "Please provide the reciever email(s)"); //todo spelling mistake in error msg
    }
}
