package com.exos.services.ordermanagement;

import com.exos.AbstractHttpSpecification;
import com.exos.Properties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.mashape.unirest.http.HttpMethod;
import lombok.Builder;
import lombok.experimental.Accessors;

import java.util.List;


@Builder
@Accessors(chain = true)
public class CreateProductOrderReq extends AbstractHttpSpecification {

    @Override
    protected HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    protected String getEndpointUrl() {
        return Properties.ORDER_MANAGEMENT_SERVER_HOSTNAME + "/api/product-order/";
    } //todo remove the backslash at the end as it's not required but fails without it due to a bug

    @SerializedName("cancellationDate")
    @Expose
    public String cancellationDate;
    @SerializedName("cancellationReason")
    @Expose
    public String cancellationReason;
    @SerializedName("category")
    @Expose
    public String category;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("externalId")
    @Expose
    public String externalId;
    @SerializedName("notificationContact")
    @Expose
    public String notificationContact;
    @SerializedName("priority")
    @Expose
    public String priority;
    @SerializedName("requestedCompletionDate")
    @Expose
    public String requestedCompletionDate;
    @SerializedName("requestedStartDate")
    @Expose
    public String requestedStartDate;
    @SerializedName("billing_account")
    @Expose
    public BillingAccount billingAccount;
    @SerializedName("agreement")
    @Expose
    public List<Agreement> agreement = null;
    @SerializedName("channel")
    @Expose
    public List<Channel> channel = null;
    @SerializedName("note")
    @Expose
    public List<Note> note = null;
    @SerializedName("payment")
    @Expose
    public List<Payment> payment = null;
    @SerializedName("productOfferingQualification")
    @Expose
    public List<ProductOfferingQualification> productOfferingQualification = null;
    @SerializedName("quote")
    @Expose
    public List<Quote> quote = null;
    @SerializedName("orderTotalPrice")
    @Expose
    public List<OrderTotalPrice> orderTotalPrice = null;
    @SerializedName("relatedParty")
    @Expose
    public List<RelatedParty> relatedParty = null;
    @SerializedName("productOrderItem")
    @Expose
    public List<ProductOrderItem> productOrderItem = null;
    @SerializedName("@baseType")
    @Expose
    public String baseType;
    @SerializedName("@schemaLocation")
    @Expose
    public String schemaLocation;
    @SerializedName("@type")
    @Expose
    public String type;


    public class Agreement {

        @SerializedName("id")
        @Expose
        public String id;
        @SerializedName("href")
        @Expose
        public String href;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;
        @SerializedName("@referredType")
        @Expose
        public String referredType;

    }

    public class Agreement__1 {

        @SerializedName("id")
        @Expose
        public String id;
        @SerializedName("href")
        @Expose
        public String href;
        @SerializedName("agreementItemId")
        @Expose
        public String agreementItemId;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;
        @SerializedName("@referredType")
        @Expose
        public String referredType;

    }

    public class Appointment {

        @SerializedName("id")
        @Expose
        public String id;
        @SerializedName("href")
        @Expose
        public String href;
        @SerializedName("description")
        @Expose
        public String description;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;
        @SerializedName("@referredType")
        @Expose
        public String referredType;

    }

    public class BillingAccount {

        @SerializedName("id")
        @Expose
        public String id;
        @SerializedName("href")
        @Expose
        public String href;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;
        @SerializedName("@referredType")
        @Expose
        public String referredType;

    }

    public class BillingAccount__1 {

        @SerializedName("id")
        @Expose
        public String id;
        @SerializedName("href")
        @Expose
        public String href;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;
        @SerializedName("@referredType")
        @Expose
        public String referredType;

    }

    public class BillingAccount__2 {

        @SerializedName("id")
        @Expose
        public String id;
        @SerializedName("href")
        @Expose
        public String href;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;
        @SerializedName("@referredType")
        @Expose
        public String referredType;

    }

    public class BillingAccount__3 {

        @SerializedName("id")
        @Expose
        public String id;
        @SerializedName("href")
        @Expose
        public String href;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;
        @SerializedName("@referredType")
        @Expose
        public String referredType;

    }

    public class BillingAccount__4 {

        @SerializedName("id")
        @Expose
        public String id;
        @SerializedName("href")
        @Expose
        public String href;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;
        @SerializedName("@referredType")
        @Expose
        public String referredType;

    }

    public class BillingAccount__5 {

        @SerializedName("id")
        @Expose
        public String id;
        @SerializedName("href")
        @Expose
        public String href;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;
        @SerializedName("@referredType")
        @Expose
        public String referredType;

    }

    public class BillingAccount__6 {

        @SerializedName("id")
        @Expose
        public String id;
        @SerializedName("href")
        @Expose
        public String href;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;
        @SerializedName("@referredType")
        @Expose
        public String referredType;

    }

    public class Channel {

        @SerializedName("id")
        @Expose
        public String id;
        @SerializedName("href")
        @Expose
        public String href;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("role")
        @Expose
        public String role;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;
        @SerializedName("@referredType")
        @Expose
        public String referredType;

    }

    public class Duration {

        @SerializedName("amount")
        @Expose
        public Integer amount;
        @SerializedName("units")
        @Expose
        public String units;

    }

    public class Duration__1 {

        @SerializedName("amount")
        @Expose
        public Integer amount;
        @SerializedName("units")
        @Expose
        public String units;

    }

    public class DutyFreeAmount {

        @SerializedName("unit")
        @Expose
        public String unit;
        @SerializedName("value")
        @Expose
        public Integer value;

    }

    public class DutyFreeAmount__1 {

        @SerializedName("unit")
        @Expose
        public String unit;
        @SerializedName("value")
        @Expose
        public Integer value;

    }

    public class DutyFreeAmount__2 {

        @SerializedName("unit")
        @Expose
        public String unit;
        @SerializedName("value")
        @Expose
        public Integer value;

    }

    public class DutyFreeAmount__3 {

        @SerializedName("unit")
        @Expose
        public String unit;
        @SerializedName("value")
        @Expose
        public Integer value;

    }

    public class DutyFreeAmount__4 {

        @SerializedName("unit")
        @Expose
        public String unit;
        @SerializedName("value")
        @Expose
        public Integer value;

    }

    public class DutyFreeAmount__5 {

        @SerializedName("unit")
        @Expose
        public String unit;
        @SerializedName("value")
        @Expose
        public Integer value;

    }

    public class DutyFreeAmount__6 {

        @SerializedName("unit")
        @Expose
        public String unit;
        @SerializedName("value")
        @Expose
        public Integer value;

    }

    public class DutyFreeAmount__7 {

        @SerializedName("unit")
        @Expose
        public String unit;
        @SerializedName("value")
        @Expose
        public Integer value;

    }

    public class ItemPrice {

        @SerializedName("description")
        @Expose
        public String description;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("priceType")
        @Expose
        public String priceType;
        @SerializedName("recurringChargePeriod")
        @Expose
        public String recurringChargePeriod;
        @SerializedName("unitOfMeasure")
        @Expose
        public String unitOfMeasure;
        @SerializedName("billingAccount")
        @Expose
        public BillingAccount__3 billingAccount;
        @SerializedName("price")
        @Expose
        public Price__2 price;
        @SerializedName("priceAlteration")
        @Expose
        public List<PriceAlteration__1> priceAlteration = null;
        @SerializedName("productOfferingPrice")
        @Expose
        public ProductOfferingPrice__3 productOfferingPrice;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;

    }

    public class ItemTerm {

        @SerializedName("description")
        @Expose
        public String description;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("duration")
        @Expose
        public Duration duration;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;

    }

    public class ItemTotalPrice {

        @SerializedName("description")
        @Expose
        public String description;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("priceType")
        @Expose
        public String priceType;
        @SerializedName("recurringChargePeriod")
        @Expose
        public String recurringChargePeriod;
        @SerializedName("unitOfMeasure")
        @Expose
        public String unitOfMeasure;
        @SerializedName("billingAccount")
        @Expose
        public BillingAccount__4 billingAccount;
        @SerializedName("price")
        @Expose
        public Price__4 price;
        @SerializedName("priceAlteration")
        @Expose
        public List<PriceAlteration__2> priceAlteration = null;
        @SerializedName("productOfferingPrice")
        @Expose
        public ProductOfferingPrice__5 productOfferingPrice;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;

    }

    public class Note {

        @SerializedName("id")
        @Expose
        public String id;
        @SerializedName("author")
        @Expose
        public String author;
        @SerializedName("date")
        @Expose
        public String date;
        @SerializedName("text")
        @Expose
        public String text;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;

    }

    public class OrderTotalPrice {

        @SerializedName("description")
        @Expose
        public String description;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("priceType")
        @Expose
        public String priceType;
        @SerializedName("recurringChargePeriod")
        @Expose
        public String recurringChargePeriod;
        @SerializedName("unitOfMeasure")
        @Expose
        public String unitOfMeasure;
        @SerializedName("billingAccount")
        @Expose
        public BillingAccount__1 billingAccount;
        @SerializedName("price")
        @Expose
        public Price price;
        @SerializedName("priceAlteration")
        @Expose
        public List<PriceAlteration> priceAlteration = null;
        @SerializedName("productOfferingPrice")
        @Expose
        public ProductOfferingPrice__1 productOfferingPrice;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;

    }

    public class Payment {

        @SerializedName("id")
        @Expose
        public String id;
        @SerializedName("href")
        @Expose
        public String href;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;
        @SerializedName("@referredType")
        @Expose
        public String referredType;

    }

    public class Payment__1 {

        @SerializedName("id")
        @Expose
        public String id;
        @SerializedName("href")
        @Expose
        public String href;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;
        @SerializedName("@referredType")
        @Expose
        public String referredType;

    }

    public class Place {

        @SerializedName("id")
        @Expose
        public String id;
        @SerializedName("href")
        @Expose
        public String href;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("role")
        @Expose
        public String role;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;
        @SerializedName("@referredType")
        @Expose
        public String referredType;

    }

    public class Price {

        @SerializedName("percentage")
        @Expose
        public Integer percentage;
        @SerializedName("taxrate")
        @Expose
        public Integer taxrate;
        @SerializedName("dutyFreeAmount")
        @Expose
        public DutyFreeAmount dutyFreeAmount;
        @SerializedName("taxIncludedAmount")
        @Expose
        public TaxIncludedAmount taxIncludedAmount;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;

    }

    public class PriceAlteration {

        @SerializedName("applicationDuration")
        @Expose
        public Integer applicationDuration;
        @SerializedName("description")
        @Expose
        public String description;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("priceType")
        @Expose
        public String priceType;
        @SerializedName("priority")
        @Expose
        public Integer priority;
        @SerializedName("recurringChargePeriod")
        @Expose
        public String recurringChargePeriod;
        @SerializedName("unitOfMeasure")
        @Expose
        public String unitOfMeasure;
        @SerializedName("price")
        @Expose
        public Price__1 price;
        @SerializedName("productOfferingPrice")
        @Expose
        public ProductOfferingPrice productOfferingPrice;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;

    }

    public class PriceAlteration__1 {

        @SerializedName("applicationDuration")
        @Expose
        public Integer applicationDuration;
        @SerializedName("description")
        @Expose
        public String description;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("priceType")
        @Expose
        public String priceType;
        @SerializedName("priority")
        @Expose
        public Integer priority;
        @SerializedName("recurringChargePeriod")
        @Expose
        public String recurringChargePeriod;
        @SerializedName("unitOfMeasure")
        @Expose
        public String unitOfMeasure;
        @SerializedName("price")
        @Expose
        public Price__3 price;
        @SerializedName("productOfferingPrice")
        @Expose
        public ProductOfferingPrice__2 productOfferingPrice;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;

    }

    public class PriceAlteration__2 {

        @SerializedName("applicationDuration")
        @Expose
        public Integer applicationDuration;
        @SerializedName("description")
        @Expose
        public String description;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("priceType")
        @Expose
        public String priceType;
        @SerializedName("priority")
        @Expose
        public Integer priority;
        @SerializedName("recurringChargePeriod")
        @Expose
        public String recurringChargePeriod;
        @SerializedName("unitOfMeasure")
        @Expose
        public String unitOfMeasure;
        @SerializedName("price")
        @Expose
        public Price__5 price;
        @SerializedName("productOfferingPrice")
        @Expose
        public ProductOfferingPrice__4 productOfferingPrice;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;

    }

    public class Price__1 {

        @SerializedName("percentage")
        @Expose
        public Integer percentage;
        @SerializedName("taxrate")
        @Expose
        public Integer taxrate;
        @SerializedName("dutyFreeAmount")
        @Expose
        public DutyFreeAmount__1 dutyFreeAmount;
        @SerializedName("taxIncludedAmount")
        @Expose
        public TaxIncludedAmount__1 taxIncludedAmount;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;

    }

    public class Price__2 {

        @SerializedName("percentage")
        @Expose
        public Integer percentage;
        @SerializedName("taxrate")
        @Expose
        public Integer taxrate;
        @SerializedName("dutyFreeAmount")
        @Expose
        public DutyFreeAmount__2 dutyFreeAmount;
        @SerializedName("taxIncludedAmount")
        @Expose
        public TaxIncludedAmount__2 taxIncludedAmount;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;

    }

    public class Price__3 {

        @SerializedName("percentage")
        @Expose
        public Integer percentage;
        @SerializedName("taxrate")
        @Expose
        public Integer taxrate;
        @SerializedName("dutyFreeAmount")
        @Expose
        public DutyFreeAmount__3 dutyFreeAmount;
        @SerializedName("taxIncludedAmount")
        @Expose
        public TaxIncludedAmount__3 taxIncludedAmount;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;

    }

    public class Price__4 {

        @SerializedName("percentage")
        @Expose
        public Integer percentage;
        @SerializedName("taxrate")
        @Expose
        public Integer taxrate;
        @SerializedName("dutyFreeAmount")
        @Expose
        public DutyFreeAmount__4 dutyFreeAmount;
        @SerializedName("taxIncludedAmount")
        @Expose
        public TaxIncludedAmount__4 taxIncludedAmount;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;

    }

    public class Price__5 {

        @SerializedName("percentage")
        @Expose
        public Integer percentage;
        @SerializedName("taxrate")
        @Expose
        public Integer taxrate;
        @SerializedName("dutyFreeAmount")
        @Expose
        public DutyFreeAmount__5 dutyFreeAmount;
        @SerializedName("taxIncludedAmount")
        @Expose
        public TaxIncludedAmount__5 taxIncludedAmount;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;

    }

    public class Price__6 {

        @SerializedName("percentage")
        @Expose
        public Integer percentage;
        @SerializedName("taxrate")
        @Expose
        public Integer taxrate;
        @SerializedName("dutyFreeAmount")
        @Expose
        public DutyFreeAmount__6 dutyFreeAmount;
        @SerializedName("taxIncludedAmount")
        @Expose
        public TaxIncludedAmount__6 taxIncludedAmount;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;

    }

    public class Price__7 {

        @SerializedName("percentage")
        @Expose
        public Integer percentage;
        @SerializedName("taxrate")
        @Expose
        public Integer taxrate;
        @SerializedName("dutyFreeAmount")
        @Expose
        public DutyFreeAmount__7 dutyFreeAmount;
        @SerializedName("taxIncludedAmount")
        @Expose
        public TaxIncludedAmount__7 taxIncludedAmount;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;

    }

    public class Product {

        @SerializedName("id")
        @Expose
        public String id;
        @SerializedName("href")
        @Expose
        public String href;
        @SerializedName("description")
        @Expose
        public String description;
        @SerializedName("isBundle")
        @Expose
        public Boolean isBundle;
        @SerializedName("isCustomerVisible")
        @Expose
        public Boolean isCustomerVisible;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("orderDate")
        @Expose
        public String orderDate;
        @SerializedName("productSerialNumber")
        @Expose
        public String productSerialNumber;
        @SerializedName("startDate")
        @Expose
        public String startDate;
        @SerializedName("terminationDate")
        @Expose
        public String terminationDate;
        @SerializedName("agreement")
        @Expose
        public List<Agreement__1> agreement = null;
        @SerializedName("billingAccount")
        @Expose
        public BillingAccount__5 billingAccount;
        @SerializedName("place")
        @Expose
        public List<Place> place = null;
        @SerializedName("productCharacteristic")
        @Expose
        public List<ProductCharacteristic> productCharacteristic = null;
        @SerializedName("productOffering")
        @Expose
        public ProductOffering productOffering;
        @SerializedName("productOrderItem")
        @Expose
        public List<ProductOrderItem__1> productOrderItem = null;
        @SerializedName("productPrice")
        @Expose
        public List<ProductPrice> productPrice = null;
        @SerializedName("productRelationship")
        @Expose
        public List<ProductRelationship> productRelationship = null;
        @SerializedName("productSpecification")
        @Expose
        public ProductSpecification productSpecification;
        @SerializedName("productTerm")
        @Expose
        public List<ProductTerm> productTerm = null;
        @SerializedName("realizingResource")
        @Expose
        public List<RealizingResource> realizingResource = null;
        @SerializedName("realizingService")
        @Expose
        public List<RealizingService> realizingService = null;
        @SerializedName("relatedParty")
        @Expose
        public List<RelatedParty__1> relatedParty = null;
        @SerializedName("status")
        @Expose
        public String status;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;
        @SerializedName("@referredType")
        @Expose
        public String referredType;

    }

    public class ProductCharacteristic {

        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("valueType")
        @Expose
        public String valueType;
        @SerializedName("value")
        @Expose
        public String value;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;

    }

    public class ProductOffering {

        @SerializedName("id")
        @Expose
        public String id;
        @SerializedName("href")
        @Expose
        public String href;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;
        @SerializedName("@referredType")
        @Expose
        public String referredType;

    }

    public class ProductOfferingPrice {

        @SerializedName("id")
        @Expose
        public String id;
        @SerializedName("href")
        @Expose
        public String href;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;
        @SerializedName("@referredType")
        @Expose
        public String referredType;

    }

    public class ProductOfferingPrice__1 {

        @SerializedName("id")
        @Expose
        public String id;
        @SerializedName("href")
        @Expose
        public String href;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;
        @SerializedName("@referredType")
        @Expose
        public String referredType;

    }

    public class ProductOfferingPrice__2 {

        @SerializedName("id")
        @Expose
        public String id;
        @SerializedName("href")
        @Expose
        public String href;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;
        @SerializedName("@referredType")
        @Expose
        public String referredType;

    }

    public class ProductOfferingPrice__3 {

        @SerializedName("id")
        @Expose
        public String id;
        @SerializedName("href")
        @Expose
        public String href;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;
        @SerializedName("@referredType")
        @Expose
        public String referredType;

    }

    public class ProductOfferingPrice__4 {

        @SerializedName("id")
        @Expose
        public String id;
        @SerializedName("href")
        @Expose
        public String href;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;
        @SerializedName("@referredType")
        @Expose
        public String referredType;

    }

    public class ProductOfferingPrice__5 {

        @SerializedName("id")
        @Expose
        public String id;
        @SerializedName("href")
        @Expose
        public String href;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;
        @SerializedName("@referredType")
        @Expose
        public String referredType;

    }

    public class ProductOfferingPrice__6 {

        @SerializedName("id")
        @Expose
        public String id;
        @SerializedName("href")
        @Expose
        public String href;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;
        @SerializedName("@referredType")
        @Expose
        public String referredType;

    }

    public class ProductOfferingPrice__7 {

        @SerializedName("id")
        @Expose
        public String id;
        @SerializedName("href")
        @Expose
        public String href;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;
        @SerializedName("@referredType")
        @Expose
        public String referredType;

    }

    public class ProductOfferingQualification {

        @SerializedName("id")
        @Expose
        public String id;
        @SerializedName("href")
        @Expose
        public String href;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;
        @SerializedName("@referredType")
        @Expose
        public String referredType;

    }

    public class ProductOfferingQualificationItem {

        @SerializedName("id")
        @Expose
        public String id;
        @SerializedName("href")
        @Expose
        public String href;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("productOfferingQualificationHref")
        @Expose
        public String productOfferingQualificationHref;
        @SerializedName("productOfferingQualificationId")
        @Expose
        public String productOfferingQualificationId;
        @SerializedName("productOfferingQualificationName")
        @Expose
        public String productOfferingQualificationName;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;
        @SerializedName("@referredType")
        @Expose
        public String referredType;

    }

    public class ProductOffering__1 {

        @SerializedName("id")
        @Expose
        public String id;
        @SerializedName("href")
        @Expose
        public String href;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;
        @SerializedName("@referredType")
        @Expose
        public String referredType;

    }

    public class ProductOrderItem {

        @SerializedName("id")
        @Expose
        public Integer id;
        @SerializedName("quantity")
        @Expose
        public Integer quantity;
        @SerializedName("action")
        @Expose
        public String action;
        @SerializedName("appointment")
        @Expose
        public Appointment appointment;
        @SerializedName("billingAccount")
        @Expose
        public BillingAccount__2 billingAccount;
        @SerializedName("itemPrice")
        @Expose
        public List<ItemPrice> itemPrice = null;
        @SerializedName("itemTerm")
        @Expose
        public List<ItemTerm> itemTerm = null;
        @SerializedName("itemTotalPrice")
        @Expose
        public List<ItemTotalPrice> itemTotalPrice = null;
        @SerializedName("payment")
        @Expose
        public List<Payment__1> payment = null;
        @SerializedName("product")
        @Expose
        public Product product;
        @SerializedName("productOffering")
        @Expose
        public ProductOffering__1 productOffering;
        @SerializedName("productOfferingQualificationItem")
        @Expose
        public ProductOfferingQualificationItem productOfferingQualificationItem;
        @SerializedName("productOrderItemRelationship")
        @Expose
        public List<ProductOrderItemRelationship> productOrderItemRelationship = null;
        @SerializedName("qualification")
        @Expose
        public List<Qualification> qualification = null;
        @SerializedName("quoteItem")
        @Expose
        public QuoteItem quoteItem;
        @SerializedName("state")
        @Expose
        public String state;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;

    }

    public class ProductOrderItemRelationship {

        @SerializedName("id")
        @Expose
        public String id;
        @SerializedName("relationshipType")
        @Expose
        public String relationshipType;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;

    }

    public class ProductOrderItem__1 {

        @SerializedName("orderItemAction")
        @Expose
        public String orderItemAction;
        @SerializedName("orderItemId")
        @Expose
        public String orderItemId;
        @SerializedName("productOrderHref")
        @Expose
        public String productOrderHref;
        @SerializedName("productOrderId")
        @Expose
        public String productOrderId;
        @SerializedName("role")
        @Expose
        public String role;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;
        @SerializedName("@referredType")
        @Expose
        public String referredType;

    }

    public class ProductPrice {

        @SerializedName("description")
        @Expose
        public String description;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("priceType")
        @Expose
        public String priceType;
        @SerializedName("recurringChargePeriod")
        @Expose
        public String recurringChargePeriod;
        @SerializedName("unitOfMeasure")
        @Expose
        public String unitOfMeasure;
        @SerializedName("billingAccount")
        @Expose
        public BillingAccount__6 billingAccount;
        @SerializedName("price")
        @Expose
        public Price__6 price;
        @SerializedName("productOfferingPrice")
        @Expose
        public ProductOfferingPrice__6 productOfferingPrice;
        @SerializedName("productPriceAlteration")
        @Expose
        public List<ProductPriceAlteration> productPriceAlteration = null;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;

    }

    public class ProductPriceAlteration {

        @SerializedName("applicationDuration")
        @Expose
        public Integer applicationDuration;
        @SerializedName("description")
        @Expose
        public String description;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("priceType")
        @Expose
        public String priceType;
        @SerializedName("priority")
        @Expose
        public Integer priority;
        @SerializedName("recurringChargePeriod")
        @Expose
        public String recurringChargePeriod;
        @SerializedName("unitOfMeasure")
        @Expose
        public String unitOfMeasure;
        @SerializedName("price")
        @Expose
        public Price__7 price;
        @SerializedName("productOfferingPrice")
        @Expose
        public ProductOfferingPrice__7 productOfferingPrice;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;

    }

    public class ProductRelationship {

        @SerializedName("relationshipType")
        @Expose
        public String relationshipType;
        @SerializedName("product")
        @Expose
        public String product;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;

    }

    public class ProductSpecification {

        @SerializedName("id")
        @Expose
        public String id;
        @SerializedName("href")
        @Expose
        public String href;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("version")
        @Expose
        public String version;
        @SerializedName("targetProductSchema")
        @Expose
        public TargetProductSchema targetProductSchema;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;
        @SerializedName("@referredType")
        @Expose
        public String referredType;

    }

    public class ProductTerm {

        @SerializedName("description")
        @Expose
        public String description;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("duration")
        @Expose
        public Duration__1 duration;
        @SerializedName("validFor")
        @Expose
        public ValidFor validFor;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;

    }

    public class Qualification {

        @SerializedName("id")
        @Expose
        public String id;
        @SerializedName("href")
        @Expose
        public String href;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;
        @SerializedName("@referredType")
        @Expose
        public String referredType;

    }

    public class Quote {

        @SerializedName("id")
        @Expose
        public String id;
        @SerializedName("href")
        @Expose
        public String href;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;
        @SerializedName("@referredType")
        @Expose
        public String referredType;

    }

    public class QuoteItem {

        @SerializedName("id")
        @Expose
        public String id;
        @SerializedName("href")
        @Expose
        public String href;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("quoteHref")
        @Expose
        public String quoteHref;
        @SerializedName("quoteId")
        @Expose
        public String quoteId;
        @SerializedName("quoteName")
        @Expose
        public String quoteName;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;
        @SerializedName("@referredType")
        @Expose
        public String referredType;

    }

    public class RealizingResource {

        @SerializedName("id")
        @Expose
        public String id;
        @SerializedName("href")
        @Expose
        public String href;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("value")
        @Expose
        public String value;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;
        @SerializedName("@referredType")
        @Expose
        public String referredType;

    }

    public class RealizingService {

        @SerializedName("id")
        @Expose
        public String id;
        @SerializedName("href")
        @Expose
        public String href;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;
        @SerializedName("@referredType")
        @Expose
        public String referredType;

    }

    public class RelatedParty {

        @SerializedName("id")
        @Expose
        public String id;
        @SerializedName("href")
        @Expose
        public String href;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("role")
        @Expose
        public String role;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;
        @SerializedName("@referredType")
        @Expose
        public String referredType;

    }

    public class RelatedParty__1 {

        @SerializedName("id")
        @Expose
        public String id;
        @SerializedName("href")
        @Expose
        public String href;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("role")
        @Expose
        public String role;
        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;
        @SerializedName("@referredType")
        @Expose
        public String referredType;

    }

    public class TargetProductSchema {

        @SerializedName("@baseType")
        @Expose
        public String baseType;
        @SerializedName("@schemaLocation")
        @Expose
        public String schemaLocation;
        @SerializedName("@type")
        @Expose
        public String type;

    }

    public class TaxIncludedAmount {

        @Builder.Default public String unit = "string";
        @Builder.Default public Integer value = 0;
    }

    public class TaxIncludedAmount__1 {

        @SerializedName("unit")
        @Expose
        public String unit;
        @SerializedName("value")
        @Expose
        public Integer value;

    }

    public class TaxIncludedAmount__2 {

        @SerializedName("unit")
        @Expose
        public String unit;
        @SerializedName("value")
        @Expose
        public Integer value;

    }

    public class TaxIncludedAmount__3 {

        @SerializedName("unit")
        @Expose
        public String unit;
        @SerializedName("value")
        @Expose
        public Integer value;

    }

    public class TaxIncludedAmount__4 {

        @SerializedName("unit")
        @Expose
        public String unit;
        @SerializedName("value")
        @Expose
        public Integer value;

    }

    public class TaxIncludedAmount__5 {

        @SerializedName("unit")
        @Expose
        public String unit;
        @SerializedName("value")
        @Expose
        public Integer value;

    }

    public class TaxIncludedAmount__6 {

        @SerializedName("unit")
        @Expose
        public String unit;
        @SerializedName("value")
        @Expose
        public Integer value;

    }

    public class TaxIncludedAmount__7 {

        @SerializedName("unit")
        @Expose
        public String unit;
        @SerializedName("value")
        @Expose
        public Integer value;

    }

    public class ValidFor {

        @Builder.Default public String endDateTime = "2022-06-29T10:33:12.501Z";
        @Builder.Default public String startDateTime = "2022-06-29T10:33:12.501Z";

    }

}
