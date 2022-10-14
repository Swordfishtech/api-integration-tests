package com.exos.dto.services.translation.products;

import lombok.Getter;

public class GetDetailForProductResp {

    @Getter
    public ProductDetailItemInfo productDetailItemInfo;

    @Getter
    public class ProductDetailItemInfo {

        private Boolean associationMandatory;
        private Boolean associationOptional;
        private Boolean communityProduct;
        private String defaultAPN;
        private String gsmNumberClass;
        private Boolean hasAdhocDiscount;
        private Boolean isArchived;
        private Boolean isEnhanced;
        private Boolean isEquipment;
        private Boolean isLine;
        private Boolean isPackage;
        private Boolean isSSAutoDeactivation;
        private Boolean isService;
        private Boolean isTemporary;
        private String linkOptionCode;
        private String order11Code;
        private String packageCode;
        private String productTypeCode;
        private Integer routineMaIntegerenanceFrequency;
        private String serviceCode;
        private String staticIpProductYn;
        private String subscriptionGroup;
        private String systemTypeCode;
        private String tariffActionCode;
        private String tariffCode;
        private String tariffDescription;
        private String tariffGroupCode;
        private Integer tariffPeriod;
        private Object teleService;
        private String usageTypeCode;
        private Integer warrantyPeriod;

    }
}
