package com.exos;

import com.exos.dto.services.productsController.GetDetailForProductReq;
import com.exos.dto.services.productsController.GetDetailForProductResp;

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
