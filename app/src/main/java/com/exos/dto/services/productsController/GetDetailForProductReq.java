package com.exos.dto.services.productsController;

import com.exos.AbstractHttpSpecification;
import com.exos.Properties;
import com.exos.dto.services.Session;
import com.mashape.unirest.http.HttpMethod;
import lombok.Builder;
import lombok.Setter;
import lombok.experimental.Accessors;

@Builder
@Accessors(chain = true)
@Setter
public class GetDetailForProductReq extends AbstractHttpSpecification {

    private String handle;
    private Session session;
    private String tariffCode;

    @Override
    protected HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    protected String getEndpointUrl() {
        return Properties.APP_SERVER_HOSTNAME + "/api/products/detail";
    }
}
