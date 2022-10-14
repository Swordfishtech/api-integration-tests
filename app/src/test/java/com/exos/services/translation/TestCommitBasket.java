package com.exos.services.translation;

import com.exos.GatewayRequest;
import com.exos.dto.services.Attributes;
import com.exos.dto.services.Session;
import com.exos.dto.services.translation.basket.CommitBasketReq;
import com.exos.dto.services.translation.basket.CommitBasketResp;

import java.util.UUID;

import static com.exos.helpers.AssertHelper.assertResponseBodyContains;
import static com.exos.helpers.AssertHelper.assertResponseCode;

public class TestCommitBasket {

    public void test_returns_correct_uid() {

        GatewayRequest request = new GatewayRequest()
                .forService()
                .commitBasket(CommitBasketReq.builder()
                        .handle("handle")
                        .basketNo(1)
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
                        .build())
                .send();

        assertResponseCode(request, 200);

        CommitBasketResp response = (CommitBasketResp) request.getSerializedResponse();
        assertResponseBodyContains("uid", response.getNewRecordIds().get(0).getUid(), 1000);
    }

}
