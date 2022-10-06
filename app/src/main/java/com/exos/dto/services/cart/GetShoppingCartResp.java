package com.exos.dto.services.cart;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

@Getter
public class GetShoppingCartResp {

    @SerializedName("id")
    Integer id;

    @SerializedName("href")
    String href;

    @SerializedName("cartItem")
    List<Object> cartItem = null;

    @SerializedName("cartPrice")
    List<CartPrice> cartPrice = null;

    @SerializedName("contactMedium")
    List<ContactMedium> contactMedium = null;

    @SerializedName("realtedParty")
    List<Object> realtedParty = null; //todo this is a bug - should be relatedParty

    @SerializedName("validFor")
    ValidFor__1 validFor;

    @SerializedName("@baseType")
    String baseType;

    @SerializedName("@type")
    String type;

    @SerializedName("@schemaLocation")
    String schemaLocation;

    @Getter
    public class CartPrice {

        @SerializedName("description")

        String description;
        @SerializedName("name")

        String name;
        @SerializedName("priceType")

        String priceType;
        @SerializedName("recurringChargePeriod")

        String recurringChargePeriod;
        @SerializedName("unitOfMeasure")

        String unitOfMeasure;
        @SerializedName("price")

        Price price;
        @SerializedName("priceAlteration")

        List<PriceAlteration> priceAlteration = null;
        @SerializedName("productOfferingPrice")

        ProductOfferingPrice__1 productOfferingPrice;
        @SerializedName("cart_item_total_price")

        Object cartItemTotalPrice;
        @SerializedName("cart_item_price")

        Object cartItemPrice;
        @SerializedName("@baseType")

        String baseType;
        @SerializedName("@type")

        String type;
        @SerializedName("@schemaLocation")

        String schemaLocation;

    }

    @Getter
    public class Characteristic {

        @SerializedName("city")

        String city;
        @SerializedName("contactType")

        String contactType;
        @SerializedName("country")

        String country;
        @SerializedName("emailAddress")

        String emailAddress;
        @SerializedName("faxNumber")

        String faxNumber;
        @SerializedName("phoneNumber")

        String phoneNumber;
        @SerializedName("postCode")

        String postCode;
        @SerializedName("socialNetworkId")

        String socialNetworkId;
        @SerializedName("stateOrProvince")

        String stateOrProvince;
        @SerializedName("street1")

        String street1;
        @SerializedName("street2")

        String street2;
        @SerializedName("@baseType")

        String baseType;
        @SerializedName("@type")

        String type;
        @SerializedName("@schemaLocation")

        String schemaLocation;

    }

    @Getter
    public class ContactMedium {

        @SerializedName("mediumType")

        String mediumType;
        @SerializedName("preferred")

        Boolean preferred;
        @SerializedName("characteristic")

        Characteristic characteristic;
        @SerializedName("validFor")

        ValidFor validFor;
        @SerializedName("@baseType")

        String baseType;
        @SerializedName("@type")

        String type;
        @SerializedName("@schemaLocation")

        String schemaLocation;

    }

    @Getter
    public class DutyFreeAmount {

        @SerializedName("unit")

        String unit;
        @SerializedName("value")

        Double value;

    }

    @Getter
    public class DutyFreeAmount__1 {

        @SerializedName("unit")

        String unit;
        @SerializedName("value")

        Double value;

    }

    @Getter
    public class Price {

        @SerializedName("percentage")

        Double percentage;
        @SerializedName("tax_rate")

        Object taxRate;
        @SerializedName("duty_free_amount")

        DutyFreeAmount dutyFreeAmount;
        @SerializedName("tax_included_amount")

        TaxIncludedAmount taxIncludedAmount;
        @SerializedName("@baseType")

        String baseType;
        @SerializedName("@type")

        String type;
        @SerializedName("@schemaLocation")

        String schemaLocation;

    }

    @Getter
    public class PriceAlteration {

        @SerializedName("applicationDuration")

        String applicationDuration;
        @SerializedName("description")

        String description;
        @SerializedName("name")

        String name;
        @SerializedName("priceType")

        String priceType;
        @SerializedName("priority")

        Integer priority;
        @SerializedName("recurringChargePeriod")

        String recurringChargePeriod;
        @SerializedName("unitOfMeasure")

        String unitOfMeasure;
        @SerializedName("price")

        Price__1 price;
        @SerializedName("productOfferingPrice")

        ProductOfferingPrice productOfferingPrice;
        @SerializedName("@baseType")

        String baseType;
        @SerializedName("@type")

        String type;
        @SerializedName("@schemaLocation")

        String schemaLocation;

    }

    @Getter
    public class Price__1 {

        @SerializedName("percentage")

        Double percentage;
        @SerializedName("tax_rate")

        Object taxRate;
        @SerializedName("duty_free_amount")

        DutyFreeAmount__1 dutyFreeAmount;
        @SerializedName("tax_included_amount")

        TaxIncludedAmount__1 taxIncludedAmount;
        @SerializedName("@baseType")

        String baseType;
        @SerializedName("@type")

        String type;
        @SerializedName("@schemaLocation")

        String schemaLocation;

    }

    @Getter
    public class ProductOfferingPrice {

        @SerializedName("id")

        String id;
        @SerializedName("href")

        String href;
        @SerializedName("name")

        String name;
        @SerializedName("@baseType")

        String baseType;
        @SerializedName("@type")

        String type;
        @SerializedName("@schemaLocation")

        String schemaLocation;
        @SerializedName("@referredType")

        String referredType;

    }

    @Getter
    public class ProductOfferingPrice__1 {

        @SerializedName("id")

        String id;
        @SerializedName("href")

        String href;
        @SerializedName("name")

        String name;
        @SerializedName("@baseType")

        String baseType;
        @SerializedName("@type")

        String type;
        @SerializedName("@schemaLocation")

        String schemaLocation;
        @SerializedName("@referredType")

        String referredType;

    }

    @Getter
    public class TaxIncludedAmount {

        @SerializedName("unit")

        String unit;
        @SerializedName("value")

        Double value;

    }

    @Getter
    public class TaxIncludedAmount__1 {

        @SerializedName("unit")

        String unit;
        @SerializedName("value")

        Double value;

    }

    @Getter
    public class ValidFor {

        @SerializedName("startDateTime")

        String startDateTime;
        @SerializedName("endDateTime")

        String endDateTime;

    }

    @Getter
    public class ValidFor__1 {

        @SerializedName("startDateTime")

        String startDateTime;
        @SerializedName("endDateTime")

        String endDateTime;

    }
}
