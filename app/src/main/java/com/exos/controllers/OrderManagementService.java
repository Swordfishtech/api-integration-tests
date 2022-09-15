package com.exos.controllers;

import com.exos.GatewayRequest;
import com.exos.dto.services.ordermanagement.*;

public class OrderManagementService {

    private GatewayRequest gatewayRequest;


    public OrderManagementService(GatewayRequest gatewayRequest) {

        this.gatewayRequest = gatewayRequest;
    }

    public GatewayRequest createProductOrder(CreateProductOrderReq createProductOrderReq) {
        gatewayRequest.setBody(createProductOrderReq);
        gatewayRequest.setResponseObjectType(null);
        return gatewayRequest;
    }

    public GatewayRequest getProductOrder(GetProductOrderReq getProductOrder) {
        gatewayRequest.setBody(getProductOrder);
        gatewayRequest.setResponseObjectType(GetProductOrderResp.class);
        return gatewayRequest;
    }

    public GatewayRequest patchProductOrder(PatchProductOrderReq patchProductOrder) {
        gatewayRequest.setBody(patchProductOrder);
        gatewayRequest.setResponseObjectType(PatchProductOrderResp.class);
        return gatewayRequest;
    }
}
