package com.exos.dto.services.translation.products;

import lombok.Getter;

import java.util.List;

@Getter
public class GetProductsResp {


    private List<ProductLimitedDetail> productLimitedDetails = null;


    @Getter
    public class ProductLimitedDetail {

        private String groupCode;
        private List<GroupProduct> groupProducts = null;

    }

    @Getter
    public class GroupProduct {

        private String code;
        private String desc;
        private String srvCode;
        private String typeCode;
        private Boolean pkg;

    }
}
