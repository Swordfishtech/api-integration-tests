package com.exos.controllers;

import com.exos.GatewayRequest;
import com.exos.dto.services.translation.products.GetDetailForProductReq;
import com.exos.dto.services.translation.products.GetDetailForProductResp;

public class ProductsController {

    private GatewayRequest gatewayRequest;



    public ProductsController(GatewayRequest gatewayRequest) {
        this.gatewayRequest = gatewayRequest;
    }

    public GatewayRequest getDetailForProduct(GetDetailForProductReq request) {
        gatewayRequest.setBody(request);
        gatewayRequest.setResponseObjectType(GetDetailForProductResp.class);
        return gatewayRequest;
    }
}
