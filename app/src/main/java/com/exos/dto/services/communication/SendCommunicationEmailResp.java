package com.exos.dto.services.communication;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class SendCommunicationEmailResp {

    private String message;
    @SerializedName("request_id") private int requestId;

}
