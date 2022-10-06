package com.exos.helpers;

import com.aventstack.extentreports.Status;
import com.exos.BaseTest;
import com.exos.GatewayRequest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class AssertHelper {


    public static void assertResponseCode(GatewayRequest gateway, int actual) {

        assertThat("Unexpected HTTP Response Status Code", gateway.getHttpResponse().getStatus(), is(actual));
        BaseTest.getTestReporter().log(Status.PASS, "Validated HTTP Response Status Code is " + actual);
    }

    public static void assertResponseBodyContains(String fieldName, String actualValue, String expectedValue) {
        assertThat("Unexpected value in field " + fieldName, actualValue,is(expectedValue));
        BaseTest.getTestReporter().log(Status.PASS, String.format("Validated field [%s] is [%s]", fieldName, expectedValue));
    }

    public static void assertResponseBodyContains(String fieldName, int actualValue, int expectedValue) {
        assertThat("Unexpected value in field " + fieldName,actualValue,is(expectedValue));
        BaseTest.getTestReporter().log(Status.PASS, String.format("Validated field [%s] is [%d]", fieldName, expectedValue));
    }

    public static void assertResponseBodyContains(String fieldName, Boolean actualValue, boolean expectedValue) {
        assertThat("Unexpected value in field " + fieldName,actualValue,is(expectedValue));
        BaseTest.getTestReporter().log(Status.PASS, String.format("Validated field [%s] is [%b]", fieldName, expectedValue));
    }

}
