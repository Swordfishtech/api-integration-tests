package com.exos.controllers;

import com.exos.GatewayRequest;
import com.exos.dto.services.communication.SendCommunicationEmailReq;
import com.exos.dto.services.communication.GetCommunicationEmail;
import com.exos.dto.services.communication.CreateEmailTemplateReq;
import com.exos.dto.services.communication.SendCommunicationEmailResp;

public class CommunicationService {

    private GatewayRequest gatewayRequest;

    public CommunicationService(GatewayRequest gatewayRequest) {

        this.gatewayRequest = gatewayRequest;
    }

    public GatewayRequest createEmailTemplate(CreateEmailTemplateReq request) {

        gatewayRequest.setBody(request);
        return gatewayRequest;
    }

    public GatewayRequest getCommunicationEmail(GetCommunicationEmail request) {

        gatewayRequest.setBody(request);
        return gatewayRequest;
    }

    public GatewayRequest sendCommunicationEmail(SendCommunicationEmailReq request) {

        gatewayRequest.setBody(request);
        gatewayRequest.setResponseObjectType(SendCommunicationEmailResp.class);
        return gatewayRequest;
    }

}
