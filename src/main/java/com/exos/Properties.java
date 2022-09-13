package com.exos;

public class Properties {

    public static final String APP_SERVER_HOSTNAME = "http://localhost:8081";
    public static final String PRODUCT_CONTROLLER_SERVER_HOSTNAME = "http://localhost:8082";
    public static final String CART_MANAGEMENT_SERVER_HOSTNAME = "http://localhost:8000";
    public static final String ORDER_MANAGEMENT_SERVER_HOSTNAME = "http://localhost:8000";

    public static final String SESSION_SERVICE_HOSTNAME = "http://localhost:8083";
    public static final String REPORT_LOCATION = "target/report/test-report.html";

    public static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/gurdeep"; // todo need to make this db the same for all services
//    public static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/oms"; // todo need to make this db the same for all services
    public static final String DB_USER = "postgres";
    public static final String DB_PASS = "test";

}