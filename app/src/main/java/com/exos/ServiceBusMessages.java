package com.exos;

import java.util.HashMap;
import java.util.Map;

public class ServiceBusMessages {

    private static HashMap<String,String> messages = new HashMap<>();


    public static void add(String key, String message) {
        messages.put(key, message);
    }

    public static HashMap<String, String> getAll() {
        return messages;
    }

    public static String get(String key) {
        return messages.get(key);
    }


}
