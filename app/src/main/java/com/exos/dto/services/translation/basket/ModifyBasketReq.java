package com.exos.dto.services.translation.basket;


import com.exos.AbstractHttpSpecification;
import com.exos.Properties;
import com.mashape.unirest.http.HttpMethod;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.json.JSONObject;

@Builder
@Accessors(chain = true)
public class ModifyBasketReq extends AbstractHttpSpecification {

    @Setter
    @Getter
    private JSONObject requestBody;

    @Override
    protected HttpMethod getHttpMethod() {
        return HttpMethod.PUT;
    }

    @Override
    protected String getEndpointUrl() {
        return Properties.TRANSLATION_SERVICE_SERVER_HOSTNAME +  "/api/basket";
    }
}
