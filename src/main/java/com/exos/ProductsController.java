package com.exos;

import com.exos.dto.services.productsController.GetDetailForProductReq;
import com.exos.dto.services.productsController.GetDetailForProductResp;
import com.exos.dto.services.sessionController.SessionReq;
import com.exos.dto.services.sessionController.SessionResp;

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
