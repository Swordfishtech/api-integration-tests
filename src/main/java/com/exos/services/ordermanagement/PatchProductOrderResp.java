package com.exos.services.ordermanagement;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

@Getter
public class PatchProductOrderResp {

    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("externalId")
    @Expose
    private String externalId;
    @SerializedName("requestedStartDate")
    @Expose
    private String requestedStartDate;
    @SerializedName("priority")
    @Expose
    private String priority;
    @SerializedName("billing_account")
    @Expose
    private BillingAccount billingAccount;
    @SerializedName("cancellationDate")
    @Expose
    private String cancellationDate;
    @SerializedName("notificationContact")
    @Expose
    private String notificationContact;
    @SerializedName("requestedCompletionDate")
    @Expose
    private String requestedCompletionDate;
    @SerializedName("cancellationReason")
    @Expose
    private String cancellationReason;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("agreement")
    @Expose
    private List<Agreement> agreement = null;
    @SerializedName("channel")
    @Expose
    private List<Channel> channel = null;
    @SerializedName("note")
    @Expose
    private List<Note> note = null;
    @SerializedName("payment")
    @Expose
    private List<Payment> payment = null;
    @SerializedName("quote")
    @Expose
    private List<Quote> quote = null;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("@baseType")
    @Expose
    private String baseType;
    @SerializedName("@schemaLocation")
    @Expose
    private String schemaLocation;
    @SerializedName("@type")
    @Expose
    private String type;
    @SerializedName("orderTotalPrice")
    @Expose
    private List<OrderTotalPrice> orderTotalPrice = null;
    @SerializedName("productOfferingQualification")
    @Expose
    private List<ProductOfferingQualification> productOfferingQualification = null;
    @SerializedName("productOrderItem")
    @Expose
    private List<ProductOrderItem> productOrderItem = null;
    @SerializedName("relatedParty")
    @Expose
    private List<RelatedParty__1> relatedParty = null;


    private class Agreement {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("href")
        @Expose
        private String href;
        @SerializedName("agreementItemId")
        @Expose
        private Object agreementItemId;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("@referredType")
        @Expose
        private String referredType;

    }

    private class Agreement__1 {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("href")
        @Expose
        private String href;
        @SerializedName("agreementItemId")
        @Expose
        private String agreementItemId;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("@referredType")
        @Expose
        private String referredType;

    }

    private class Appointment {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("href")
        @Expose
        private String href;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("@referredType")
        @Expose
        private String referredType;

    }

    private class BillingAccount {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("href")
        @Expose
        private String href;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("@baseType")
        @Expose
        private Object baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private Object schemaLocation;
        @SerializedName("@type")
        @Expose
        private Object type;
        @SerializedName("@referredType")
        @Expose
        private Object referredType;

    }

    private class BillingAccount__1 {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("href")
        @Expose
        private String href;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("@referredType")
        @Expose
        private String referredType;

    }

    private class BillingAccount__2 {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("href")
        @Expose
        private String href;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("@referredType")
        @Expose
        private String referredType;

    }

    private class BillingAccount__3 {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("href")
        @Expose
        private String href;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("@referredType")
        @Expose
        private String referredType;

    }

    private class BillingAccount__4 {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("href")
        @Expose
        private String href;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("@referredType")
        @Expose
        private String referredType;

    }

    private class BillingAccount__5 {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("href")
        @Expose
        private String href;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("@referredType")
        @Expose
        private String referredType;

    }

    private class BillingAccount__6 {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("href")
        @Expose
        private String href;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("@referredType")
        @Expose
        private String referredType;

    }

    private class Channel {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("href")
        @Expose
        private String href;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("role")
        @Expose
        private String role;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("@referredType")
        @Expose
        private String referredType;

    }

    private class Duration {

        @SerializedName("amount")
        @Expose
        private Float amount;
        @SerializedName("units")
        @Expose
        private String units;

    }

    private class Duration__1 {

        @SerializedName("amount")
        @Expose
        private Float amount;
        @SerializedName("units")
        @Expose
        private String units;

    }

    private class DutyFreeAmount {

        @SerializedName("unit")
        @Expose
        private String unit;
        @SerializedName("value")
        @Expose
        private Float value;

    }

    private class DutyFreeAmount__1 {

        @SerializedName("unit")
        @Expose
        private String unit;
        @SerializedName("value")
        @Expose
        private Float value;

    }

    private class DutyFreeAmount__2 {

        @SerializedName("unit")
        @Expose
        private String unit;
        @SerializedName("value")
        @Expose
        private Float value;

    }

    private class DutyFreeAmount__3 {

        @SerializedName("unit")
        @Expose
        private String unit;
        @SerializedName("value")
        @Expose
        private Float value;

    }

    private class DutyFreeAmount__4 {

        @SerializedName("unit")
        @Expose
        private String unit;
        @SerializedName("value")
        @Expose
        private Float value;

    }

    private class DutyFreeAmount__5 {

        @SerializedName("unit")
        @Expose
        private String unit;
        @SerializedName("value")
        @Expose
        private Float value;

    }

    private class DutyFreeAmount__6 {

        @SerializedName("unit")
        @Expose
        private String unit;
        @SerializedName("value")
        @Expose
        private Float value;

    }

    private class DutyFreeAmount__7 {

        @SerializedName("unit")
        @Expose
        private String unit;
        @SerializedName("value")
        @Expose
        private Float value;

    }

    private class ItemPrice {

        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("priceType")
        @Expose
        private String priceType;
        @SerializedName("recurringChargePeriod")
        @Expose
        private String recurringChargePeriod;
        @SerializedName("unitOfMeasure")
        @Expose
        private String unitOfMeasure;
        @SerializedName("price")
        @Expose
        private Price__4 price;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("billingAccount")
        @Expose
        private BillingAccount__5 billingAccount;
        @SerializedName("priceAlteration")
        @Expose
        private List<PriceAlteration__1> priceAlteration = null;
        @SerializedName("productOfferingPrice")
        @Expose
        private ProductOfferingPrice__5 productOfferingPrice;

    }

    private class ItemTerm {

        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("duration")
        @Expose
        private Duration__1 duration;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;

    }

    private class ItemTotalPrice {

        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("priceType")
        @Expose
        private String priceType;
        @SerializedName("recurringChargePeriod")
        @Expose
        private String recurringChargePeriod;
        @SerializedName("unitOfMeasure")
        @Expose
        private String unitOfMeasure;
        @SerializedName("price")
        @Expose
        private Price__6 price;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("billingAccount")
        @Expose
        private BillingAccount__6 billingAccount;
        @SerializedName("priceAlteration")
        @Expose
        private List<PriceAlteration__2> priceAlteration = null;
        @SerializedName("productOfferingPrice")
        @Expose
        private ProductOfferingPrice__7 productOfferingPrice;

    }

    private class Note {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("author")
        @Expose
        private String author;
        @SerializedName("date")
        @Expose
        private String date;
        @SerializedName("text")
        @Expose
        private String text;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;

    }

    private class OrderTotalPrice {

        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("priceType")
        @Expose
        private String priceType;
        @SerializedName("recurringChargePeriod")
        @Expose
        private String recurringChargePeriod;
        @SerializedName("unitOfMeasure")
        @Expose
        private String unitOfMeasure;
        @SerializedName("price")
        @Expose
        private Price price;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("billingAccount")
        @Expose
        private BillingAccount__1 billingAccount;
        @SerializedName("priceAlteration")
        @Expose
        private List<PriceAlteration> priceAlteration = null;
        @SerializedName("productOfferingPrice")
        @Expose
        private ProductOfferingPrice__1 productOfferingPrice;

    }

    private class Payment {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("href")
        @Expose
        private String href;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("@referredType")
        @Expose
        private String referredType;

    }

    private class Payment__1 {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("href")
        @Expose
        private String href;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("@referredType")
        @Expose
        private String referredType;

    }

    private class Place {

        @SerializedName("href")
        @Expose
        private String href;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("role")
        @Expose
        private String role;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("@referredType")
        @Expose
        private String referredType;

    }

    private class Price {

        @SerializedName("percentage")
        @Expose
        private Float percentage;
        @SerializedName("taxrate")
        @Expose
        private Float taxrate;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("dutyFreeAmount")
        @Expose
        private DutyFreeAmount dutyFreeAmount;
        @SerializedName("taxIncludedAmount")
        @Expose
        private TaxIncludedAmount taxIncludedAmount;

    }

    private class PriceAlteration {

        @SerializedName("applicationDuration")
        @Expose
        private Integer applicationDuration;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("priceType")
        @Expose
        private String priceType;
        @SerializedName("priority")
        @Expose
        private Integer priority;
        @SerializedName("recurringChargePeriod")
        @Expose
        private String recurringChargePeriod;
        @SerializedName("unitOfMeasure")
        @Expose
        private String unitOfMeasure;
        @SerializedName("price")
        @Expose
        private Price__1 price;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("productOfferingPrice")
        @Expose
        private ProductOfferingPrice productOfferingPrice;

    }

    private class PriceAlteration__1 {

        @SerializedName("applicationDuration")
        @Expose
        private Integer applicationDuration;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("priceType")
        @Expose
        private String priceType;
        @SerializedName("priority")
        @Expose
        private Integer priority;
        @SerializedName("recurringChargePeriod")
        @Expose
        private String recurringChargePeriod;
        @SerializedName("unitOfMeasure")
        @Expose
        private String unitOfMeasure;
        @SerializedName("price")
        @Expose
        private Price__5 price;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("productOfferingPrice")
        @Expose
        private ProductOfferingPrice__4 productOfferingPrice;

    }

    private class PriceAlteration__2 {

        @SerializedName("applicationDuration")
        @Expose
        private Integer applicationDuration;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("priceType")
        @Expose
        private String priceType;
        @SerializedName("priority")
        @Expose
        private Integer priority;
        @SerializedName("recurringChargePeriod")
        @Expose
        private String recurringChargePeriod;
        @SerializedName("unitOfMeasure")
        @Expose
        private String unitOfMeasure;
        @SerializedName("price")
        @Expose
        private Price__7 price;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("productOfferingPrice")
        @Expose
        private ProductOfferingPrice__6 productOfferingPrice;

    }

    private class Price__1 {

        @SerializedName("percentage")
        @Expose
        private Float percentage;
        @SerializedName("taxrate")
        @Expose
        private Float taxrate;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("dutyFreeAmount")
        @Expose
        private DutyFreeAmount__1 dutyFreeAmount;
        @SerializedName("taxIncludedAmount")
        @Expose
        private TaxIncludedAmount__1 taxIncludedAmount;

    }

    private class Price__2 {

        @SerializedName("percentage")
        @Expose
        private Float percentage;
        @SerializedName("taxrate")
        @Expose
        private Float taxrate;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("dutyFreeAmount")
        @Expose
        private DutyFreeAmount__2 dutyFreeAmount;
        @SerializedName("taxIncludedAmount")
        @Expose
        private TaxIncludedAmount__2 taxIncludedAmount;

    }

    private class Price__3 {

        @SerializedName("percentage")
        @Expose
        private Float percentage;
        @SerializedName("taxrate")
        @Expose
        private Float taxrate;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("dutyFreeAmount")
        @Expose
        private DutyFreeAmount__3 dutyFreeAmount;
        @SerializedName("taxIncludedAmount")
        @Expose
        private TaxIncludedAmount__3 taxIncludedAmount;

    }

    private class Price__4 {

        @SerializedName("percentage")
        @Expose
        private Float percentage;
        @SerializedName("taxrate")
        @Expose
        private Float taxrate;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("dutyFreeAmount")
        @Expose
        private DutyFreeAmount__4 dutyFreeAmount;
        @SerializedName("taxIncludedAmount")
        @Expose
        private TaxIncludedAmount__4 taxIncludedAmount;

    }

    private class Price__5 {

        @SerializedName("percentage")
        @Expose
        private Float percentage;
        @SerializedName("taxrate")
        @Expose
        private Float taxrate;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("dutyFreeAmount")
        @Expose
        private DutyFreeAmount__5 dutyFreeAmount;
        @SerializedName("taxIncludedAmount")
        @Expose
        private TaxIncludedAmount__5 taxIncludedAmount;

    }

    private class Price__6 {

        @SerializedName("percentage")
        @Expose
        private Float percentage;
        @SerializedName("taxrate")
        @Expose
        private Float taxrate;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("dutyFreeAmount")
        @Expose
        private DutyFreeAmount__6 dutyFreeAmount;
        @SerializedName("taxIncludedAmount")
        @Expose
        private TaxIncludedAmount__6 taxIncludedAmount;

    }

    private class Price__7 {

        @SerializedName("percentage")
        @Expose
        private Float percentage;
        @SerializedName("taxrate")
        @Expose
        private Float taxrate;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("dutyFreeAmount")
        @Expose
        private DutyFreeAmount__7 dutyFreeAmount;
        @SerializedName("taxIncludedAmount")
        @Expose
        private TaxIncludedAmount__7 taxIncludedAmount;

    }

    private class Product {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("href")
        @Expose
        private String href;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("isBundle")
        @Expose
        private Boolean isBundle;
        @SerializedName("isCustomerVisible")
        @Expose
        private Boolean isCustomerVisible;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("orderDate")
        @Expose
        private String orderDate;
        @SerializedName("productSerialNumber")
        @Expose
        private String productSerialNumber;
        @SerializedName("startDate")
        @Expose
        private String startDate;
        @SerializedName("terminationDate")
        @Expose
        private String terminationDate;
        @SerializedName("productstring")
        @Expose
        private Object productstring;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("agreement")
        @Expose
        private List<Agreement__1> agreement = null;
        @SerializedName("place")
        @Expose
        private List<Place> place = null;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("@referredType")
        @Expose
        private String referredType;
        @SerializedName("billingAccount")
        @Expose
        private BillingAccount__2 billingAccount;
        @SerializedName("productCharacteristic")
        @Expose
        private List<ProductCharacteristic> productCharacteristic = null;
        @SerializedName("productOrderItem")
        @Expose
        private List<ProductOrderItem__1> productOrderItem = null;
        @SerializedName("productPrice")
        @Expose
        private List<ProductPrice> productPrice = null;
        @SerializedName("productTerm")
        @Expose
        private List<ProductTerm> productTerm = null;
        @SerializedName("productOffering")
        @Expose
        private ProductOffering productOffering;
        @SerializedName("productSpecification")
        @Expose
        private ProductSpecification productSpecification;
        @SerializedName("productRelationship")
        @Expose
        private List<ProductRelationship> productRelationship = null;
        @SerializedName("realizingResource")
        @Expose
        private List<RealizingResource> realizingResource = null;
        @SerializedName("realizingService")
        @Expose
        private List<RealizingService> realizingService = null;
        @SerializedName("relatedParty")
        @Expose
        private List<RelatedParty> relatedParty = null;

    }

    private class ProductCharacteristic {

        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("valueType")
        @Expose
        private String valueType;
        @SerializedName("value")
        @Expose
        private String value;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;

    }

    private class ProductOffering {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("href")
        @Expose
        private String href;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("@referredType")
        @Expose
        private String referredType;

    }

    private class ProductOfferingPrice {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("href")
        @Expose
        private String href;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("@referredType")
        @Expose
        private String referredType;

    }

    private class ProductOfferingPrice__1 {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("href")
        @Expose
        private String href;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("@referredType")
        @Expose
        private String referredType;

    }

    private class ProductOfferingPrice__2 {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("href")
        @Expose
        private String href;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("@referredType")
        @Expose
        private String referredType;

    }

    private class ProductOfferingPrice__3 {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("href")
        @Expose
        private String href;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("@referredType")
        @Expose
        private String referredType;

    }

    private class ProductOfferingPrice__4 {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("href")
        @Expose
        private String href;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("@referredType")
        @Expose
        private String referredType;

    }

    private class ProductOfferingPrice__5 {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("href")
        @Expose
        private String href;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("@referredType")
        @Expose
        private String referredType;

    }

    private class ProductOfferingPrice__6 {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("href")
        @Expose
        private String href;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("@referredType")
        @Expose
        private String referredType;

    }

    private class ProductOfferingPrice__7 {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("href")
        @Expose
        private String href;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("@referredType")
        @Expose
        private String referredType;

    }

    private class ProductOfferingQualification {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("href")
        @Expose
        private String href;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("@referredType")
        @Expose
        private String referredType;

    }

    private class ProductOfferingQualificationItem {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("href")
        @Expose
        private String href;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("referredtype")
        @Expose
        private String referredtype;
        @SerializedName("productOfferingQualificationHref")
        @Expose
        private String productOfferingQualificationHref;
        @SerializedName("productOfferingQualificationId")
        @Expose
        private String productOfferingQualificationId;
        @SerializedName("productOfferingQualificationName")
        @Expose
        private String productOfferingQualificationName;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("@referredType")
        @Expose
        private String referredType;

    }

    private class ProductOffering__1 {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("href")
        @Expose
        private String href;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("@referredType")
        @Expose
        private String referredType;

    }

    @Getter
    public class ProductOrderItem {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("quantity")
        @Expose
        private Integer quantity;
        @SerializedName("action")
        @Expose
        private String action;
        @SerializedName("appointment")
        @Expose
        private Appointment appointment;
        @SerializedName("productorderitemstring")
        @Expose
        private Object productorderitemstring;
        @SerializedName("state")
        @Expose
        private String state;
        @SerializedName("payment")
        @Expose
        private List<Payment__1> payment = null;
        @SerializedName("product")
        @Expose
        private Product product;
        @SerializedName("qualification")
        @Expose
        private List<Qualification> qualification = null;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("billingAccount")
        @Expose
        private BillingAccount__4 billingAccount;
        @SerializedName("itemPrice")
        @Expose
        private List<ItemPrice> itemPrice = null;
        @SerializedName("itemTerm")
        @Expose
        private List<ItemTerm> itemTerm = null;
        @SerializedName("itemTotalPrice")
        @Expose
        private List<ItemTotalPrice> itemTotalPrice = null;
        @SerializedName("productOfferingQualificationItem")
        @Expose
        private ProductOfferingQualificationItem productOfferingQualificationItem;
        @SerializedName("productOffering")
        @Expose
        private ProductOffering__1 productOffering;
        @SerializedName("productOrderItemRelationship")
        @Expose
        private List<ProductOrderItemRelationship> productOrderItemRelationship = null;
        @SerializedName("quoteItem")
        @Expose
        private QuoteItem quoteItem;

    }

    private class ProductOrderItemRelationship {

        @SerializedName("relationshipType")
        @Expose
        private String relationshipType;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;

    }

    private class ProductOrderItem__1 {

        @SerializedName("orderItemAction")
        @Expose
        private String orderItemAction;
        @SerializedName("orderItemId")
        @Expose
        private String orderItemId;
        @SerializedName("productOrderHref")
        @Expose
        private String productOrderHref;
        @SerializedName("productOrderId")
        @Expose
        private String productOrderId;
        @SerializedName("role")
        @Expose
        private String role;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("@referredType")
        @Expose
        private String referredType;

    }

    private class ProductPrice {

        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("priceType")
        @Expose
        private String priceType;
        @SerializedName("recurringChargePeriod")
        @Expose
        private String recurringChargePeriod;
        @SerializedName("unitOfMeasure")
        @Expose
        private String unitOfMeasure;
        @SerializedName("price")
        @Expose
        private Price__2 price;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("billingAccount")
        @Expose
        private BillingAccount__3 billingAccount;
        @SerializedName("productPriceAlteration")
        @Expose
        private List<ProductPriceAlteration> productPriceAlteration = null;
        @SerializedName("productOfferingPrice")
        @Expose
        private ProductOfferingPrice__3 productOfferingPrice;

    }

    private class ProductPriceAlteration {

        @SerializedName("applicationDuration")
        @Expose
        private Integer applicationDuration;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("priceType")
        @Expose
        private String priceType;
        @SerializedName("priority")
        @Expose
        private Integer priority;
        @SerializedName("recurringChargePeriod")
        @Expose
        private String recurringChargePeriod;
        @SerializedName("unitOfMeasure")
        @Expose
        private String unitOfMeasure;
        @SerializedName("price")
        @Expose
        private Price__3 price;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("productOfferingPrice")
        @Expose
        private ProductOfferingPrice__2 productOfferingPrice;

    }

    private class ProductRelationship {

        @SerializedName("relationshipType")
        @Expose
        private String relationshipType;
        @SerializedName("product")
        @Expose
        private String product;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;

    }

    private class ProductSpecification {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("href")
        @Expose
        private String href;
        @SerializedName("version")
        @Expose
        private String version;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("@referredType")
        @Expose
        private String referredType;
        @SerializedName("targetProductSchema")
        @Expose
        private TargetProductSchema targetProductSchema;

    }

    private class ProductTerm {

        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("duration")
        @Expose
        private Duration duration;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("validFor")
        @Expose
        private ValidFor validFor;

    }

    private class Qualification {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("href")
        @Expose
        private String href;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("@referredType")
        @Expose
        private String referredType;

    }

    private class Quote {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("href")
        @Expose
        private String href;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("@referredType")
        @Expose
        private String referredType;

    }

    private class QuoteItem {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("href")
        @Expose
        private String href;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("quoteHref")
        @Expose
        private String quoteHref;
        @SerializedName("quoteId")
        @Expose
        private String quoteId;
        @SerializedName("quoteName")
        @Expose
        private String quoteName;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;

    }

    private class RealizingResource {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("href")
        @Expose
        private String href;
        @SerializedName("value")
        @Expose
        private String value;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("@referredType")
        @Expose
        private String referredType;

    }

    private class RealizingService {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("href")
        @Expose
        private String href;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("@referredType")
        @Expose
        private String referredType;

    }

    private class RelatedParty {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("href")
        @Expose
        private String href;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("role")
        @Expose
        private String role;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("@referredType")
        @Expose
        private String referredType;

    }

    private class RelatedParty__1 {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("href")
        @Expose
        private String href;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("role")
        @Expose
        private String role;
        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("@referredType")
        @Expose
        private String referredType;

    }

    private class TargetProductSchema {

        @SerializedName("@baseType")
        @Expose
        private String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        private String schemaLocation;
        @SerializedName("@type")
        @Expose
        private String type;

    }

    private class TaxIncludedAmount {

        @SerializedName("unit")
        @Expose
        private String unit;
        @SerializedName("value")
        @Expose
        private Float value;

    }

    private class TaxIncludedAmount__1 {

        @SerializedName("unit")
        @Expose
        private String unit;
        @SerializedName("value")
        @Expose
        private Float value;

    }

    private class TaxIncludedAmount__2 {

        @SerializedName("unit")
        @Expose
        private String unit;
        @SerializedName("value")
        @Expose
        private Float value;

    }

    private class TaxIncludedAmount__3 {

        @SerializedName("unit")
        @Expose
        private String unit;
        @SerializedName("value")
        @Expose
        private Float value;

    }

    private class TaxIncludedAmount__4 {

        @SerializedName("unit")
        @Expose
        private String unit;
        @SerializedName("value")
        @Expose
        private Float value;

    }

    private class TaxIncludedAmount__5 {

        @SerializedName("unit")
        @Expose
        private String unit;
        @SerializedName("value")
        @Expose
        private Float value;

    }

    private class TaxIncludedAmount__6 {

        @SerializedName("unit")
        @Expose
        private String unit;
        @SerializedName("value")
        @Expose
        private Float value;

    }

    private class TaxIncludedAmount__7 {

        @SerializedName("unit")
        @Expose
        private String unit;
        @SerializedName("value")
        @Expose
        private Float value;

    }

    private class ValidFor {

        @SerializedName("startDateTime")
        @Expose
        private String startDateTime;
        @SerializedName("endDateTime")
        @Expose
        private String endDateTime;

    }
}
