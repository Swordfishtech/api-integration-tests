package com.exos;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.collections.Lists;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws URISyntaxException {

        TestListenerAdapter tla = new TestListenerAdapter();
        TestNG testng = new TestNG();

        // [1] Run test from testng.xml
        List<String> suites = Lists.newArrayList();
//        URI resource = URI.create(Main.class.getClassLoader().getResourceAsStream("testng.xml").toString());
//        URI resource = Main.class.getClassLoader().getResource("testng.xml").toURI();

//        setTestSuites(testng, resource);



        suites.add("suites/" + args[0]);
        testng.setTestSuites(suites);

        // [2] or by Test Classes
        // testng.setTestClasses(new Class[] { SampleTest.class });

        testng.addListener(tla);
        testng.run();
    }

    /**
     * https://www.programcreek.com/java-api-examples/?code=opengeospatial/teamengine/teamengine-master/teamengine-spi/src/main/java/com/occamlab/te/spi/executors/testng/TestNGExecutor.java
     *
     * Sets the test suite to run using the given URI reference. Three types of
     * references are supported:
     * <ul>
     * <li>A file system reference</li>
     * <li>A file: URI</li>
     * <li>A jar: URI</li>
     * </ul>
     *
     * @param driver
     *            The main TestNG driver.
     * @param ets
     *            A URI referring to a suite definition.
     */
    private static void setTestSuites(TestNG driver, URI ets) {
        if (ets.getScheme().equalsIgnoreCase("jar")) {
            // jar:{url}!/{entry}
            System.out.println("MADE IT INTO THE JAR PART");
            System.out.println(ets.getSchemeSpecificPart());
            String[] jarPath = ets.getSchemeSpecificPart().split("!");
            File jarFile = new File(URI.create(jarPath[0]));
            System.out.println(jarFile.getAbsolutePath());
            driver.setTestJar(jarFile.getAbsolutePath());
            System.out.println("LINE 60: " + jarPath[1].toLowerCase());
            System.out.println("LINE 61: " + jarPath[1].substring(1));
            driver.setXmlPathInJar(jarPath[1].substring(1));
        } else {
            List<String> testSuites = new ArrayList<String>();
//            File tngFile = new File(ets);
//            if (tngFile.exists()) {
//                System.out.printf("Using TestNG config file %s", tngFile.getAbsolutePath());
            System.out.printf("Using TestNG config file");
//                testSuites.add(tngFile.getAbsolutePath());
            testSuites.add("/Users/gurdeep/Documents/GitHub/exos-systems/api-integration-tests/target/test-classes/testng.xml");
//            } else {
//                throw new IllegalArgumentException("A valid TestNG config file reference is required.");
//            }
            driver.setTestSuites(testSuites);
        }
    }
}