package com.exos;

import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

import java.io.*;

import static org.testng.Assert.fail;

public class Serializer {


    public static Object serialize(HttpResponse<JsonNode> response, Class responseObjectType) {

        return new Gson().fromJson(response.getBody().toString(), responseObjectType);
    }

    public static Object convertJsonStringToObject(String filename, Class objectType) {

        JSONObject json = readJson(filename);
        return new Gson().fromJson(json.toString(), objectType);
    }


    private static JSONObject readJson(String filename) {

        JSONObject json = null;

        File f = new File("src/main/resources/" + filename);
        if (f.exists()) {
            InputStream is = null;
            try {
                is = new FileInputStream("src/main/resources/" + filename);
            } catch (FileNotFoundException e) {
                fail(e.getMessage());
            }

            String jsonTxt = null;
            try {
                jsonTxt = IOUtils.toString(is, "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            json = new JSONObject(jsonTxt);
        }

        return json;
    }
}
