package com.exos;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.Singular;
import lombok.experimental.Accessors;

import java.util.HashMap;

@Getter
@Setter
@Accessors(chain = true)
public class HttpHeader {

        @Singular private HashMap<String,String> headers;

        public void addHeader(String key, String value) {
                headers.put(key, value);
        }

        public void removeHeader(String key) {
                headers.remove(key);
        }

}
