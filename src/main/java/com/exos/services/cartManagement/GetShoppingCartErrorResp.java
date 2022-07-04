package com.exos.services.cartManagement;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class GetShoppingCartErrorResp {

    @SerializedName("detail")
    public String detail;
    @SerializedName("code")
    public Integer code;
    @SerializedName("status_code")
    public Integer statusCode;
    @SerializedName("referenceError")
    public String referenceError;
    @SerializedName("reason")
    public String reason;
    @SerializedName("message")
    public String message;
    @SerializedName("@baseType")
    public String baseType;
    @SerializedName("@schemaLocation")
    public String schemaLocation;
    @SerializedName("@type")
    public String type;
}
