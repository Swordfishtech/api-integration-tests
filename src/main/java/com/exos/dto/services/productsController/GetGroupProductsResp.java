package com.exos.dto.services.productsController;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Accessors(chain = true)
public class GetGroupProductsResp {

    @SerializedName("productGroupDetail")
    public List<ProductGroupDetail> productGroupDetail = null;

    @Getter
    public class ProductDetailInfo {

        @SerializedName("productCode")
        @Getter
        private String productCode;
        @SerializedName("productDescription")
        private String productDescription;
        @SerializedName("inclusionStatus")
        private String inclusionStatus;
        @SerializedName("displayOrder")
        private Integer displayOrder;
        @SerializedName("tariffDetailInfo")
        private List<TariffDetailInfo> tariffDetailInfo = null;

    }

    @Getter
    public class ProductGroupDetail {

        @SerializedName("componentCode")
        public String componentCode;
        @SerializedName("componentDescription")
        public String componentDescription;
        @SerializedName("packageCode")
        public String packageCode;
        @SerializedName("packageDescription")
        public String packageDescription;
        @SerializedName("minWhenSold")
        public Integer minWhenSold;
        @SerializedName("maxWhenSold")
        public Integer maxWhenSold;
        @SerializedName("displayOrder")
        public Integer displayOrder;
        @SerializedName("productDetailInfo")
        public List<ProductDetailInfo> productDetailInfo = null;

    }

    @Getter
    public class TariffDetailInfo {

        @SerializedName("tariffGroupCode")
        public String tariffGroupCode;
        @SerializedName("subscriptionGroup")
        public String subscriptionGroup;
        @SerializedName("serviceYN")
        public String serviceYN;
        @SerializedName("lineYN")
        public String lineYN;
        @SerializedName("equipmentYN")
        public String equipmentYN;
        @SerializedName("tariffActionCd")
        public String tariffActionCd;
        @SerializedName("systemTypeCd")
        public String systemTypeCd;
        @SerializedName("packlageYN")
        public String packlageYN;
        @SerializedName("serviceCd")
        public String serviceCd;
        @SerializedName("numberPlanCode")
        public String numberPlanCode;
        @SerializedName("productDisplayName")
        public String productDisplayName;
        @SerializedName("currencyCode")
        public String currencyCode;

    }
}