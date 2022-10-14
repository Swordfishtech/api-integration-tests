package com.exos.services.translation;

import com.exos.GatewayRequest;
import com.exos.dto.services.Attributes;
import com.exos.dto.services.Session;
import com.exos.dto.services.translation.basket.BasketSalesReq;
import com.exos.dto.services.translation.basket.BasketSalesResp;
import com.exos.helpers.AssertHelper;
import org.testng.annotations.Test;

import java.util.UUID;

public class TestGetBasketSales {

    @Test
    public void test_returns_work_order_number() {

        GatewayRequest request = new GatewayRequest()
                .forService()
                .getBasketSales(BasketSalesReq.builder()
                        .basketNo(1)
                        .accountNo(2)
                        .handle("handle")
                        .session(Session.builder()
                                .email("gurdeep@test.com")
                                .correlationId(UUID.randomUUID().toString())
                                .fullName("Gurdeep Jugpal")
                                .loginName("Gurdeep")
                                .xCorrelationId(UUID.randomUUID().toString())
                                .attributes(Attributes.builder()
                                        .additionalProp1("prop1")
                                        .additionalProp2("prop2")
                                        .additionalProp3("prop3")
                                        .build())
                                .build())
                        .userName("test")
                        .build())
                .send();

        AssertHelper.assertResponseCode(request, 200);

        BasketSalesResp response = (BasketSalesResp) request.getSerializedResponse();
        AssertHelper.assertResponseBodyValueIsNotNull("workOrderNo", response.getBaskets().get(0).getWoNoStatusDetails().get(0).getWorkOrderNo());
    }
}
