package com.exos.dto.services.ordermanagement;

import com.exos.AbstractHttpSpecification;
import com.exos.Properties;
import com.google.gson.annotations.SerializedName;
import com.mashape.unirest.http.HttpMethod;
import lombok.Builder;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Builder
@Accessors(chain = true)
public class PatchProductOrderReq extends AbstractHttpSpecification {

    @Builder.Default @Setter private transient String productId = null;

    @Override
    protected HttpMethod getHttpMethod() {
        return HttpMethod.PATCH;
    }

    @Override
    protected String getEndpointUrl() {
        //todo this is a bug where the backslash is needed
        return productId == null ? Properties.ORDER_MANAGEMENT_SERVER_HOSTNAME + "/api/product-order/" : Properties.ORDER_MANAGEMENT_SERVER_HOSTNAME + "/api/product-order/" + productId + "/";
    }

    @Setter private List<ProductOrderItem> productOrderItem;
    @Setter private String state;
    @Setter @SerializedName("@baseType") public String baseType;
    @Setter @SerializedName("@schemaLocation") public String schemaLocation;
    @Setter@SerializedName("@type") public String type;

    @Builder
    @Accessors(chain = true)
    public static class ProductOrderItem {

        @Setter private String id;
        @Setter private Integer quantity;
        @Setter private String action;
        @Setter private String state;
        @Setter @SerializedName("@baseType") public String baseType;
        @Setter @SerializedName("@schemaLocation") public String schemaLocation;
        @Setter @SerializedName("@type") public String type;

    }

}
