package com.exos.dto.services.communication;

import com.exos.AbstractHttpSpecification;
import com.exos.Properties;
import com.google.gson.annotations.SerializedName;
import com.mashape.unirest.http.HttpMethod;
import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(chain = true)
public class SendCommunicationEmailReq extends AbstractHttpSpecification {

    @SerializedName("template_key")
    private String templateKey;

    @SerializedName("calling_application")
    private String callingApplication;

    @SerializedName("external_user_id")
    private String externalUserId;

    @SerializedName("sender_details")
    private String senderDetails;

    @SerializedName("reciever_details")
    private String recieverDetails; //todo spelling mistake

    @SerializedName("input_parameters")
    private InputParameters inputParameters;

    @Override
    protected HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    protected String getEndpointUrl() {
        return Properties.COMMUNICATION_SERVICE_SERVER_HOSTNAME + "/api/send-communication-email";
    }

    @Builder
    @Accessors(chain = true)
    public static class InputParameters {

        @SerializedName("customer_name")
        private String customerName;

        @SerializedName("customer_id")
        private String customerId;
    }
}
