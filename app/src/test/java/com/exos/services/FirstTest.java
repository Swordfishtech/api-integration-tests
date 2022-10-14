package com.exos.services;

import com.exos.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest  extends BaseTest {

    @Test
    public void my_test() {
        Assert.assertTrue(false);
        System.exit(999);
    }
}
