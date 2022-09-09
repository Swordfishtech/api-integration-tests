package com.exos.dto.services.productsController;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Setter;
import lombok.experimental.Accessors;

@Builder
@Accessors(chain = true)
public class Attributes {

    @Setter
    @SerializedName("additionalProp1")
    public String additionalProp1;
    @Setter
    @SerializedName("additionalProp2")
    public String additionalProp2;
    @Setter
    @SerializedName("additionalProp3")
    public String additionalProp3;

}

