package com.exos.dto.services.boosterorchestration;

import com.exos.AbstractHttpSpecification;
import com.exos.Properties;
import com.mashape.unirest.http.HttpMethod;
import lombok.Builder;
import lombok.Setter;
import lombok.experimental.Accessors;

@Builder
@Accessors(chain = true)
public class ServiceValidationReq extends AbstractHttpSpecification {

    @Setter
    private String accessNo;

    @Override
    protected HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    protected String getEndpointUrl() {
        return Properties.BOOSTER_ORCHESTRATION_SERVICE_SERVER_HOSTNAME + "/api/serviceValidation";
    }
}
