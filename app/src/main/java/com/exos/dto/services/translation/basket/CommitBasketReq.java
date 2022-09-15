package com.exos.dto.services.translation.basket;

import com.exos.AbstractHttpSpecification;
import com.exos.Properties;
import com.exos.dto.services.Session;
import com.mashape.unirest.http.HttpMethod;
import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(chain = true)
public class CommitBasketReq extends AbstractHttpSpecification {

    private Integer basketNo;
    private String handle;
    private Session session;

    @Override
    protected HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    protected String getEndpointUrl() {
        return Properties.TRANSLATION_SERVICE_SERVER_HOSTNAME + "api/basket/commit";
    }
}