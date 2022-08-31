package com.exos.services.appserver;

import com.exos.BaseTest;
import com.exos.GatewayRequest;
import com.exos.dto.services.accessNumber.FindAccessNumbersForAllocationReq;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestFindAccessNumberForAllocation extends BaseTest {

    @Test
    public void test_find_access_number_for_allocation() {

        FindAccessNumbersForAllocationReq findAccessNumbersForAllocation = FindAccessNumbersForAllocationReq.builder()
                .accessStartWith("test")
                .accountName("test")
                .accountNo(1)
                .allocationStatus("approved")
                .autoAllocateQuantity(2)
                .customerName("test")
                .customerNumber(123)
                .dealership("test")
                .exchangeCd("test")
                .handle("string")
                .number("test")
                .numberGroup("test")
                .serviceType("test")
                .build();

        GatewayRequest gatewayRequest = new GatewayRequest()
                .forService()
                .findAccessNumberForAllocation(findAccessNumbersForAllocation)
                .send();

        assertThat(gatewayRequest.getHttpResponse().getStatus(), is (200));



    }
}
