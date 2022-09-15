package com.exos.dto.services.boosterorchestration;

import com.exos.AbstractHttpSpecification;
import com.exos.Properties;
import com.google.gson.annotations.SerializedName;
import com.mashape.unirest.http.HttpMethod;
import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(chain = true)
public class SendCodeReq extends AbstractHttpSpecification {


    @SerializedName("mobile_number") private String mobileNumber;

    @Override
    protected HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    protected String getEndpointUrl() {
        return Properties.BOOSTER_ORCHESTRATION_SERVICE_SERVER_HOSTNAME + "/api/sendCode";
    }
}
