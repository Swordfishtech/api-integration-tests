package com.exos;

import com.exos.controllers.*;
import com.exos.dto.services.translation.accessno.FindAccessNumbersForAllocationReq;
import com.exos.dto.services.translation.catalogue.GetCatalogueReq;
import com.exos.dto.services.translation.catalogue.GetCatalogueResp;
import com.exos.dto.services.login.LoginReq;
import com.exos.dto.services.translation.products.GetProductsReq;
import com.exos.dto.services.translation.products.GetProductsResp;
import com.exos.dto.services.translation.products.GetGroupProductsReq;
import com.exos.dto.services.translation.products.GetGroupProductsResp;
import com.exos.dto.services.translation.products.ProductImportReq;
import com.exos.dto.services.translation.products.ProductImportResp;
import com.exos.dto.services.translation.service.FindServiceByAccessNumberReq;
import com.exos.dto.services.translation.basket.*;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.request.HttpRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

public class GatewayRequest {

    @Getter(AccessLevel.PUBLIC) private HttpHeader headers = new HttpHeader();
    @Setter @Getter(AccessLevel.PROTECTED) private AbstractHttpSpecification body;
    @Getter @Setter(AccessLevel.PROTECTED) private HttpRequest httpRequest;
    @Getter @Setter(AccessLevel.PROTECTED) private HttpResponse httpResponse;
    @Getter @Setter(AccessLevel.PROTECTED) private Object serializedResponse;
    @Setter @Getter(AccessLevel.PROTECTED) private Class responseObjectType;


   public GatewayRequest forService() {
       return this;
   }

   public GatewayRequest usingHeaders(final HttpHeader httpHeader) {
       this.headers = httpHeader;
       return this;
   }

   public GatewayRequest getCatalogues(final GetCatalogueReq getCatalogueReq) {
       body = getCatalogueReq;
       responseObjectType = GetCatalogueResp.class;
       return this;
   }

   public GatewayRequest getProducts(final GetProductsReq getProductsReq) {
       body = getProductsReq;
       responseObjectType = GetProductsResp.class;
       return this;
   }

   public GatewayRequest addBasket(final AddBasketReq addBasketReq) {
       body = addBasketReq;
       responseObjectType = null;
       return this;
   }

    public GatewayRequest modifyBasket(final ModifyBasketReq modifyBasketReq) {
       body = modifyBasketReq;
       responseObjectType = null;
        return this;
    }

    public GatewayRequest findBasket(final FindBasketReq findBasketReq) {
       body = findBasketReq;
       responseObjectType = null;
        return this;
    }

    public GatewayRequest commitBasket(final CommitBasketReq commitBasket) {
       body = commitBasket;
       responseObjectType = CommitBasketResp.class;
       return this;
    }

    public GatewayRequest getBasketSales(final BasketSalesReq basketSales) {
       body = basketSales;
       responseObjectType = BasketSalesResp.class;
       return this;
    }

    public GatewayRequest findServiceByAccessNumber(final FindServiceByAccessNumberReq findServiceByAccessNumberReq) {
       body = findServiceByAccessNumberReq;
       responseObjectType = null;
       return this;
    }

    public GatewayRequest login(final LoginReq loginReq) {
       body = loginReq;
       responseObjectType = null;
       return this;
    }

    public GatewayRequest findAccessNumberForAllocation(final FindAccessNumbersForAllocationReq findAccessNumbersForAllocationReq) {
       body = findAccessNumbersForAllocationReq;
       responseObjectType = null;
       return this;
    }

    public GatewayRequest getGroupProducts(final GetGroupProductsReq getGroupProductsReq) {
       body = getGroupProductsReq;
       responseObjectType = GetGroupProductsResp.class;
       return this;
    }

    public GatewayRequest importProducts(final ProductImportReq productImportReq) {
       body = productImportReq;
       responseObjectType = ProductImportResp.class;
       return this;
    }

    public OrderManagementService orderManagement() {
       return new OrderManagementService(this);
    }

    public CartManagementService cartManagement() {
       return new CartManagementService(this);
    }

    public SessionController sessionController() {
       return new SessionController(this);
    }

    public ProductsController productsController() {
       return new ProductsController(this);
    }

    public CommunicationService communicationService() {
       return new CommunicationService(this);
    }

    public BoosterOrchestrationService boosterOrchestrationService() {
        return new BoosterOrchestrationService(this);
    }

    public GatewayRequest send() {
       new HttpDispatcher().send(this);
       return this;
   }
}
