package com.exos.controllers;

import com.exos.GatewayRequest;
import com.exos.dto.services.boosterorchestration.BoosterValidationReq;
import com.exos.dto.services.boosterorchestration.SendCodeReq;
import com.exos.dto.services.boosterorchestration.ServiceValidationReq;
import com.exos.dto.services.boosterorchestration.ServiceValidationResp;

public class BoosterOrchestrationService {

    private GatewayRequest gatewayRequest;

    public BoosterOrchestrationService(GatewayRequest gatewayRequest) {

        this.gatewayRequest = gatewayRequest;
    }

    public GatewayRequest serviceValidation(ServiceValidationReq request) {

        gatewayRequest.setBody(request);
        gatewayRequest.setResponseObjectType(ServiceValidationResp.class);
        return gatewayRequest;
    }

    public GatewayRequest sendCode(SendCodeReq request) {

        gatewayRequest.setBody(request);
        gatewayRequest.setResponseObjectType(null);
        return gatewayRequest;
    }

    public GatewayRequest validateBooster(BoosterValidationReq request) {

        gatewayRequest.setBody(request);
        gatewayRequest.setResponseObjectType(null);
        return gatewayRequest;
    }





}
