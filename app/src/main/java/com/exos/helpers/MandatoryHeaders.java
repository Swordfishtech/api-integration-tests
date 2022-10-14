package com.exos.helpers;

import com.exos.HttpHeader;

import java.util.HashMap;
import java.util.UUID;

public class MandatoryHeaders {


    public static HttpHeader getHeaders() {
        HashMap<String, String> map = new HashMap<>();
        map.put("correlation-id", UUID.randomUUID().toString());
        map.put("x-correlation-id", UUID.randomUUID().toString());
        map.put("login-name", "test123");
        map.put("email", "test.tester@test.co.uk");
        map.put("full-name", "tester");
        HttpHeader headers = new HttpHeader();
        headers.setHeaders(map);
        return headers;
    }

}
