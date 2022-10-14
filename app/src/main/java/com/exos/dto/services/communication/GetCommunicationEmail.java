package com.exos.dto.services.communication;

import com.exos.AbstractHttpSpecification;
import com.exos.Properties;
import com.mashape.unirest.http.HttpMethod;
import lombok.Setter;

public class GetCommunicationEmail extends AbstractHttpSpecification {


    @Setter private transient Integer id;

    @Override
    protected HttpMethod getHttpMethod() {
        return HttpMethod.GET;
    }

    @Override
    protected String getEndpointUrl() {
        return Properties.COMMUNICATION_SERVICE_SERVER_HOSTNAME + "/api/communication-request/" + id;
    }
}
