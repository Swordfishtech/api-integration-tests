package com.exos.dto.services.translation.products;

import com.exos.AbstractHttpSpecification;
import com.exos.Properties;
import com.exos.dto.services.Attributes;
import com.google.gson.annotations.SerializedName;
import com.mashape.unirest.http.HttpMethod;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Builder
@Accessors(chain = true)
public class ProductImportReq extends AbstractHttpSpecification {

    @SerializedName("attributes")
    private Attributes attributes;
    @SerializedName("correlationId")
    private String correlationId;
    @SerializedName("email")
    private String email;
    @SerializedName("fullName")
    private String fullName;
    @SerializedName("loginName")
    private String loginName;
    @SerializedName("systemTypeCd")
    private String systemTypeCd;

    @Override
    protected HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    protected String getEndpointUrl() {
        return Properties.PRODUCT_SERVICE_SERVER_HOSTNAME + "/product/import";
    }
}
