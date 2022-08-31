package com.exos.services.products;

import java.util.List;

public class GetProductsResp {


    public List<ProductLimitedDetail> productLimitedDetails = null;


    public class GroupProduct {

        public String code;
        public String desc;
        public String srvCode;
        public String typeCode;
        public Boolean pkg;

    }

    public class ProductLimitedDetail {

        public String groupCode;
        public List<GroupProduct> groupProducts = null;

    }
}
