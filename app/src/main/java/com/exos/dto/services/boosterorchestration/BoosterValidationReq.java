package com.exos.dto.services.boosterorchestration;

import com.exos.AbstractHttpSpecification;
import com.exos.Properties;
import com.mashape.unirest.http.HttpMethod;
import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(chain = true)
public class BoosterValidationReq extends AbstractHttpSpecification {

    @Override
    protected HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    protected String getEndpointUrl() {
        return Properties.BOOSTER_ORCHESTRATION_SERVICE_SERVER_HOSTNAME + "/api/validateBooster";
    }

    public Note note;
    public ProductOrderItem productOrderItem;


    public class Note{
        private String text;
    }

    public class Product{
        private String id;
        private ProductCharacteristic productCharacteristic;
        private RealizingResource realizingResource;
    }

    public class ProductCharacteristic{
        private String name;
        private boolean value;
    }

    public class ProductOrderItem{
        private String id;
        private int quantity;
        private String action;
        private Product product;
    }

    public class RealizingResource{
        private String id;
        private String name;
        private String value;
    }
}
