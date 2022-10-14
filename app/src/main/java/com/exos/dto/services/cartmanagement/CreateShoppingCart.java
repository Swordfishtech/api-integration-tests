package com.exos.dto.services.cartmanagement;

import com.exos.AbstractHttpSpecification;
import com.exos.Properties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.mashape.unirest.http.HttpMethod;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Builder
@Accessors(chain = true)
@Getter
@Setter
public class CreateShoppingCart extends AbstractHttpSpecification {

    @SerializedName("cartItem")
    @Expose
    public List<CartItem> cartItem = null;
    @SerializedName("cartTotalPrice")
    @Expose
    public List<CartTotalPrice> cartTotalPrice = null;
    @SerializedName("contactMedium")
    @Expose
    public List<ContactMedium> contactMedium = null;
    @SerializedName("relatedParty")
    @Expose
    public List<RelatedParty__1> relatedParty = null;
    @SerializedName("validFor")
    @Expose
    public ValidFor__2 validFor;
    @SerializedName("@baseType")
    @Expose
    public String baseType;
    @SerializedName("@schemaLocation")
    @Expose
    public String schemaLocation;
    @SerializedName("@type")
    @Expose
    public String type;
    @SerializedName("href")
    @Expose
    public String href;

    @Override
    protected HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    protected String getEndpointUrl() {
        return Properties.CART_MANAGEMENT_SERVICE_SERVER_HOSTNAME + "/api/shoppingCart/";
    }


    @Setter
    public class Agreement {

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

    @Setter
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

    @Setter
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

    @Setter
    public class CartItem {

        @SerializedName("id")
        @Expose
        public String id;
        @SerializedName("quantity")
        @Expose
        public Integer quantity;
        @SerializedName("itemTotalPrice")
        @Expose
        public List<ItemTotalPrice> itemTotalPrice = null;
        @SerializedName("action")
        @Expose
        public String action;
        @SerializedName("cartitem")
        @Expose
        public String cartitem;
        @SerializedName("cartItemRelationship")
        @Expose
        public List<CartItemRelationship> cartItemRelationship = null;
        @SerializedName("itemPrice")
        @Expose
        public List<ItemPrice> itemPrice = null;
        @SerializedName("itemTerm")
        @Expose
        public List<ItemTerm> itemTerm = null;
        @SerializedName("note")
        @Expose
        public List<Note> note = null;
        @SerializedName("product")
        @Expose
        public Product product;
        @SerializedName("productOffering")
        @Expose
        public ProductOffering__1 productOffering;
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

    }

    @Setter
    public class CartItemRelationship {

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

    @Setter
    public class CartTotalPrice {

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
        @SerializedName("price")
        @Expose
        public Price__6 price;
        @SerializedName("priceAlteration")
        @Expose
        public List<PriceAlteration__2> priceAlteration = null;
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

    @Setter
    public class Characteristic {

        @SerializedName("city")
        @Expose
        public String city;
        @SerializedName("contactType")
        @Expose
        public String contactType;
        @SerializedName("country")
        @Expose
        public String country;
        @SerializedName("emailAddress")
        @Expose
        public String emailAddress;
        @SerializedName("faxNumber")
        @Expose
        public String faxNumber;
        @SerializedName("phoneNumber")
        @Expose
        public String phoneNumber;
        @SerializedName("postCode")
        @Expose
        public String postCode;
        @SerializedName("socialNetworkId")
        @Expose
        public String socialNetworkId;
        @SerializedName("stateOrProvince")
        @Expose
        public String stateOrProvince;
        @SerializedName("street1")
        @Expose
        public String street1;
        @SerializedName("street2")
        @Expose
        public String street2;
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

    @Setter
    public class ContactMedium {

        @SerializedName("mediumType")
        @Expose
        public String mediumType;
        @SerializedName("preferred")
        @Expose
        public Boolean preferred;
        @SerializedName("characteristic")
        @Expose
        public Characteristic characteristic;
        @SerializedName("validFor")
        @Expose
        public ValidFor__1 validFor;
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

    @Setter
    public class Duration {

        @SerializedName("amount")
        @Expose
        public Integer amount;
        @SerializedName("units")
        @Expose
        public String units;

    }

    @Setter
    public class Duration__1 {

        @SerializedName("amount")
        @Expose
        public Integer amount;
        @SerializedName("units")
        @Expose
        public String units;

    }

    @Setter
    public class DutyFreeAmount {

        @SerializedName("unit")
        @Expose
        public String unit;
        @SerializedName("value")
        @Expose
        public Integer value;

    }

    @Setter
    public class DutyFreeAmount__1 {

        @SerializedName("unit")
        @Expose
        public String unit;
        @SerializedName("value")
        @Expose
        public Integer value;

    }

    @Setter
    public class DutyFreeAmount__2 {

        @SerializedName("unit")
        @Expose
        public String unit;
        @SerializedName("value")
        @Expose
        public Integer value;

    }

    @Setter
    public class DutyFreeAmount__3 {

        @SerializedName("unit")
        @Expose
        public String unit;
        @SerializedName("value")
        @Expose
        public Integer value;

    }

    @Setter
    public class DutyFreeAmount__4 {

        @SerializedName("unit")
        @Expose
        public String unit;
        @SerializedName("value")
        @Expose
        public Integer value;

    }

    @Setter
    public class DutyFreeAmount__5 {

        @SerializedName("unit")
        @Expose
        public String unit;
        @SerializedName("value")
        @Expose
        public Integer value;

    }

    @Setter
    public class DutyFreeAmount__6 {

        @SerializedName("unit")
        @Expose
        public String unit;
        @SerializedName("value")
        @Expose
        public Integer value;

    }

    @Setter
    public class DutyFreeAmount__7 {

        @SerializedName("unit")
        @Expose
        public String unit;
        @SerializedName("value")
        @Expose
        public Integer value;

    }

    @Setter
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

    @Setter
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

    @Setter
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

    @Setter
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

    @Setter
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

    @Setter
    public class Price {

        @SerializedName("percentage")
        @Expose
        public Integer percentage;
        @SerializedName("taxRate")
        @Expose
        public Integer taxRate;
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

    @Setter
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

    @Setter
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

    @Setter
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
        public Price__7 price;
        @SerializedName("productOfferingPrice")
        @Expose
        public ProductOfferingPrice__6 productOfferingPrice;
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

    @Setter
    public class Price__1 {

        @SerializedName("percentage")
        @Expose
        public Integer percentage;
        @SerializedName("taxRate")
        @Expose
        public Integer taxRate;
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

    @Setter
    public class Price__2 {

        @SerializedName("percentage")
        @Expose
        public Integer percentage;
        @SerializedName("taxRate")
        @Expose
        public Integer taxRate;
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

    @Setter
    public class Price__3 {

        @SerializedName("percentage")
        @Expose
        public Integer percentage;
        @SerializedName("taxRate")
        @Expose
        public Integer taxRate;
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

    @Setter
    public class Price__4 {

        @SerializedName("percentage")
        @Expose
        public Integer percentage;
        @SerializedName("taxRate")
        @Expose
        public Integer taxRate;
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

    @Setter
    public class Price__5 {

        @SerializedName("percentage")
        @Expose
        public Integer percentage;
        @SerializedName("taxRate")
        @Expose
        public Integer taxRate;
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

    @Setter
    public class Price__6 {

        @SerializedName("percentage")
        @Expose
        public Integer percentage;
        @SerializedName("taxRate")
        @Expose
        public Integer taxRate;
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

    @Setter
    public class Price__7 {

        @SerializedName("percentage")
        @Expose
        public Integer percentage;
        @SerializedName("taxRate")
        @Expose
        public Integer taxRate;
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

    @Setter
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
        public List<Agreement> agreement = null;
        @SerializedName("billingAccount")
        @Expose
        public BillingAccount billingAccount;
        @SerializedName("place")
        @Expose
        public List<Place> place = null;
        @SerializedName("product")
        @Expose
        public List<String> product = null;
        @SerializedName("productCharacteristic")
        @Expose
        public List<ProductCharacteristic> productCharacteristic = null;
        @SerializedName("productOffering")
        @Expose
        public ProductOffering productOffering;
        @SerializedName("productOrderItem")
        @Expose
        public List<ProductOrderItem> productOrderItem = null;
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
        public List<RelatedParty> relatedParty = null;
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

    @Setter
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

    @Setter
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

    @Setter
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

    @Setter
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

    @Setter
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

    @Setter
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

    @Setter
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

    @Setter
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

    @Setter
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

    @Setter
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

    @Setter
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

    @Setter
    public class ProductOrderItem {

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

    @Setter
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
        public BillingAccount__1 billingAccount;
        @SerializedName("price")
        @Expose
        public Price__4 price;
        @SerializedName("productOfferingPrice")
        @Expose
        public ProductOfferingPrice__4 productOfferingPrice;
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
        public Price__5 price;
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

        @SerializedName("unit")
        @Expose
        public String unit;
        @SerializedName("value")
        @Expose
        public Integer value;

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

        @SerializedName("endDateTime")
        @Expose
        public String endDateTime;
        @SerializedName("startDateTime")
        @Expose
        public String startDateTime;

    }

    public class ValidFor__1 {

        @SerializedName("endDateTime")
        @Expose
        public String endDateTime;
        @SerializedName("startDateTime")
        @Expose
        public String startDateTime;

    }

    public class ValidFor__2 {

        @SerializedName("endDateTime")
        @Expose
        public String endDateTime;
        @SerializedName("startDateTime")
        @Expose
        public String startDateTime;

    }
}
