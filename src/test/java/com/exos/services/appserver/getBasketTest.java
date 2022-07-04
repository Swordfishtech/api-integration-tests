package com.exos.services.appserver;

import com.exos.BaseTest;
import com.exos.GatewayRequest;
import com.exos.services.basket.AddBasketReq;
import com.exos.services.basket.FindBasketReq;
import com.exos.services.basket.ModifyBasketReq;
import lombok.SneakyThrows;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class getBasketTest extends BaseTest {


    @Test
    public void add_basket_returns_200_OK() {

        JSONObject j = readJson();

        AddBasketReq addBasketReq = AddBasketReq.builder().requestBody(j).build();

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .addBasket(addBasketReq)
                .send();

        assertThat(gatewayRequest.getHttpResponse().getStatus(), is(200));
    }

    @Test
    public void find_basket_returns_200_OK() {

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
    public void modify_basket_returns_200_OK() {
        JSONObject json = readJson();

        ModifyBasketReq modifyBasketReq = ModifyBasketReq.builder().requestBody(json).build();

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .modifyBasket(modifyBasketReq)
                .send();

        assertThat(gatewayRequest.getHttpResponse().getStatus(), is(200));
    }



    @SneakyThrows
    private JSONObject readJson() {
        JSONObject json = null;

        File f = new File("src/main/resources/Basket.json");
        if (f.exists()){
            InputStream is = new FileInputStream("src/main/resources/Basket.json");
            String jsonTxt = IOUtils.toString(is, "UTF-8");
            json = new JSONObject(jsonTxt);
        }
        return json;
    }
}
