package com.exos.dto.services.translation.basket;


import com.exos.AbstractHttpSpecification;
import com.exos.Properties;
import com.mashape.unirest.http.HttpMethod;
import lombok.Builder;
import lombok.Setter;
import lombok.experimental.Accessors;

@Builder
@Accessors(chain = true)
public class FindBasketReq extends AbstractHttpSpecification {


    @Setter private int basketUid;
    @Setter private String handle;

    @Override
    protected HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    protected String getEndpointUrl() {
        return Properties.TRANSLATION_SERVICE_SERVER_HOSTNAME +  "/api/findBasket";
    }
}
