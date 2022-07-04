package com.exos.services.service;

import com.exos.AbstractHttpSpecification;
import com.mashape.unirest.http.HttpMethod;
import lombok.Builder;
import lombok.Setter;
import lombok.experimental.Accessors;

@Builder
@Accessors(chain = true)
public class FindServiceByAccessNumberReq extends AbstractHttpSpecification {

    @Setter private String accessNo;
    @Setter private String handle;


    @Override
    protected HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    protected String getEndpointUrl() {
        return "/api/findServiceByAccessNumber";
    }
}
