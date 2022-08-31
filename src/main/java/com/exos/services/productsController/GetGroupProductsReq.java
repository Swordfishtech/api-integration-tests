package com.exos.services.productsController;

import com.exos.AbstractHttpSpecification;
import com.exos.Properties;
import com.google.gson.annotations.SerializedName;
import com.mashape.unirest.http.HttpMethod;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Builder
@Setter
@Getter
@Accessors(chain = true)
public class GetGroupProductsReq extends AbstractHttpSpecification {

    @SerializedName("compGroupCode")
    private String compGroupCode;
    @SerializedName("packageCode")
    private String packageCode;
    @SerializedName("sessionRequest")
    private SessionRequest sessionRequest;


    @Override
    protected HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    protected String getEndpointUrl() {
        return Properties.PRODUCT_CONTROLLER_SERVER_HOSTNAME + "/product/groupdetail";
    }
}
