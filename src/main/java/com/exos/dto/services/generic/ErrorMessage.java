package com.exos.dto.services.generic;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class ErrorMessage {

    private String code;
    private String reason;
    private String message;
    private String status;
    private String referenceError;
    @SerializedName("@baseType") private String baseType;
    @SerializedName("@schemaLocation") private String schemaLocation;
    @SerializedName("@type") private String type;
}