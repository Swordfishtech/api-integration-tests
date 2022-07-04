package com.exos.services.ordermanagement;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class ProductOrderInvalidRequestResp {

    public Integer code;
    public String reason;
    public String message;
    public String status;
    public String referenceError;
    @SerializedName("@baseType")
    public String baseType;
    @SerializedName("@schemaLocation")
    @Expose
    public String schemaLocation;
    @SerializedName("@type")
    @Expose
    public String type;
}
