package com.exos.dto.services.ordermanagement;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

@Getter
public class GetProductOrderResp {

    @SerializedName("description")
    private String description;
    @SerializedName("externalId")
    private String externalId;
    @SerializedName("requestedStartDate")
    private String requestedStartDate;
    @SerializedName("priority")
    private String priority;
    @SerializedName("billing_account")
    private BillingAccount billingAccount;
    @SerializedName("cancellationDate")
    private String cancellationDate;
    @SerializedName("notificationContact")
    private String notificationContact;
    @SerializedName("requestedCompletionDate")
    private String requestedCompletionDate;
    @SerializedName("cancellationReason")
    private String cancellationReason;
    @SerializedName("category")
    private String category;
    @SerializedName("agreement")
    private List<Agreement> agreement = null;
    @SerializedName("channel")
    private List<Channel> channel = null;
    @SerializedName("note")
    private List<Note> note = null;
    @SerializedName("payment")
    private List<Payment> payment = null;
    @SerializedName("quote")
    private List<Quote> quote = null;
    @SerializedName("state")
    private String state;
    @SerializedName("@baseType")
    private String baseType;
    @SerializedName("@schemaLocation")
    private String schemaLocation;
    @SerializedName("@type")
    private String type;
    @SerializedName("orderTotalPrice")
    private List<OrderTotalPrice> orderTotalPrice = null;
    @SerializedName("productOfferingQualification")
    private List<ProductOfferingQualification> productOfferingQualification = null;
    @SerializedName("productOrderItem")
    private List<ProductOrderItem> productOrderItem = null;
    @SerializedName("relatedParty")
    private List<RelatedParty__1> relatedParty = null;


    public class Agreement {

        @SerializedName("id")
        private String id;
        @SerializedName("href")
        private String href;
        @SerializedName("agreementItemId")
        private Object agreementItemId;
        @SerializedName("name")
        private String name;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("@referredType")
        private String referredType;

    }

    public class Agreement__1 {

        @SerializedName("id")
        private String id;
        @SerializedName("href")
        private String href;
        @SerializedName("agreementItemId")
        private String agreementItemId;
        @SerializedName("name")
        private String name;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("@referredType")
        private String referredType;

    }

    public class Appointment {

        @SerializedName("id")
        private String id;
        @SerializedName("href")
        private String href;
        @SerializedName("description")
        private String description;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("@referredType")
        private String referredType;

    }

    public class BillingAccount {

        @SerializedName("id")
        private String id;
        @SerializedName("href")
        private String href;
        @SerializedName("name")
        private String name;
        @SerializedName("@baseType")
        private Object baseType;
        @SerializedName("@schemaLocation")
        private Object schemaLocation;
        @SerializedName("@type")
        private Object type;
        @SerializedName("@referredType")
        private Object referredType;

    }

    public class BillingAccount__1 {

        @SerializedName("id")
        private String id;
        @SerializedName("href")
        private String href;
        @SerializedName("name")
        private String name;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("@referredType")
        private String referredType;

    }

    public class BillingAccount__2 {

        @SerializedName("id")
        private String id;
        @SerializedName("href")
        private String href;
        @SerializedName("name")
        private String name;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("@referredType")
        private String referredType;

    }

    public class BillingAccount__3 {

        @SerializedName("id")
        private String id;
        @SerializedName("href")
        private String href;
        @SerializedName("name")
        private String name;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("@referredType")
        private String referredType;

    }

    public class BillingAccount__4 {

        @SerializedName("id")
        private String id;
        @SerializedName("href")
        private String href;
        @SerializedName("name")
        private String name;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("@referredType")
        private String referredType;

    }

    public class BillingAccount__5 {

        @SerializedName("id")
        private String id;
        @SerializedName("href")
        private String href;
        @SerializedName("name")
        private String name;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("@referredType")
        private String referredType;

    }

    public class BillingAccount__6 {

        @SerializedName("id")
        private String id;
        @SerializedName("href")
        private String href;
        @SerializedName("name")
        private String name;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("@referredType")
        private String referredType;

    }

    public class Channel {

        @SerializedName("id")
        private String id;
        @SerializedName("href")
        private String href;
        @SerializedName("name")
        private String name;
        @SerializedName("role")
        private String role;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("@referredType")
        private String referredType;

    }

    public class Duration {

        @SerializedName("amount")
        private Double amount;
        @SerializedName("units")
        private String units;

    }

    public class Duration__1 {

        @SerializedName("amount")
        private Double amount;
        @SerializedName("units")
        private String units;

    }

    public class DutyFreeAmount {

        @SerializedName("unit")
        private String unit;
        @SerializedName("value")
        private Double value;

    }

    public class DutyFreeAmount__1 {

        @SerializedName("unit")
        private String unit;
        @SerializedName("value")
        private Double value;

    }

    public class DutyFreeAmount__2 {

        @SerializedName("unit")
        private String unit;
        @SerializedName("value")
        private Double value;

    }

    public class DutyFreeAmount__3 {

        @SerializedName("unit")
        private String unit;
        @SerializedName("value")
        private Double value;

    }

    public class DutyFreeAmount__4 {

        @SerializedName("unit")
        private String unit;
        @SerializedName("value")
        private Double value;

    }

    public class DutyFreeAmount__5 {

        @SerializedName("unit")
        private String unit;
        @SerializedName("value")
        private Double value;

    }

    public class DutyFreeAmount__6 {

        @SerializedName("unit")
        private String unit;
        @SerializedName("value")
        private Double value;

    }

    public class DutyFreeAmount__7 {

        @SerializedName("unit")
        private String unit;
        @SerializedName("value")
        private Double value;

    }

    @Getter
    public class GeographicAddressValidation {

        @SerializedName("id")
        private Integer id;
        @SerializedName("provideAlternative")
        private Boolean provideAlternative;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("submittedGeographicAddress")
        private SubmittedGeographicAddress submittedGeographicAddress;

    }

    @Getter
    public class GeographicLocation {

        @SerializedName("id")
        private String id;
        @SerializedName("bbox")
        private String bbox;
        @SerializedName("name")
        private String name;
        @SerializedName("href")
        private String href;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("@referredType")
        private String referredType;

    }

    @Getter
    public class GeographicSubAddress {

        @SerializedName("id")
        private String id;
        @SerializedName("href")
        private String href;
        @SerializedName("name")
        private String name;
        @SerializedName("buildingName")
        private String buildingName;
        @SerializedName("levelNumber")
        private String levelNumber;
        @SerializedName("levelType")
        private String levelType;
        @SerializedName("privateStreetName")
        private String privateStreetName;
        @SerializedName("privateStreetNumber")
        private String privateStreetNumber;
        @SerializedName("subAddressType")
        private String subAddressType;
        @SerializedName("subUnitNumber")
        private String subUnitNumber;
        @SerializedName("subUnitType")
        private String subUnitType;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;

    }

    public class ItemPrice {

        @SerializedName("description")
        private String description;
        @SerializedName("name")
        private String name;
        @SerializedName("priceType")
        private String priceType;
        @SerializedName("recurringChargePeriod")
        private String recurringChargePeriod;
        @SerializedName("unitOfMeasure")
        private String unitOfMeasure;
        @SerializedName("price")
        private Price__4 price;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("billingAccount")
        private BillingAccount__5 billingAccount;
        @SerializedName("priceAlteration")
        private List<PriceAlteration__1> priceAlteration = null;
        @SerializedName("productOfferingPrice")
        private ProductOfferingPrice__5 productOfferingPrice;

    }

    public class ItemTerm {

        @SerializedName("description")
        private String description;
        @SerializedName("name")
        private String name;
        @SerializedName("duration")
        private Duration__1 duration;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;

    }

    public class ItemTotalPrice {

        @SerializedName("description")
        private String description;
        @SerializedName("name")
        private String name;
        @SerializedName("priceType")
        private String priceType;
        @SerializedName("recurringChargePeriod")
        private String recurringChargePeriod;
        @SerializedName("unitOfMeasure")
        private String unitOfMeasure;
        @SerializedName("price")
        private Price__6 price;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("billingAccount")
        private BillingAccount__6 billingAccount;
        @SerializedName("priceAlteration")
        private List<PriceAlteration__2> priceAlteration = null;
        @SerializedName("productOfferingPrice")
        private ProductOfferingPrice__7 productOfferingPrice;

    }

    public class Note {

        @SerializedName("id")
        private String id;
        @SerializedName("author")
        private String author;
        @SerializedName("date")
        private String date;
        @SerializedName("text")
        private String text;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;

    }

    public class OrderTotalPrice {

        @SerializedName("description")
        private String description;
        @SerializedName("name")
        private String name;
        @SerializedName("priceType")
        private String priceType;
        @SerializedName("recurringChargePeriod")
        private String recurringChargePeriod;
        @SerializedName("unitOfMeasure")
        private String unitOfMeasure;
        @SerializedName("price")
        private Price price;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("billingAccount")
        private BillingAccount__1 billingAccount;
        @SerializedName("priceAlteration")
        private List<PriceAlteration> priceAlteration = null;
        @SerializedName("productOfferingPrice")
        private ProductOfferingPrice__1 productOfferingPrice;

    }

    public class Payment {

        @SerializedName("id")
        private String id;
        @SerializedName("href")
        private String href;
        @SerializedName("name")
        private String name;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("@referredType")
        private String referredType;

    }

    public class Payment__1 {

        @SerializedName("id")
        private String id;
        @SerializedName("href")
        private String href;
        @SerializedName("name")
        private String name;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("@referredType")
        private String referredType;

    }

    @Getter
    public class Place {

        @SerializedName("href")
        private String href;
        @SerializedName("name")
        private String name;
        @SerializedName("role")
        private String role;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("@referredType")
        private String referredType;
        @SerializedName("geographicAddressValidation")
        private GeographicAddressValidation geographicAddressValidation;

    }

    public class Price {

        @SerializedName("percentage")
        private Double percentage;
        @SerializedName("taxrate")
        private Double taxrate;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("dutyFreeAmount")
        private DutyFreeAmount dutyFreeAmount;
        @SerializedName("taxIncludedAmount")
        private TaxIncludedAmount taxIncludedAmount;

    }

    public class PriceAlteration {

        @SerializedName("applicationDuration")
        private Integer applicationDuration;
        @SerializedName("description")
        private String description;
        @SerializedName("name")
        private String name;
        @SerializedName("priceType")
        private String priceType;
        @SerializedName("priority")
        private Integer priority;
        @SerializedName("recurringChargePeriod")
        private String recurringChargePeriod;
        @SerializedName("unitOfMeasure")
        private String unitOfMeasure;
        @SerializedName("price")
        private Price__1 price;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("productOfferingPrice")
        private ProductOfferingPrice productOfferingPrice;

    }

    public class PriceAlteration__1 {

        @SerializedName("applicationDuration")
        private Integer applicationDuration;
        @SerializedName("description")
        private String description;
        @SerializedName("name")
        private String name;
        @SerializedName("priceType")
        private String priceType;
        @SerializedName("priority")
        private Integer priority;
        @SerializedName("recurringChargePeriod")
        private String recurringChargePeriod;
        @SerializedName("unitOfMeasure")
        private String unitOfMeasure;
        @SerializedName("price")
        private Price__5 price;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("productOfferingPrice")
        private ProductOfferingPrice__4 productOfferingPrice;

    }

    public class PriceAlteration__2 {

        @SerializedName("applicationDuration")
        private Integer applicationDuration;
        @SerializedName("description")
        private String description;
        @SerializedName("name")
        private String name;
        @SerializedName("priceType")
        private String priceType;
        @SerializedName("priority")
        private Integer priority;
        @SerializedName("recurringChargePeriod")
        private String recurringChargePeriod;
        @SerializedName("unitOfMeasure")
        private String unitOfMeasure;
        @SerializedName("price")
        private Price__7 price;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("productOfferingPrice")
        private ProductOfferingPrice__6 productOfferingPrice;

    }

    public class Price__1 {

        @SerializedName("percentage")
        private Double percentage;
        @SerializedName("taxrate")
        private Double taxrate;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("dutyFreeAmount")
        private DutyFreeAmount__1 dutyFreeAmount;
        @SerializedName("taxIncludedAmount")
        private TaxIncludedAmount__1 taxIncludedAmount;

    }

    public class Price__2 {

        @SerializedName("percentage")
        private Double percentage;
        @SerializedName("taxrate")
        private Double taxrate;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("dutyFreeAmount")
        private DutyFreeAmount__2 dutyFreeAmount;
        @SerializedName("taxIncludedAmount")
        private TaxIncludedAmount__2 taxIncludedAmount;

    }

    public class Price__3 {

        @SerializedName("percentage")
        private Double percentage;
        @SerializedName("taxrate")
        private Double taxrate;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("dutyFreeAmount")
        private DutyFreeAmount__3 dutyFreeAmount;
        @SerializedName("taxIncludedAmount")
        private TaxIncludedAmount__3 taxIncludedAmount;

    }

    public class Price__4 {

        @SerializedName("percentage")
        private Double percentage;
        @SerializedName("taxrate")
        private Double taxrate;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("dutyFreeAmount")
        private DutyFreeAmount__4 dutyFreeAmount;
        @SerializedName("taxIncludedAmount")
        private TaxIncludedAmount__4 taxIncludedAmount;

    }

    public class Price__5 {

        @SerializedName("percentage")
        private Double percentage;
        @SerializedName("taxrate")
        private Double taxrate;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("dutyFreeAmount")
        private DutyFreeAmount__5 dutyFreeAmount;
        @SerializedName("taxIncludedAmount")
        private TaxIncludedAmount__5 taxIncludedAmount;

    }

    public class Price__6 {

        @SerializedName("percentage")
        private Double percentage;
        @SerializedName("taxrate")
        private Double taxrate;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("dutyFreeAmount")
        private DutyFreeAmount__6 dutyFreeAmount;
        @SerializedName("taxIncludedAmount")
        private TaxIncludedAmount__6 taxIncludedAmount;

    }

    public class Price__7 {

        @SerializedName("percentage")
        private Double percentage;
        @SerializedName("taxrate")
        private Double taxrate;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("dutyFreeAmount")
        private DutyFreeAmount__7 dutyFreeAmount;
        @SerializedName("taxIncludedAmount")
        private TaxIncludedAmount__7 taxIncludedAmount;

    }

    public class Product {

        @SerializedName("id")
        private String id;
        @SerializedName("href")
        private String href;
        @SerializedName("description")
        private String description;
        @SerializedName("isBundle")
        private Boolean isBundle;
        @SerializedName("isCustomerVisible")
        private Boolean isCustomerVisible;
        @SerializedName("name")
        private String name;
        @SerializedName("orderDate")
        private String orderDate;
        @SerializedName("productSerialNumber")
        private String productSerialNumber;
        @SerializedName("startDate")
        private String startDate;
        @SerializedName("terminationDate")
        private String terminationDate;
        @SerializedName("productstring")
        private Object productstring;
        @SerializedName("status")
        private String status;
        @SerializedName("agreement")
        private List<Agreement__1> agreement = null;
        @SerializedName("place")
        @Getter private List<Place> place = null;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("@referredType")
        private String referredType;
        @SerializedName("billingAccount")
        private BillingAccount__2 billingAccount;
        @SerializedName("productCharacteristic")
        private List<ProductCharacteristic> productCharacteristic = null;
        @SerializedName("productOrderItem")
        private List<ProductOrderItem__1> productOrderItem = null;
        @SerializedName("productPrice")
        private List<ProductPrice> productPrice = null;
        @SerializedName("productTerm")
        private List<ProductTerm> productTerm = null;
        @SerializedName("productOffering")
        private ProductOffering productOffering;
        @SerializedName("productSpecification")
        private ProductSpecification productSpecification;
        @SerializedName("productRelationship")
        private List<ProductRelationship> productRelationship = null;
        @SerializedName("realizingResource")
        private List<RealizingResource> realizingResource = null;
        @SerializedName("realizingService")
        private List<RealizingService> realizingService = null;
        @SerializedName("relatedParty")
        private List<RelatedParty> relatedParty = null;

    }

    public class ProductCharacteristic {

        @SerializedName("name")
        private String name;
        @SerializedName("valueType")
        private String valueType;
        @SerializedName("value")
        private String value;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;

    }

    public class ProductOffering {

        @SerializedName("id")
        private String id;
        @SerializedName("href")
        private String href;
        @SerializedName("name")
        private String name;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("@referredType")
        private String referredType;

    }

    public class ProductOfferingPrice {

        @SerializedName("id")
        private String id;
        @SerializedName("href")
        private String href;
        @SerializedName("name")
        private String name;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("@referredType")
        private String referredType;

    }

    public class ProductOfferingPrice__1 {

        @SerializedName("id")
        private String id;
        @SerializedName("href")
        private String href;
        @SerializedName("name")
        private String name;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("@referredType")
        private String referredType;

    }

    public class ProductOfferingPrice__2 {

        @SerializedName("id")
        private String id;
        @SerializedName("href")
        private String href;
        @SerializedName("name")
        private String name;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("@referredType")
        private String referredType;

    }

    public class ProductOfferingPrice__3 {

        @SerializedName("id")
        private String id;
        @SerializedName("href")
        private String href;
        @SerializedName("name")
        private String name;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("@referredType")
        private String referredType;

    }

    public class ProductOfferingPrice__4 {

        @SerializedName("id")
        private String id;
        @SerializedName("href")
        private String href;
        @SerializedName("name")
        private String name;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("@referredType")
        private String referredType;

    }

    public class ProductOfferingPrice__5 {

        @SerializedName("id")
        private String id;
        @SerializedName("href")
        private String href;
        @SerializedName("name")
        private String name;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("@referredType")
        private String referredType;

    }

    public class ProductOfferingPrice__6 {

        @SerializedName("id")
        private String id;
        @SerializedName("href")
        private String href;
        @SerializedName("name")
        private String name;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("@referredType")
        private String referredType;

    }

    public class ProductOfferingPrice__7 {

        @SerializedName("id")
        private String id;
        @SerializedName("href")
        private String href;
        @SerializedName("name")
        private String name;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("@referredType")
        private String referredType;

    }

    public class ProductOfferingQualification {

        @SerializedName("id")
        private String id;
        @SerializedName("href")
        private String href;
        @SerializedName("name")
        private String name;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("@referredType")
        private String referredType;

    }

    public class ProductOfferingQualificationItem {

        @SerializedName("id")
        private String id;
        @SerializedName("href")
        private String href;
        @SerializedName("name")
        private String name;
        @SerializedName("referredtype")
        private String referredtype;
        @SerializedName("productOfferingQualificationHref")
        private String productOfferingQualificationHref;
        @SerializedName("productOfferingQualificationId")
        private String productOfferingQualificationId;
        @SerializedName("productOfferingQualificationName")
        private String productOfferingQualificationName;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("@referredType")
        private String referredType;

    }

    public class ProductOffering__1 {

        @SerializedName("id")
        private String id;
        @SerializedName("href")
        private String href;
        @SerializedName("name")
        private String name;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("@referredType")
        private String referredType;

    }

    public class ProductOrderItem {

        @SerializedName("id")
        private String id;
        @SerializedName("quantity")
        private Integer quantity;
        @SerializedName("action")
        private String action;
        @SerializedName("appointment")
        private Appointment appointment;
        @SerializedName("productorderitemstring")
        private Object productorderitemstring;
        @SerializedName("state")
        private String state;
        @SerializedName("payment")
        private List<Payment__1> payment = null;
        @SerializedName("product")
        @Getter private Product product;
        @SerializedName("qualification")
        private List<Qualification> qualification = null;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("billingAccount")
        private BillingAccount__4 billingAccount;
        @SerializedName("itemPrice")
        private List<ItemPrice> itemPrice = null;
        @SerializedName("itemTerm")
        private List<ItemTerm> itemTerm = null;
        @SerializedName("itemTotalPrice")
        private List<ItemTotalPrice> itemTotalPrice = null;
        @SerializedName("productOfferingQualificationItem")
        private ProductOfferingQualificationItem productOfferingQualificationItem;
        @SerializedName("productOffering")
        private ProductOffering__1 productOffering;
        @SerializedName("productOrderItemRelationship")
        private List<ProductOrderItemRelationship> productOrderItemRelationship = null;
        @SerializedName("quoteItem")
        private QuoteItem quoteItem;

    }

    public class ProductOrderItemRelationship {

        @SerializedName("relationshipType")
        private String relationshipType;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;

    }

    public class ProductOrderItem__1 {

        @SerializedName("orderItemAction")
        private String orderItemAction;
        @SerializedName("orderItemId")
        private String orderItemId;
        @SerializedName("productOrderHref")
        private String productOrderHref;
        @SerializedName("productOrderId")
        private String productOrderId;
        @SerializedName("role")
        private String role;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("@referredType")
        private String referredType;

    }

    public class ProductPrice {

        @SerializedName("description")
        private String description;
        @SerializedName("name")
        private String name;
        @SerializedName("priceType")
        private String priceType;
        @SerializedName("recurringChargePeriod")
        private String recurringChargePeriod;
        @SerializedName("unitOfMeasure")
        private String unitOfMeasure;
        @SerializedName("price")
        private Price__2 price;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("billingAccount")
        private BillingAccount__3 billingAccount;
        @SerializedName("productPriceAlteration")
        private List<ProductPriceAlteration> productPriceAlteration = null;
        @SerializedName("productOfferingPrice")
        private ProductOfferingPrice__3 productOfferingPrice;

    }

    public class ProductPriceAlteration {

        @SerializedName("applicationDuration")
        private Integer applicationDuration;
        @SerializedName("description")
        private String description;
        @SerializedName("name")
        private String name;
        @SerializedName("priceType")
        private String priceType;
        @SerializedName("priority")
        private Integer priority;
        @SerializedName("recurringChargePeriod")
        private String recurringChargePeriod;
        @SerializedName("unitOfMeasure")
        private String unitOfMeasure;
        @SerializedName("price")
        private Price__3 price;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("productOfferingPrice")
        private ProductOfferingPrice__2 productOfferingPrice;

    }

    public class ProductRelationship {

        @SerializedName("relationshipType")
        private String relationshipType;
        @SerializedName("product")
        private String product;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;

    }

    public class ProductSpecification {

        @SerializedName("id")
        private String id;
        @SerializedName("name")
        private String name;
        @SerializedName("href")
        private String href;
        @SerializedName("version")
        private String version;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("@referredType")
        private String referredType;
        @SerializedName("targetProductSchema")
        private TargetProductSchema targetProductSchema;

    }

    public class ProductTerm {

        @SerializedName("description")
        private String description;
        @SerializedName("name")
        private String name;
        @SerializedName("duration")
        private Duration duration;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("validFor")
        private ValidFor validFor;

    }

    public class Qualification {

        @SerializedName("id")
        private String id;
        @SerializedName("href")
        private String href;
        @SerializedName("name")
        private String name;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("@referredType")
        private String referredType;

    }

    public class Quote {

        @SerializedName("id")
        private String id;
        @SerializedName("href")
        private String href;
        @SerializedName("name")
        private String name;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("@referredType")
        private String referredType;

    }

    public class QuoteItem {

        @SerializedName("id")
        private String id;
        @SerializedName("href")
        private String href;
        @SerializedName("name")
        private String name;
        @SerializedName("quoteHref")
        private String quoteHref;
        @SerializedName("quoteId")
        private String quoteId;
        @SerializedName("quoteName")
        private String quoteName;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;

    }

    public class RealizingResource {

        @SerializedName("id")
        private String id;
        @SerializedName("name")
        private String name;
        @SerializedName("href")
        private String href;
        @SerializedName("value")
        private String value;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("@referredType")
        private String referredType;

    }

    public class RealizingService {

        @SerializedName("id")
        private String id;
        @SerializedName("href")
        private String href;
        @SerializedName("name")
        private String name;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("@referredType")
        private String referredType;

    }

    public class RelatedParty {

        @SerializedName("id")
        private String id;
        @SerializedName("href")
        private String href;
        @SerializedName("name")
        private String name;
        @SerializedName("role")
        private String role;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("@referredType")
        private String referredType;

    }

    public class RelatedParty__1 {

        @SerializedName("id")
        private String id;
        @SerializedName("href")
        private String href;
        @SerializedName("name")
        private String name;
        @SerializedName("role")
        private String role;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("@referredType")
        private String referredType;

    }

    @Getter
    public class SubmittedGeographicAddress {

        @SerializedName("id")
        private String id;
        @SerializedName("streetNrSuffix")
        private String streetNrSuffix;
        @SerializedName("stateOrProvince")
        private String stateOrProvince;
        @SerializedName("country")
        private String country;
        @SerializedName("city")
        private String city;
        @SerializedName("streetName")
        private String streetName;
        @SerializedName("streetNr")
        private String streetNr;
        @SerializedName("streetNrLast")
        private String streetNrLast;
        @SerializedName("locality")
        private String locality;
        @SerializedName("postcode")
        private String postcode;
        @SerializedName("streetType")
        private String streetType;
        @SerializedName("name")
        private String name;
        @SerializedName("streetNrLastSuffix")
        private String streetNrLastSuffix;
        @SerializedName("href")
        private String href;
        @SerializedName("streetSuffix")
        private String streetSuffix;
        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;
        @SerializedName("geographicSubAddress")
        private List<GeographicSubAddress> geographicSubAddress = null;
        @SerializedName("geographicLocation")
        private GeographicLocation geographicLocation;

    }

    public class TargetProductSchema {

        @SerializedName("@baseType")
        private String baseType;
        @SerializedName("@schemaLocation")
        private String schemaLocation;
        @SerializedName("@type")
        private String type;

    }

    public class TaxIncludedAmount {

        @SerializedName("unit")
        private String unit;
        @SerializedName("value")
        private Double value;

    }

    public class TaxIncludedAmount__1 {

        @SerializedName("unit")
        private String unit;
        @SerializedName("value")
        private Double value;

    }

    public class TaxIncludedAmount__2 {

        @SerializedName("unit")
        private String unit;
        @SerializedName("value")
        private Double value;

    }

    public class TaxIncludedAmount__3 {

        @SerializedName("unit")
        private String unit;
        @SerializedName("value")
        private Double value;

    }

    public class TaxIncludedAmount__4 {

        @SerializedName("unit")
        private String unit;
        @SerializedName("value")
        private Double value;

    }

    public class TaxIncludedAmount__5 {

        @SerializedName("unit")
        private String unit;
        @SerializedName("value")
        private Double value;

    }

    public class TaxIncludedAmount__6 {

        @SerializedName("unit")
        private String unit;
        @SerializedName("value")
        private Double value;

    }

    public class TaxIncludedAmount__7 {

        @SerializedName("unit")
        private String unit;
        @SerializedName("value")
        private Double value;

    }

    public class ValidFor {

        @SerializedName("startDateTime")
        private String startDateTime;
        @SerializedName("endDateTime")
        private String endDateTime;

    }
}
