package com.exos.services.login;

import com.exos.AbstractHttpSpecification;
import com.mashape.unirest.http.HttpMethod;
import lombok.Builder;
import lombok.Setter;
import lombok.experimental.Accessors;

@Builder
@Accessors(chain = true)
public class LoginReq extends AbstractHttpSpecification {

    @Setter private String password;
    @Setter private String username;

    @Override
    protected HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    protected String getEndpointUrl() {
        return "/api/login";
    }
}
