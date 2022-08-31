package com.exos.services.product;

import com.exos.*;
import com.exos.dto.services.ErrorMessage;
import com.exos.dto.services.productsController.Attributes;
import com.exos.dto.services.productsController.ProductImportReq;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

public class TestProductImport extends BaseTest {

    /**
     * Calls session-service to validate session + correlationId
     * Calls products-service -> app-service (products/list) to get all the products from cerillion
     *
     * Deletes all the values in the DB and adds the values it's got from the products/list endpoint
     *
     *
     *
     * //        ResultSetMetaData rsmd = rs.getMetaData();
     * //        int columnsNumber = rsmd.getColumnCount();
     * //
     * //        while (rs.next()) {
     * //            for (int i = 1; i <= columnsNumber; i++) {
     * //                if (i > 1) System.out.print(",  ");
     * //                String columnValue = rs.getString(i);
     * //                System.out.print(columnValue + " " + rsmd.getColumnName(i));
     * //            }
     * //            System.out.println("");
     * //        }
     */

    private GatewayRequest response;

    @BeforeClass
    public void create_db_connection() {

        // connect to the db
        //todo should create this automatically
        Connection conn = DatabaseConnector.connect();

        // hit endpoint
        response = new GatewayRequest()
                .forService()
                .importProducts(ProductImportReq.builder()
                        .attributes(Attributes.builder()
                                .additionalProp1("test")
                                .additionalProp2("test")
                                .additionalProp3("test")
                                .build())
                        .correlationId("123")
                        .systemTypeCd("cerillion")
                        .build())
                .send();
    }


    @Test
    public void test_product_import() {

        assertThat(response.getHttpResponse().getStatus(), is(201));
    }

    @Test
    public void test_db_contains_correct_number_of_products() {

        int numRecordsProductGroups = SqlQuery.getCount("SELECT count(*) from products_sch.product_groups");
        assertThat("invalid number of db records found in products_sch.product_groups", numRecordsProductGroups, is(161));

        int numRecordsProducts = SqlQuery.getCount("SELECT count(*) from products_sch.products;");
        assertThat("invalid number of db records found in products_sch.products table", numRecordsProducts, is(9027));
    }

    @Test
    public void test_db_contains_group_code() {

        assertThat("group_code ACOF not found", SqlQuery.getCount("SELECT count(*) FROM products_sch.product_groups where group_code ='ACOF';"), is(1));
    }

    @Test
    public void test_empty_systemTypeCd() {

        GatewayRequest response = new GatewayRequest()
                .forService()
                .importProducts(ProductImportReq.builder()
                        .attributes(Attributes.builder()
                                .additionalProp1("test")
                                .additionalProp2("test")
                                .additionalProp3("test")
                                .build())
                        .correlationId("123")
                        .systemTypeCd("")
                        .build())
                .send();

        assertThat(response.getHttpResponse().getStatus(), is(400));

        ErrorMessage error = (ErrorMessage) new Serializer().serialize(response.getHttpResponse(), ErrorMessage.class);
        assertThat(error.getMessage(),is("connection to session server failed"));
        assertThat(error.getTrackingId(),is("123"));

    }

    @Test
    public void test_empty_correlationId() {

        GatewayRequest response = new GatewayRequest()
                .forService()
                .importProducts(ProductImportReq.builder()
                        .attributes(Attributes.builder()
                                .additionalProp1("test")
                                .additionalProp2("test")
                                .additionalProp3("test")
                                .build())
                        .correlationId("")
                        .systemTypeCd("cerillion")
                        .build())
                .send();

        assertThat(response.getHttpResponse().getStatus(), is(400));

        ErrorMessage error = (ErrorMessage) new Serializer().serialize(response.getHttpResponse(), ErrorMessage.class);
        assertThat(error.getMessage(),is("Invalid Correlation Id"));
        assertThat(error.getTrackingId(),is(""));

    }

    @Test
    public void test_import_clears_db_first() {
        /**
         * insert into the db
         * hit the import endpoint
         * check those values don't exist
         */

        SqlQuery.insertQuery("INSERT into products_sch.product_groups (group_code) VALUES ('gurdeep');");
        int groupCodeId = SqlQuery.selectQuery("SELECT id from products_sch.product_groups WHERE group_code = 'gurdeep';");
        assertThat(groupCodeId, is(not(0)));

        SqlQuery.insertQuery("INSERT into products_sch.products (code, productgroupid, description, servcode, typecode, pkg) VALUES ('JUGPAL'," + groupCodeId +", 'test message', 'GJ', 'TEST', 'false');");
        assertThat(SqlQuery.getCount("SELECT count(*) from products_sch.products WHERE code = 'JUGPAL';"), is(1));

        GatewayRequest response = new GatewayRequest()
                .forService()
                .importProducts(ProductImportReq.builder()
                        .attributes(Attributes.builder()
                                .additionalProp1("test")
                                .additionalProp2("test")
                                .additionalProp3("test")
                                .build())
                        .correlationId("123")
                        .systemTypeCd("cerillion")
                        .build())
                .send();

        assertThat(response.getHttpResponse().getStatus(), is(201));
        assertThat(SqlQuery.getCount("SELECT count(*) from products_sch.product_groups WHERE group_code = 'gurdeep';"), is(0));
        assertThat(SqlQuery.getCount("SELECT count(*) from products_sch.products WHERE code = 'JUGPAL';"), is(0));
    }

}



