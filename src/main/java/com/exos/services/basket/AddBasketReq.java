package com.exos.services.basket;

import com.exos.AbstractHttpSpecification;
import com.mashape.unirest.http.HttpMethod;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.json.JSONObject;

@Builder
@Accessors(chain = true)
public class AddBasketReq extends AbstractHttpSpecification {

    @Setter @Getter
    private JSONObject requestBody;

    @Override
    protected HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    protected String getEndpointUrl() {
        return "/api/basket";
    }
}
