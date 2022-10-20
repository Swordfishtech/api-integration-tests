package com.exos;

public class Properties {

    public static final String TRANSLATION_SERVICE_SERVER_HOSTNAME = "http://localhost:8081";
    public static final String PRODUCT_SERVICE_SERVER_HOSTNAME = "http://localhost:8082";
    public static final String CART_MANAGEMENT_SERVICE_SERVER_HOSTNAME = "http://dev.exos-systems.com/cart-mgmt";
    public static final String ORDER_MANAGEMENT_SERVICE_SERVER_HOSTNAME = "http://localhost:8000";
    public static final String SESSION_SERVICE_SERVER_HOSTNAME = "http://localhost:8083";
    public static final String COMMUNICATION_SERVICE_SERVER_HOSTNAME = "http://localhost:8000";

    public static final String BOOSTER_ORCHESTRATION_SERVICE_SERVER_HOSTNAME = "https://dev.exos-systems.com/booster-orch";
    public static final String REPORT_LOCATION = "target/report/test-report.html";
//    public static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/gurdeep"; // todo need to make this db the same for all services
    public static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/cms_db"; // todo need to make this db the same for all services
    public static final String DB_USER = "postgres";
    public static final String DB_PASS = "test";

    public static final String AZURE_SERVICE_BUS_CONN = "Endpoint=sb://exos-test-service-bus.servicebus.windows.net/;SharedAccessKeyName=RootManageSharedAccessKey;SharedAccessKey=YtwVKoCsyCFDM8If9D/glLkspgMx5TiEKiJuo96vz7w=";

    public static final String AZURE_SERVICE_BUS_QUEUE_NAME = "testqueue";

}