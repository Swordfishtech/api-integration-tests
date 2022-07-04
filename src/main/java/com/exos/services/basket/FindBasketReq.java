package com.exos.services.basket;


import com.exos.AbstractHttpSpecification;
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
        return "/api/findBasket";
    }
}
