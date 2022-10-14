package com.exos.dto.services.boosterorchestration;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class ServiceValidationResp {

    @SerializedName("status_code") private int statusCode;
    private String tariffCode;
    private boolean isPostPaid;
}
