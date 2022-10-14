package com.exos.dto.services.ordermanagement;

import com.exos.AbstractHttpSpecification;
import com.exos.Properties;
import com.google.gson.annotations.SerializedName;
import com.mashape.unirest.http.HttpMethod;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.List;


@Builder
@Accessors(chain = true)
@Getter
public class CreateProductOrderReq extends AbstractHttpSpecification {

    @Override
    protected HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    protected String getEndpointUrl() {
        return Properties.ORDER_MANAGEMENT_SERVICE_SERVER_HOSTNAME + "/api/product-order/";
    } //todo remove the backslash at the end as it's not required but fails without it due to a bug

    @SerializedName("cancellationDate")

    public String cancellationDate;
    @SerializedName("cancellationReason")

    public String cancellationReason;
    @SerializedName("category")
    public String category;
    @SerializedName("description")
    public String description;
    @SerializedName("externalId")
    public String externalId;
    @SerializedName("notificationContact")
    public String notificationContact;
    @SerializedName("priority")
    public String priority;
    @SerializedName("requestedCompletionDate")
    public String requestedCompletionDate;
    @SerializedName("requestedStartDate")
    public String requestedStartDate;
    @SerializedName("billing_account")
    public BillingAccount billingAccount;
    @SerializedName("agreement")
    public List<Agreement> agreement = null;
    @SerializedName("channel")
    public List<Channel> channel = null;
    @SerializedName("note")
    public List<Note> note = null;
    @SerializedName("payment")
    public List<Payment> payment = null;
    @SerializedName("productOfferingQualification")
    public List<ProductOfferingQualification> productOfferingQualification = null;
    @SerializedName("quote")
    public List<Quote> quote = null;
    @SerializedName("orderTotalPrice")
    public List<OrderTotalPrice> orderTotalPrice = null;
    @SerializedName("relatedParty")
    public List<RelatedParty> relatedParty = null;
    @SerializedName("productOrderItem")
    public List<ProductOrderItem> productOrderItem = null;
    @SerializedName("@baseType")
    public String baseType;
    @SerializedName("@schemaLocation")
    public String schemaLocation;
    @SerializedName("@type")
    public String type;


    public class Agreement {

        @SerializedName("id")
        public String id;
        @SerializedName("href")
        public String href;
        @SerializedName("name")
        public String name;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;
        @SerializedName("@referredType")
        public String referredType;

    }

    public class Agreement__1 {

        @SerializedName("id")
        public String id;
        @SerializedName("href")
        public String href;
        @SerializedName("agreementItemId")
        public String agreementItemId;
        @SerializedName("name")
        public String name;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;
        @SerializedName("@referredType")
        public String referredType;

    }

    public class Appointment {

        @SerializedName("id")
        public String id;
        @SerializedName("href")
        public String href;
        @SerializedName("description")
        public String description;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;
        @SerializedName("@referredType")
        public String referredType;

    }

    public class BillingAccount {

        @SerializedName("id")
        public String id;
        @SerializedName("href")
        public String href;
        @SerializedName("name")
        public String name;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;
        @SerializedName("@referredType")
        public String referredType;

    }

    public class BillingAccount__1 {

        @SerializedName("id")
        public String id;
        @SerializedName("href")
        public String href;
        @SerializedName("name")
        public String name;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;
        @SerializedName("@referredType")
        public String referredType;

    }

    public class BillingAccount__2 {

        @SerializedName("id")
        public String id;
        @SerializedName("href")
        public String href;
        @SerializedName("name")
        public String name;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;
        @SerializedName("@referredType")
        public String referredType;

    }

    public class BillingAccount__3 {

        @SerializedName("id")
        public String id;
        @SerializedName("href")
        public String href;
        @SerializedName("name")
        public String name;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;
        @SerializedName("@referredType")
        public String referredType;

    }

    public class BillingAccount__4 {

        @SerializedName("id")
        public String id;
        @SerializedName("href")
        public String href;
        @SerializedName("name")
        public String name;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;
        @SerializedName("@referredType")
        public String referredType;

    }

    public class BillingAccount__5 {

        @SerializedName("id")
        public String id;
        @SerializedName("href")
        public String href;
        @SerializedName("name")
        public String name;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;
        @SerializedName("@referredType")
        public String referredType;

    }

    public class BillingAccount__6 {

        @SerializedName("id")
        public String id;
        @SerializedName("href")
        public String href;
        @SerializedName("name")
        public String name;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;
        @SerializedName("@referredType")
        public String referredType;

    }

    public class Channel {

        @SerializedName("id")
        public String id;
        @SerializedName("href")
        public String href;
        @SerializedName("name")
        public String name;
        @SerializedName("role")
        public String role;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;
        @SerializedName("@referredType")
        public String referredType;

    }

    public class Duration {

        @SerializedName("amount")
        public Integer amount;
        @SerializedName("units")
        public String units;

    }

    public class Duration__1 {

        @SerializedName("amount")
        public Integer amount;
        @SerializedName("units")
        public String units;

    }

    public class DutyFreeAmount {

        @SerializedName("unit")
        public String unit;
        @SerializedName("value")
        public Integer value;

    }

    public class DutyFreeAmount__1 {

        @SerializedName("unit")
        public String unit;
        @SerializedName("value")
        public Integer value;

    }

    public class DutyFreeAmount__2 {

        @SerializedName("unit")
        public String unit;
        @SerializedName("value")
        public Integer value;

    }

    public class DutyFreeAmount__3 {

        @SerializedName("unit")
        public String unit;
        @SerializedName("value")
        public Integer value;

    }

    public class DutyFreeAmount__4 {

        @SerializedName("unit")
        public String unit;
        @SerializedName("value")
        public Integer value;

    }

    public class DutyFreeAmount__5 {

        @SerializedName("unit")
        public String unit;
        @SerializedName("value")
        public Integer value;

    }

    public class DutyFreeAmount__6 {

        @SerializedName("unit")
        public String unit;
        @SerializedName("value")
        public Integer value;

    }

    public class DutyFreeAmount__7 {

        @SerializedName("unit")
        public String unit;
        @SerializedName("value")
        public Integer value;

    }

    public class ItemPrice {

        @SerializedName("description")
        public String description;
        @SerializedName("name")
        public String name;
        @SerializedName("priceType")
        public String priceType;
        @SerializedName("recurringChargePeriod")
        public String recurringChargePeriod;
        @SerializedName("unitOfMeasure")
        public String unitOfMeasure;
        @SerializedName("billingAccount")
        public BillingAccount__3 billingAccount;
        @SerializedName("price")
        public Price__2 price;
        @SerializedName("priceAlteration")
        public List<PriceAlteration__1> priceAlteration = null;
        @SerializedName("productOfferingPrice")
        public ProductOfferingPrice__3 productOfferingPrice;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;

    }

    public class ItemTerm {

        @SerializedName("description")
        public String description;
        @SerializedName("name")
        public String name;
        @SerializedName("duration")
        public Duration duration;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;

    }

    public class ItemTotalPrice {

        @SerializedName("description")
        public String description;
        @SerializedName("name")
        public String name;
        @SerializedName("priceType")
        public String priceType;
        @SerializedName("recurringChargePeriod")
        public String recurringChargePeriod;
        @SerializedName("unitOfMeasure")
        public String unitOfMeasure;
        @SerializedName("billingAccount")
        public BillingAccount__4 billingAccount;
        @SerializedName("price")
        public Price__4 price;
        @SerializedName("priceAlteration")
        public List<PriceAlteration__2> priceAlteration = null;
        @SerializedName("productOfferingPrice")
        public ProductOfferingPrice__5 productOfferingPrice;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;

    }

    public class Note {

        @SerializedName("id")
        public String id;
        @SerializedName("author")
        public String author;
        @SerializedName("date")
        public String date;
        @SerializedName("text")
        public String text;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;

    }

    public class OrderTotalPrice {

        @SerializedName("description")
        public String description;
        @SerializedName("name")
        public String name;
        @SerializedName("priceType")
        public String priceType;
        @SerializedName("recurringChargePeriod")
        public String recurringChargePeriod;
        @SerializedName("unitOfMeasure")
        public String unitOfMeasure;
        @SerializedName("billingAccount")
        public BillingAccount__1 billingAccount;
        @SerializedName("price")
        public Price price;
        @SerializedName("priceAlteration")
        public List<PriceAlteration> priceAlteration = null;
        @SerializedName("productOfferingPrice")
        public ProductOfferingPrice__1 productOfferingPrice;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;

    }

    public class Payment {

        @SerializedName("id")
        public String id;
        @SerializedName("href")
        public String href;
        @SerializedName("name")
        public String name;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;
        @SerializedName("@referredType")
        public String referredType;

    }

    public class Payment__1 {

        @SerializedName("id")
        public String id;
        @SerializedName("href")
        public String href;
        @SerializedName("name")
        public String name;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;
        @SerializedName("@referredType")
        public String referredType;

    }

    public class Place {

        @SerializedName("id")
        public String id;
        @SerializedName("href")
        public String href;
        @SerializedName("name")
        public String name;
        @SerializedName("geographicAddressValidation")
        public GeographicAddressValidation geographicAddressValidation;
        @SerializedName("role")
        public String role;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;
        @SerializedName("@referredType")
        public String referredType;

    }

    public class Price {

        @SerializedName("percentage")
        public Integer percentage;
        @SerializedName("taxrate")
        public Integer taxrate;
        @SerializedName("dutyFreeAmount")
        public DutyFreeAmount dutyFreeAmount;
        @SerializedName("taxIncludedAmount")
        public TaxIncludedAmount taxIncludedAmount;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;

    }

    public class PriceAlteration {

        @SerializedName("applicationDuration")
        public Integer applicationDuration;
        @SerializedName("description")
        public String description;
        @SerializedName("name")
        public String name;
        @SerializedName("priceType")
        public String priceType;
        @SerializedName("priority")
        public Integer priority;
        @SerializedName("recurringChargePeriod")
        public String recurringChargePeriod;
        @SerializedName("unitOfMeasure")
        public String unitOfMeasure;
        @SerializedName("price")
        public Price__1 price;
        @SerializedName("productOfferingPrice")
        public ProductOfferingPrice productOfferingPrice;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;

    }

    public class PriceAlteration__1 {

        @SerializedName("applicationDuration")
        public Integer applicationDuration;
        @SerializedName("description")
        public String description;
        @SerializedName("name")
        public String name;
        @SerializedName("priceType")
        public String priceType;
        @SerializedName("priority")
        public Integer priority;
        @SerializedName("recurringChargePeriod")
        public String recurringChargePeriod;
        @SerializedName("unitOfMeasure")
        public String unitOfMeasure;
        @SerializedName("price")
        public Price__3 price;
        @SerializedName("productOfferingPrice")
        public ProductOfferingPrice__2 productOfferingPrice;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;

    }

    public class PriceAlteration__2 {

        @SerializedName("applicationDuration")
        public Integer applicationDuration;
        @SerializedName("description")
        public String description;
        @SerializedName("name")
        public String name;
        @SerializedName("priceType")
        public String priceType;
        @SerializedName("priority")
        public Integer priority;
        @SerializedName("recurringChargePeriod")
        public String recurringChargePeriod;
        @SerializedName("unitOfMeasure")
        public String unitOfMeasure;
        @SerializedName("price")
        public Price__5 price;
        @SerializedName("productOfferingPrice")
        public ProductOfferingPrice__4 productOfferingPrice;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;

    }

    public class Price__1 {

        @SerializedName("percentage")
        public Integer percentage;
        @SerializedName("taxrate")
        public Integer taxrate;
        @SerializedName("dutyFreeAmount")
        public DutyFreeAmount__1 dutyFreeAmount;
        @SerializedName("taxIncludedAmount")
        public TaxIncludedAmount__1 taxIncludedAmount;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;

    }

    public class Price__2 {

        @SerializedName("percentage")
        public Integer percentage;
        @SerializedName("taxrate")
        public Integer taxrate;
        @SerializedName("dutyFreeAmount")
        public DutyFreeAmount__2 dutyFreeAmount;
        @SerializedName("taxIncludedAmount")
        public TaxIncludedAmount__2 taxIncludedAmount;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;

    }

    public class Price__3 {

        @SerializedName("percentage")
        public Integer percentage;
        @SerializedName("taxrate")
        public Integer taxrate;
        @SerializedName("dutyFreeAmount")
        public DutyFreeAmount__3 dutyFreeAmount;
        @SerializedName("taxIncludedAmount")
        public TaxIncludedAmount__3 taxIncludedAmount;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;

    }

    public class Price__4 {

        @SerializedName("percentage")
        public Integer percentage;
        @SerializedName("taxrate")
        public Integer taxrate;
        @SerializedName("dutyFreeAmount")
        public DutyFreeAmount__4 dutyFreeAmount;
        @SerializedName("taxIncludedAmount")
        public TaxIncludedAmount__4 taxIncludedAmount;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;

    }

    public class Price__5 {

        @SerializedName("percentage")
        public Integer percentage;
        @SerializedName("taxrate")
        public Integer taxrate;
        @SerializedName("dutyFreeAmount")
        public DutyFreeAmount__5 dutyFreeAmount;
        @SerializedName("taxIncludedAmount")
        public TaxIncludedAmount__5 taxIncludedAmount;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;

    }

    public class Price__6 {

        @SerializedName("percentage")
        public Integer percentage;
        @SerializedName("taxrate")
        public Integer taxrate;
        @SerializedName("dutyFreeAmount")
        public DutyFreeAmount__6 dutyFreeAmount;
        @SerializedName("taxIncludedAmount")
        public TaxIncludedAmount__6 taxIncludedAmount;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;

    }

    public class Price__7 {

        @SerializedName("percentage")
        public Integer percentage;
        @SerializedName("taxrate")
        public Integer taxrate;
        @SerializedName("dutyFreeAmount")
        public DutyFreeAmount__7 dutyFreeAmount;
        @SerializedName("taxIncludedAmount")
        public TaxIncludedAmount__7 taxIncludedAmount;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;

    }

    public class Product {

        @SerializedName("id")
        public String id;
        @SerializedName("href")
        public String href;
        @SerializedName("description")
        public String description;
        @SerializedName("isBundle")
        public Boolean isBundle;
        @SerializedName("isCustomerVisible")
        public Boolean isCustomerVisible;
        @SerializedName("name")
        public String name;
        @SerializedName("orderDate")
        public String orderDate;
        @SerializedName("productSerialNumber")
        public String productSerialNumber;
        @SerializedName("startDate")
        public String startDate;
        @SerializedName("terminationDate")
        public String terminationDate;
        @SerializedName("agreement")
        public List<Agreement__1> agreement = null;
        @SerializedName("billingAccount")
        public BillingAccount__5 billingAccount;
        @SerializedName("place")
        public List<Place> place = null;
        @SerializedName("productCharacteristic")
        public List<ProductCharacteristic> productCharacteristic = null;
        @SerializedName("productOffering")
        public ProductOffering productOffering;
        @SerializedName("productOrderItem")
        public List<ProductOrderItem__1> productOrderItem = null;
        @SerializedName("productPrice")
        public List<ProductPrice> productPrice = null;
        @SerializedName("productRelationship")
        public List<ProductRelationship> productRelationship = null;
        @SerializedName("productSpecification")
        public ProductSpecification productSpecification;
        @SerializedName("productTerm")
        public List<ProductTerm> productTerm = null;
        @SerializedName("realizingResource")
        public List<RealizingResource> realizingResource = null;
        @SerializedName("realizingService")
        public List<RealizingService> realizingService = null;
        @SerializedName("relatedParty")
        public List<RelatedParty__1> relatedParty = null;
        @SerializedName("status")
        public String status;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;
        @SerializedName("@referredType")
        public String referredType;

    }

    public class ProductCharacteristic {

        @SerializedName("name")
        public String name;
        @SerializedName("valueType")
        public String valueType;
        @SerializedName("value")
        public String value;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;

    }

    public class ProductOffering {

        @SerializedName("id")
        public String id;
        @SerializedName("href")
        public String href;
        @SerializedName("name")
        public String name;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;
        @SerializedName("@referredType")
        public String referredType;

    }

    public class ProductOfferingPrice {

        @SerializedName("id")
        public String id;
        @SerializedName("href")
        public String href;
        @SerializedName("name")
        public String name;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;
        @SerializedName("@referredType")
        public String referredType;

    }

    public class ProductOfferingPrice__1 {

        @SerializedName("id")
        public String id;
        @SerializedName("href")
        public String href;
        @SerializedName("name")
        public String name;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;
        @SerializedName("@referredType")
        public String referredType;

    }

    public class ProductOfferingPrice__2 {

        @SerializedName("id")
        public String id;
        @SerializedName("href")
        public String href;
        @SerializedName("name")
        public String name;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;
        @SerializedName("@referredType")
        public String referredType;

    }

    public class ProductOfferingPrice__3 {

        @SerializedName("id")
        public String id;
        @SerializedName("href")
        public String href;
        @SerializedName("name")
        public String name;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;
        @SerializedName("@referredType")
        public String referredType;

    }

    public class ProductOfferingPrice__4 {

        @SerializedName("id")
        public String id;
        @SerializedName("href")
        public String href;
        @SerializedName("name")
        public String name;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;
        @SerializedName("@referredType")
        public String referredType;

    }

    public class ProductOfferingPrice__5 {

        @SerializedName("id")
        public String id;
        @SerializedName("href")
        public String href;
        @SerializedName("name")
        public String name;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;
        @SerializedName("@referredType")
        public String referredType;

    }

    public class ProductOfferingPrice__6 {

        @SerializedName("id")
        public String id;
        @SerializedName("href")
        public String href;
        @SerializedName("name")
        public String name;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;
        @SerializedName("@referredType")
        public String referredType;

    }

    public class ProductOfferingPrice__7 {

        @SerializedName("id")
        public String id;
        @SerializedName("href")
        public String href;
        @SerializedName("name")
        public String name;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;
        @SerializedName("@referredType")
        public String referredType;

    }

    public class ProductOfferingQualification {

        @SerializedName("id")
        public String id;
        @SerializedName("href")
        public String href;
        @SerializedName("name")
        public String name;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;
        @SerializedName("@referredType")
        public String referredType;

    }

    public class ProductOfferingQualificationItem {

        @SerializedName("id")
        public String id;
        @SerializedName("href")
        public String href;
        @SerializedName("name")
        public String name;
        @SerializedName("productOfferingQualificationHref")
        public String productOfferingQualificationHref;
        @SerializedName("productOfferingQualificationId")
        public String productOfferingQualificationId;
        @SerializedName("productOfferingQualificationName")
        public String productOfferingQualificationName;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;
        @SerializedName("@referredType")
        public String referredType;

    }

    public class ProductOffering__1 {

        @SerializedName("id")
        public String id;
        @SerializedName("href")
        public String href;
        @SerializedName("name")
        public String name;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;
        @SerializedName("@referredType")
        public String referredType;

    }

    @Getter
    public class ProductOrderItem {

        @SerializedName("id")
        public Integer id;
        @SerializedName("quantity")
        public Integer quantity;
        @SerializedName("action")
        public String action;
        @SerializedName("appointment")
        public Appointment appointment;
        @SerializedName("billingAccount")
        public BillingAccount__2 billingAccount;
        @SerializedName("itemPrice")
        public List<ItemPrice> itemPrice = null;
        @SerializedName("itemTerm")
        public List<ItemTerm> itemTerm = null;
        @SerializedName("itemTotalPrice")
        public List<ItemTotalPrice> itemTotalPrice = null;
        @SerializedName("payment")
        public List<Payment__1> payment = null;
        @SerializedName("product")
        public Product product;
        @SerializedName("productOffering")
        public ProductOffering__1 productOffering;
        @SerializedName("productOfferingQualificationItem")
        public ProductOfferingQualificationItem productOfferingQualificationItem;
        @SerializedName("productOrderItemRelationship")
        public List<ProductOrderItemRelationship> productOrderItemRelationship = null;
        @SerializedName("qualification")
        public List<Qualification> qualification = null;
        @SerializedName("quoteItem")
        public QuoteItem quoteItem;
        @SerializedName("state")
        public String state;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;

    }

    public class ProductOrderItemRelationship {

        @SerializedName("id")
        public String id;
        @SerializedName("relationshipType")
        public String relationshipType;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;

    }

    public class ProductOrderItem__1 {

        @SerializedName("orderItemAction")
        public String orderItemAction;
        @SerializedName("orderItemId")
        public String orderItemId;
        @SerializedName("productOrderHref")
        public String productOrderHref;
        @SerializedName("productOrderId")
        public String productOrderId;
        @SerializedName("role")
        public String role;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;
        @SerializedName("@referredType")
        public String referredType;

    }

    public class ProductPrice {

        @SerializedName("description")
        public String description;
        @SerializedName("name")
        public String name;
        @SerializedName("priceType")
        public String priceType;
        @SerializedName("recurringChargePeriod")
        public String recurringChargePeriod;
        @SerializedName("unitOfMeasure")
        public String unitOfMeasure;
        @SerializedName("billingAccount")
        public BillingAccount__6 billingAccount;
        @SerializedName("price")
        public Price__6 price;
        @SerializedName("productOfferingPrice")
        public ProductOfferingPrice__6 productOfferingPrice;
        @SerializedName("productPriceAlteration")
        public List<ProductPriceAlteration> productPriceAlteration = null;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;

    }

    public class ProductPriceAlteration {

        @SerializedName("applicationDuration")
        public Integer applicationDuration;
        @SerializedName("description")
        public String description;
        @SerializedName("name")
        public String name;
        @SerializedName("priceType")
        public String priceType;
        @SerializedName("priority")
        public Integer priority;
        @SerializedName("recurringChargePeriod")
        public String recurringChargePeriod;
        @SerializedName("unitOfMeasure")
        public String unitOfMeasure;
        @SerializedName("price")
        public Price__7 price;
        @SerializedName("productOfferingPrice")
        public ProductOfferingPrice__7 productOfferingPrice;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;

    }

    public class ProductRelationship {

        @SerializedName("relationshipType")
        public String relationshipType;
        @SerializedName("product")
        public String product;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;

    }

    public class ProductSpecification {

        @SerializedName("id")
        public String id;
        @SerializedName("href")
        public String href;
        @SerializedName("name")
        public String name;
        @SerializedName("version")
        public String version;
        @SerializedName("targetProductSchema")
        public TargetProductSchema targetProductSchema;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;
        @SerializedName("@referredType")
        public String referredType;

    }

    public class ProductTerm {

        @SerializedName("description")
        public String description;
        @SerializedName("name")
        public String name;
        @SerializedName("duration")
        public Duration__1 duration;
        @SerializedName("validFor")
        public ValidFor validFor;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;

    }

    public class Qualification {

        @SerializedName("id")
        public String id;
        @SerializedName("href")
        public String href;
        @SerializedName("name")
        public String name;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;
        @SerializedName("@referredType")
        public String referredType;

    }

    public class Quote {

        @SerializedName("id")
        public String id;
        @SerializedName("href")
        public String href;
        @SerializedName("name")
        public String name;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;
        @SerializedName("@referredType")
        public String referredType;

    }

    public class QuoteItem {

        @SerializedName("id")
        public String id;
        @SerializedName("href")
        public String href;
        @SerializedName("name")
        public String name;
        @SerializedName("quoteHref")
        public String quoteHref;
        @SerializedName("quoteId")
        public String quoteId;
        @SerializedName("quoteName")
        public String quoteName;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;
        @SerializedName("@referredType")
        public String referredType;

    }

    public class RealizingResource {

        @SerializedName("id")
        public String id;
        @SerializedName("href")
        public String href;
        @SerializedName("name")
        public String name;
        @SerializedName("value")
        public String value;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;
        @SerializedName("@referredType")
        public String referredType;

    }

    public class RealizingService {

        @SerializedName("id")
        public String id;
        @SerializedName("href")
        public String href;
        @SerializedName("name")
        public String name;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;
        @SerializedName("@referredType")
        public String referredType;

    }

    public class RelatedParty {

        @SerializedName("id")
        public String id;
        @SerializedName("href")
        public String href;
        @SerializedName("name")
        public String name;
        @SerializedName("role")
        public String role;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;
        @SerializedName("@referredType")
        public String referredType;

    }

    public class RelatedParty__1 {

        @SerializedName("id")
        public String id;
        @SerializedName("href")
        public String href;
        @SerializedName("name")
        public String name;
        @SerializedName("role")
        public String role;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;
        @SerializedName("@referredType")
        public String referredType;

    }

    public class TargetProductSchema {

        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;

    }

    public class TaxIncludedAmount {

        @Builder.Default public String unit = "string";
        @Builder.Default public Integer value = 0;
    }

    public class TaxIncludedAmount__1 {

        @SerializedName("unit")
        public String unit;
        @SerializedName("value")
        public Integer value;

    }

    public class TaxIncludedAmount__2 {

        @SerializedName("unit")
        public String unit;
        @SerializedName("value")
        public Integer value;

    }

    public class TaxIncludedAmount__3 {

        @SerializedName("unit")
        public String unit;
        @SerializedName("value")
        public Integer value;

    }

    public class TaxIncludedAmount__4 {

        @SerializedName("unit")
        public String unit;
        @SerializedName("value")
        public Integer value;

    }

    public class TaxIncludedAmount__5 {

        @SerializedName("unit")
        public String unit;
        @SerializedName("value")
        public Integer value;

    }

    public class TaxIncludedAmount__6 {

        @SerializedName("unit")
        public String unit;
        @SerializedName("value")
        public Integer value;

    }

    public class TaxIncludedAmount__7 {

        @SerializedName("unit")
        public String unit;
        @SerializedName("value")
        public Integer value;

    }

    public class ValidFor {

        @Builder.Default public String endDateTime = "2022-06-29T10:33:12.501Z";
        @Builder.Default public String startDateTime = "2022-06-29T10:33:12.501Z";

    }

    public class GeographicAddressValidation {

        @SerializedName("provideAlternative")
        public Boolean provideAlternative;
        @SerializedName("submittedGeographicAddress")
        public SubmittedGeographicAddress submittedGeographicAddress;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;

    }

    public class SubmittedGeographicAddress {

        @SerializedName("id")
        public String id;
        @SerializedName("href")
        public String href;
        @SerializedName("city")
        public String city;
        @SerializedName("country")
        public String country;
        @SerializedName("locality")
        public String locality;
        @SerializedName("name")
        public String name;
        @SerializedName("postcode")
        public String postcode;
        @SerializedName("stateOrProvince")
        public String stateOrProvince;
        @SerializedName("streetName")
        public String streetName;
        @SerializedName("streetNr")
        public String streetNr;
        @SerializedName("streetNrLast")
        public String streetNrLast;
        @SerializedName("streetNrLastSuffix")
        public String streetNrLastSuffix;
        @SerializedName("streetNrSuffix")
        public String streetNrSuffix;
        @SerializedName("streetSuffix")
        public String streetSuffix;
        @SerializedName("streetType")
        public String streetType;
        @SerializedName("geographicLocation")
        public GeographicLocation geographicLocation;
        @SerializedName("geographicSubAddress")
        public List<GeographicSubAddress> geographicSubAddress = null;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;

    }

    public class GeographicLocation {

        @SerializedName("id")
        public String id;
        @SerializedName("href")
        public String href;
        @SerializedName("name")
        public String name;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("bbox")
        public String bbox;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;
        @SerializedName("@referredType")
        public String referredType;

    }

    public class GeographicSubAddress {

        @SerializedName("id")
        public String id;
        @SerializedName("href")
        public String href;
        @SerializedName("buildingName")
        public String buildingName;
        @SerializedName("levelNumber")
        public String levelNumber;
        @SerializedName("levelType")
        public String levelType;
        @SerializedName("name")
        public String name;
        @SerializedName("privateStreetName")
        public String privateStreetName;
        @SerializedName("privateStreetNumber")
        public String privateStreetNumber;
        @SerializedName("subAddressType")
        public String subAddressType;
        @SerializedName("subUnitNumber")
        public String subUnitNumber;
        @SerializedName("subUnitType")
        public String subUnitType;
        @SerializedName("@baseType")
        public String baseType;
        @SerializedName("@schemaLocation")
        public String schemaLocation;
        @SerializedName("@type")
        public String type;

    }

}
