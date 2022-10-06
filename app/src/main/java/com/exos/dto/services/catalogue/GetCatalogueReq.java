package com.exos.dto.services.catalogue;

import com.exos.AbstractHttpSpecification;
import com.exos.Properties;
import com.mashape.unirest.http.HttpMethod;
import lombok.Builder;
import lombok.Setter;
import lombok.experimental.Accessors;

@Builder
@Accessors(chain = true)
public class GetCatalogueReq extends AbstractHttpSpecification {

    @Setter private Object catalogueUid;
    @Setter private String handle;

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public String getEndpointUrl() {
        return Properties.APP_SERVER_HOSTNAME +  "/api/catalogue/list";
    }
}
