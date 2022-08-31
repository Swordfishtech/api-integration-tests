package com.exos.services.productsController;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Setter;
import lombok.experimental.Accessors;

@Builder
@Accessors(chain = true)
public class SessionRequest {

    @Setter
    @SerializedName("attributes")
    public Attributes attributes;
    @Setter
    @SerializedName("correlationId")
    public String correlationId;
    @Setter
    @SerializedName("email")
    public String email;
    @Setter
    @SerializedName("fullName")
    public String fullName;
    @Setter
    @SerializedName("loginName")
    public String loginName;
    @Setter
    @SerializedName("systemTypeCd")
    public String systemTypeCd;

}
