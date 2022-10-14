package com.exos.dto.services.ordermanagement;

import com.exos.AbstractHttpSpecification;
import com.exos.Properties;
import com.mashape.unirest.http.HttpMethod;
import lombok.Builder;
import lombok.Setter;
import lombok.experimental.Accessors;

@Builder
@Accessors(chain = true)
public class GetProductOrderReq extends AbstractHttpSpecification {

    @Setter private transient Integer productOrderId;

    @Override
    protected HttpMethod getHttpMethod() {
        return HttpMethod.GET;
    }

    @Override
    protected String getEndpointUrl() {
        return Properties.ORDER_MANAGEMENT_SERVICE_SERVER_HOSTNAME + "/api/product-order/" + productOrderId;
    }
}
