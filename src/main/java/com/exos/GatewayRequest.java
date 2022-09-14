package com.exos;

import com.exos.dto.services.accessNumber.FindAccessNumbersForAllocationReq;
import com.exos.dto.services.catalogue.GetCatalogueReq;
import com.exos.dto.services.catalogue.GetCatalogueResp;
import com.exos.dto.services.login.LoginReq;
import com.exos.dto.services.products.GetProductsReq;
import com.exos.dto.services.products.GetProductsResp;
import com.exos.dto.services.basket.AddBasketReq;
import com.exos.dto.services.basket.FindBasketReq;
import com.exos.dto.services.basket.ModifyBasketReq;
import com.exos.dto.services.productsController.GetGroupProductsReq;
import com.exos.dto.services.productsController.GetGroupProductsResp;
import com.exos.dto.services.productsController.ProductImportReq;
import com.exos.dto.services.productsController.ProductImportResp;
import com.exos.dto.services.serviceController.FindServiceByAccessNumberReq;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.request.HttpRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

public class GatewayRequest {

    @Getter(AccessLevel.PROTECTED) private HttpHeader headers = new HttpHeader();
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

    public GatewayRequest send() {
       new HttpDispatcher().send(this);
       return this;
   }
}
