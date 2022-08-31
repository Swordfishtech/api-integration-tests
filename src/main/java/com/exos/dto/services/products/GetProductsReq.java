package com.exos.dto.services.products;

import com.exos.AbstractHttpSpecification;
import com.exos.Properties;
import com.mashape.unirest.http.HttpMethod;
import lombok.Builder;
import lombok.Setter;
import lombok.experimental.Accessors;

@Builder
@Accessors(chain = true)
public class GetProductsReq extends AbstractHttpSpecification {

    @Setter private String handle;

    @Override
    protected HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    protected String getEndpointUrl() {
        return Properties.APP_SERVER_HOSTNAME + "/api/products/list";
    }
}
