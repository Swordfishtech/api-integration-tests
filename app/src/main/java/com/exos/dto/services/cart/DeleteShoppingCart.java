package com.exos.dto.services.cart;

import com.exos.AbstractHttpSpecification;
import com.exos.Properties;
import com.mashape.unirest.http.HttpMethod;
import lombok.Builder;
import lombok.Setter;
import lombok.experimental.Accessors;

@Builder
@Accessors(chain = true)
public class DeleteShoppingCart extends AbstractHttpSpecification {

    @Setter
    private transient String cartId;

    @Override
    protected HttpMethod getHttpMethod() {
        return HttpMethod.DELETE;
    }

    @Override
    protected String getEndpointUrl() {

        return String.format("%s/api/shoppingCart/%s/", Properties.CART_MANAGEMENT_SERVER_HOSTNAME, cartId); //todo this is a bug where the backslash is needed
    }
}
