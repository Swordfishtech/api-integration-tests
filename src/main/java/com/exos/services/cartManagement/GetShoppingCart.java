package com.exos.services.cartManagement;

import com.exos.AbstractHttpSpecification;
import com.exos.Properties;
import com.mashape.unirest.http.HttpMethod;
import lombok.Builder;
import lombok.Setter;
import lombok.experimental.Accessors;

@Builder
@Accessors(chain = true)
public class GetShoppingCart extends AbstractHttpSpecification {

    @Setter
    private transient String cartId;

    @Override
    protected HttpMethod getHttpMethod() {
        return HttpMethod.GET;
    }

    @Override
    protected String getEndpointUrl() {
        return Properties.CART_MANAGEMENT_SERVER_HOSTNAME + "/api/shoppingCart/" + cartId;
    }
}
