package com.exos;

import com.mashape.unirest.http.HttpMethod;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractHttpSpecification {

    protected abstract HttpMethod getHttpMethod();
    protected abstract String getEndpointUrl();

}
