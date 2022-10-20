package com.exos.helpers;

import com.exos.HttpHeader;
import com.exos.TestData;

import java.util.HashMap;
import java.util.UUID;

public class MandatoryHeaders {


    public static HttpHeader getHeaders() {
        HashMap<String, String> map = new HashMap<>();
        map.put("correlation-id", UUID.randomUUID().toString());
        map.put("x-correlation-id", UUID.randomUUID().toString());
        map.put("login-name", TestData.NAME);
        map.put("email", TestData.EMAIL_ADDRESS);
        map.put("full-name", "Automation Test");
        HttpHeader headers = new HttpHeader();
        headers.setHeaders(map);
        return headers;
    }

}
