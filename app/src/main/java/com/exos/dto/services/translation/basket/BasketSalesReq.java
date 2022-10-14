package com.exos.dto.services.translation.basket;

import com.exos.AbstractHttpSpecification;
import com.exos.Properties;
import com.exos.dto.services.Session;
import com.mashape.unirest.http.HttpMethod;
import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(chain = true)
public class BasketSalesReq extends AbstractHttpSpecification {

    private Integer accountNo;
    private String accountSubGrp;
    private Integer basketNo;
    private String basketStatusCd;
    private Boolean estimation;
    private String handle;
    private String lastUsedFromDate;
    private String lastUsedToDate;
    private Integer salesOrderId;
    private Session session;
    private String userName;

    @Override
    protected HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    protected String getEndpointUrl() {
        return Properties.TRANSLATION_SERVICE_SERVER_HOSTNAME + "/api/basketSales";
    }
}
