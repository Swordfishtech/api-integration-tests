package com.exos;

import com.exos.dto.services.sessionController.SessionResp;
import com.exos.dto.services.sessionController.SessionReq;

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
