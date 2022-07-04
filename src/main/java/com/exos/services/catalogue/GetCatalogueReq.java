package com.exos.services.catalogue;

import com.exos.AbstractHttpSpecification;
import com.mashape.unirest.http.HttpMethod;
import lombok.Builder;
import lombok.Setter;
import lombok.experimental.Accessors;

@Builder
@Accessors(chain = true)
public class GetCatalogueReq extends AbstractHttpSpecification {

    @Setter private int catalogueUid;
    @Setter private String handle;

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public String getEndpointUrl() {
        return "/api/catalogue/list";
    }
}
