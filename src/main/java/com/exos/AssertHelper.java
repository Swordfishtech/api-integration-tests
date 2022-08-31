package com.exos;

import com.aventstack.extentreports.Status;
import com.mashape.unirest.http.HttpResponse;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class AssertHelper {


    public static void assertResponseCode(GatewayRequest gateway, int actual) {

        assertThat(gateway.getHttpResponse().getStatus(), is(actual));
        BaseTest.getTestReporter().log(Status.PASS, "Validated HTTP Response Status Code is " + actual);
    }

}
