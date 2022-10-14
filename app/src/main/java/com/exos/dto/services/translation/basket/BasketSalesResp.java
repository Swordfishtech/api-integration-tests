package com.exos.dto.services.translation.basket;

import lombok.Getter;

import java.util.List;

@Getter
public class BasketSalesResp {

    private List<Basket> baskets = null;

    @Getter
    public class AccountName {

        private String forenamesInitials;
        private String honours;
        private String middleName;
        private String surnameCompanyName;
        private String title;

    }

    @Getter
    public class Basket {

        private AccountName accountName;
        private Integer accountNo;
        private Integer basketUid;
        private Boolean completingSale;
        private Object lastUsedDateTime;
        private List<Product> products = null;
        private Boolean sold;
        private String username;
        private List<WoNoStatusDetail> woNoStatusDetails = null;

    }

    public class ListAccessNo {

        private String accessNo;
        private Integer equipUid;

    }

    @Getter
    public class Product {

        private List<ListAccessNo> listAccessNo = null;
        private String methodCode;
        private String productCode;

    }

    @Getter
    public class WoNoStatusDetail {

        private String statusCode;
        private Integer workOrderNo;

    }
}
