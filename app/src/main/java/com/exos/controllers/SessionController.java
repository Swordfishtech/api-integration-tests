package com.exos.controllers;

import com.exos.GatewayRequest;
import com.exos.dto.services.session.SessionResp;
import com.exos.dto.services.session.SessionReq;

public class SessionController {

    private GatewayRequest gatewayRequest;



    public SessionController(GatewayRequest gatewayRequest) {
        this.gatewayRequest = gatewayRequest;
    }

    public GatewayRequest findSessionHandle(SessionReq request) {
        gatewayRequest.setBody(request);
        gatewayRequest.setResponseObjectType(SessionResp.class);
        return gatewayRequest;
    }
}
