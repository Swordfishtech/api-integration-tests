package com.exos.controllers;

<<<<<<<< HEAD:app/src/main/java/com/exos/ProductsController.java
import com.exos.dto.services.productsController.GetDetailForProductReq;
import com.exos.dto.services.productsController.GetDetailForProductResp;
========
import com.exos.GatewayRequest;
import com.exos.dto.services.translation.products.GetDetailForProductReq;
import com.exos.dto.services.translation.products.GetDetailForProductResp;
>>>>>>>> 5ad3d1b (created dockerfile):app/src/main/java/com/exos/controllers/ProductsController.java

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
