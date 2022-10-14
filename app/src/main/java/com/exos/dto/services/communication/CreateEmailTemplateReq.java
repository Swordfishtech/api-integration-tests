package com.exos.dto.services.communication;

import com.exos.AbstractHttpSpecification;
import com.exos.Properties;
import com.google.gson.annotations.SerializedName;
import com.mashape.unirest.http.HttpMethod;
import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(chain = true)
public class CreateEmailTemplateReq extends AbstractHttpSpecification {

    private String description;
    private String subject;
    @SerializedName("template_name") private String templateName;
    @SerializedName("html_body") private String htmlBody;


    @Override
    protected HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    protected String getEndpointUrl() {
        return Properties.COMMUNICATION_SERVICE_SERVER_HOSTNAME + "/api/send-communication-email";
    }
}
