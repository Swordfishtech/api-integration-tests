package com.exos.dto.services.session;

import com.exos.AbstractHttpSpecification;
import com.exos.Properties;
import com.exos.dto.services.Attributes;
import com.mashape.unirest.http.HttpMethod;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Builder
@Accessors(chain = true)
@Getter
@Setter
public class SessionReq extends AbstractHttpSpecification {

    private Attributes attributes;
    private String correlationId;
    private String email;
    private String fullName;
    private String loginName;
    private String systemTypeCd;
    private String xCorrelationId;

    @Override
    protected HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    protected String getEndpointUrl() {
        return Properties.SESSION_SERVICE_SERVER_HOSTNAME + "/session";
    }
}
