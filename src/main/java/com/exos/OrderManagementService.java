package com.exos;

import com.exos.dto.services.ordermanagement.CreateProductOrderReq;
import com.exos.dto.services.ordermanagement.GetProductOrderReq;
import com.exos.dto.services.ordermanagement.PatchProductOrderReq;
import com.exos.dto.services.ordermanagement.PatchProductOrderResp;

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
        gatewayRequest.setResponseObjectType(null);
        return gatewayRequest;
    }

    public GatewayRequest patchProductOrder(PatchProductOrderReq patchProductOrder) {
        gatewayRequest.setBody(patchProductOrder);
        gatewayRequest.setResponseObjectType(PatchProductOrderResp.class);
        return gatewayRequest;
    }
}
