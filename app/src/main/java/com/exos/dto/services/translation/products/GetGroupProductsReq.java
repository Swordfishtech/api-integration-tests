package com.exos.dto.services.translation.products;

import com.exos.AbstractHttpSpecification;
import com.exos.Properties;
import com.exos.dto.services.session.SessionReq;
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
    private SessionReq sessionRequest;


    @Override
    protected HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    protected String getEndpointUrl() {
        return Properties.PRODUCT_SERVICE_SERVER_HOSTNAME + "/product/groupdetail";
    }
}
