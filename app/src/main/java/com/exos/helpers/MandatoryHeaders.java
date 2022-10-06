package com.exos.helpers;

import com.exos.HttpHeader;

import java.util.HashMap;

public class MandatoryHeaders {

    public static HttpHeader getHeaders() {
        HttpHeader headers = new HttpHeader();
        HashMap<String, String> map = new HashMap<>();
        map.put("correlation-id", "3177be48-59a7-4889-9025-e5232b0fef8e");
        map.put("x-correlation-id", "3177be48-59a7-4889-9025-e5232b0fef8e");
        map.put("login-name", "test123");
        map.put("email", "test.tester@test.co.uk");
        map.put("full-name", "tester");
        headers.setHeaders(map);
        return headers;
    }
}
