package com.exos.dto.services.translation.accessno;


import com.exos.AbstractHttpSpecification;
import com.mashape.unirest.http.HttpMethod;
import lombok.Builder;
import lombok.Setter;
import lombok.experimental.Accessors;

@Builder
@Accessors(chain = true)
public class FindAccessNumbersForAllocationReq extends AbstractHttpSpecification {


    @Setter public String accessStartWith;
    @Setter public String accountName;
    @Setter public Integer accountNo;
    @Setter public String allocationStatus;
    @Setter public Integer autoAllocateQuantity;
    @Setter public String customerName;
    @Setter public Integer customerNumber;
    @Setter public String dealership;
    @Setter public String exchangeCd;
    @Setter public String handle;
    @Setter public String number;
    @Setter public String numberGroup;
    @Setter public String serviceType;


    @Override
    protected HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    protected String getEndpointUrl() {
        return "/api/findAccessNumbersForAllocation";
    }
}
