package com.exos.dto.services.translation.products;

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
    @Getter private Session session;
    private String tariffCode;

    @Override
    protected HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    protected String getEndpointUrl() {
        return Properties.TRANSLATION_SERVICE_SERVER_HOSTNAME + "/api/products/detail";
    }
}
