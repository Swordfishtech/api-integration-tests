package com.exos.services.translation;

import com.exos.BaseTest;
import com.exos.GatewayRequest;
import com.exos.Serializer;
import com.exos.dto.services.translation.basket.AddBasketReq;
import com.exos.dto.services.translation.basket.FindBasketReq;
import com.exos.dto.services.translation.basket.ModifyBasketReq;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestGetBasket extends BaseTest {


    @Test
    public void test_add_basket() {

        AddBasketReq addBasket = (AddBasketReq) Serializer.convertJsonStringToObject("templates/Basket.json", AddBasketReq.class);

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .addBasket(addBasket)
                .send();

        assertThat(gatewayRequest.getHttpResponse().getStatus(), is(200));
    }

    @Test
    public void test_find_basket() {

        FindBasketReq findBasketReq = FindBasketReq.builder()
                .basketUid(0)
                .handle("string")
                .build();

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .findBasket(findBasketReq)
                .send();

        assertThat(gatewayRequest.getHttpResponse().getStatus(), is(200));
    }

    @Test
    public void test_modify_basket() {

        AddBasketReq addBasket = (AddBasketReq) Serializer.convertJsonStringToObject("templates/Basket.json", AddBasketReq.class);

        ModifyBasketReq modifyBasketReq = ModifyBasketReq.builder().requestBody(addBasket.getRequestBody()).build();

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .modifyBasket(modifyBasketReq)
                .send();

        assertThat(gatewayRequest.getHttpResponse().getStatus(), is(200));
    }

}
