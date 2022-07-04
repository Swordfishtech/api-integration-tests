package com.exos;

import com.exos.services.cartManagement.*;

public class CartManagementService {

    private GatewayRequest gatewayRequest;


    public CartManagementService(GatewayRequest gatewayRequest) {

        this.gatewayRequest = gatewayRequest;
    }

    public GatewayRequest createCart(CreateShoppingCart createCart) {
        gatewayRequest.setBody(createCart);
        gatewayRequest.setResponseObjectType(CreateShoppingCartResp.class);
        return gatewayRequest;
    }

    public GatewayRequest deleteCart(DeleteShoppingCart deleteCart) {
        gatewayRequest.setBody(deleteCart);
        gatewayRequest.setResponseObjectType(null);
        return gatewayRequest;
    }

    public GatewayRequest getCart(GetShoppingCart getCart) {
        gatewayRequest.setBody(getCart);
        gatewayRequest.setResponseObjectType(null);
        return gatewayRequest;
    }

}

