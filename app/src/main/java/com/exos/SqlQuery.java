package com.exos;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlQuery {



    private static ResultSet executeQuery(String sql) {
        DatabaseConnector.connect();

        Statement stmt = null;
        ResultSet rs = null;

        ExtentTest reporter = BaseTest.getTestReporter();
        reporter.info(MarkupHelper.createCodeBlock(sql));

        try {
            stmt = DatabaseConnector.getConnection().createStatement();
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //todo work out how to log sql responses
        return rs;
    }

    public static int getCount(String sql) {

        int count = 0;

        ResultSet rs = executeQuery(sql);
        {
            try {
                rs.next();
                count = rs.getInt(1);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return count;
    }

    public static void insertQuery(String sql) {

        executeQuery(sql);

    }

    public static int selectQuery(String sql) {
        //todo need to make this less specific

        ResultSet rs = executeQuery(sql);
        int id = 0;
        {
            try {
                rs.next();
                id = rs.getInt(1);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return id;
    }

    public static ResultSet selectAnotherQuery(String sql) {
        //todo rename this
        return executeQuery(sql);
    }

    public static void truncateQuery(String sql) {
        executeQuery(sql);
    }

    public static void clearDownOrderManagementServiceDatabases() {
        BaseTest.getTestReporter().log(Status.INFO, "Attempting to truncate all tables related to the OMS");
        truncateQuery("TRUNCATE billingaccount RESTART IDENTITY CASCADE;\n" +
                "TRUNCATE productofferingprice RESTART IDENTITY CASCADE;\n" +
                "TRUNCATE productoffering RESTART IDENTITY CASCADE;\n" +
                "TRUNCATE productspecification RESTART IDENTITY CASCADE;\n" +
                "TRUNCATE appointment RESTART IDENTITY CASCADE;\n" +
                "TRUNCATE productofferingqualificationitem RESTART IDENTITY CASCADE;\n" +
                "TRUNCATE quoteitem RESTART IDENTITY CASCADE;");
    }


    private static StringBuilder toString(ResultSet resultSet) {
        StringBuilder output = new StringBuilder();
        ResultSetMetaData rsmd = null;
        try {
            rsmd = resultSet.getMetaData();
            int columnsNumber = rsmd.getColumnCount();
            while (resultSet.next()) {
                for (int i = 1; i <= columnsNumber; i++) {
                    if (i > 1) System.out.print(",  ");
                    String columnValue = resultSet.getString(i);
                    output.append(rsmd.getColumnName(i) + " " + columnValue + "\n");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return output;
    }


}
