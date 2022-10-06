package com.exos.services.product;

import com.exos.BaseTest;
import com.exos.GatewayRequest;
import com.exos.Serializer;
import com.exos.dto.services.ErrorMessage;
import com.exos.dto.services.Attributes;
import com.exos.dto.services.productsController.GetGroupProductsReq;
import com.exos.dto.services.productsController.GetGroupProductsResp;
import com.exos.dto.services.sessionController.SessionReq;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.is;

public class TestGroupProducts extends BaseTest {

    private GatewayRequest response;
    private GetGroupProductsReq request;

    @Test
    public void test_get_group_products() {

        buildDefaultGetGroupProductsRequest();
        sendRequest();
        assertThat(response.getHttpResponse().getStatus(), is(200));
    }

    @Test
    public void test_empty_compGroupCode_value_returns_product_based_on_packageCode() {

        buildDefaultGetGroupProductsRequest();
        request.setCompGroupCode("");

        sendRequest();

        GetGroupProductsResp getGroupProductsResp = (GetGroupProductsResp) response.getSerializedResponse();

        assertThat(response.getHttpResponse().getStatus(),is(200));
        assertThat(getGroupProductsResp.getProductGroupDetail().isEmpty(),is(false));
        assertThat(getGroupProductsResp.getProductGroupDetail().get(0).getPackageCode(),is(request.getPackageCode()));
    }

    @Test
    public void test_empty_packageCode_value_returns_product_based_on_compGroupCode() {

        buildDefaultGetGroupProductsRequest();
        request.setPackageCode("");

        sendRequest();
        GetGroupProductsResp getGroupProductsResp = (GetGroupProductsResp) response.getSerializedResponse();

        assertThat(response.getHttpResponse().getStatus(),is(200));
        assertThat(getGroupProductsResp.getProductGroupDetail().isEmpty(),is(false));
        assertThat(getGroupProductsResp.getProductGroupDetail().get(0).getComponentCode(),is(request.getCompGroupCode()));
    }

    @Test
    public void test_empty_compGroupCode_and_packageCode() {

        buildDefaultGetGroupProductsRequest();
        request.setCompGroupCode("").setPackageCode("");

        sendRequest();
        assertThat(response.getHttpResponse().getStatus(),is(400));
    }

    @Test
    public void test_valid_compGroupCode_but_invalid_packageCode(){

        buildDefaultGetGroupProductsRequest();
        request.setPackageCode("random");

        sendRequest();
        assertThat(response.getHttpResponse().getStatus(),is(200));

        GetGroupProductsResp getGroupProductsResp = (GetGroupProductsResp) response.getSerializedResponse();
        assertThat(getGroupProductsResp.getProductGroupDetail(),empty());
    }

    @Test
    public void test_valid_packageCode_but_invalid_compGroupCode() {

        buildDefaultGetGroupProductsRequest();
        request.setCompGroupCode("random");

        sendRequest();

        assertThat(response.getHttpResponse().getStatus(),is(200));

        GetGroupProductsResp getGroupProductsResp = (GetGroupProductsResp) response.getSerializedResponse();
        assertThat(getGroupProductsResp.getProductGroupDetail(),empty());
    }

    @Test
    public void test_lowercase_valid_compGroupCode_() {

        buildDefaultGetGroupProductsRequest();
        request.setCompGroupCode("fibrebb");

        sendRequest();
        assertThat(response.getHttpResponse().getStatus(),is(200));

        GetGroupProductsResp getGroupProductsResp = (GetGroupProductsResp) response.getSerializedResponse();
        assertThat(getGroupProductsResp.getProductGroupDetail(),empty());

    }

    @Test
    public void test_lowercase_valid_packageCode() {

        buildDefaultGetGroupProductsRequest();
        request.setPackageCode("wsbbfi01");

        sendRequest();
        assertThat(response.getHttpResponse().getStatus(),is(200));

        GetGroupProductsResp getGroupProductsResp = (GetGroupProductsResp) response.getSerializedResponse();
        assertThat(getGroupProductsResp.getProductGroupDetail(),empty());
    }

    @Test
    public void test_invalid_body() {

        //todo
    }

    @Test
    public void test_empty_correlation_id() {

        buildDefaultGetGroupProductsRequest();
        request.getSessionRequest().setCorrelationId("");

        sendRequest();
        assertThat(response.getHttpResponse().getStatus(),is(502));

        ErrorMessage error = (ErrorMessage) new Serializer().serialize(response.getHttpResponse(), ErrorMessage.class);
        assertThat(error.getMessage(),is("Invalid Correlation Id"));
        assertThat(error.getTrackingId(),is(request.getSessionRequest().getCorrelationId()));
    }

    @Test
    public void test_empty_systemTypeCd() {

        buildDefaultGetGroupProductsRequest();
        request.getSessionRequest().setSystemTypeCd("");

        sendRequest();

        assertThat(response.getHttpResponse().getStatus(),is(502));

        ErrorMessage error = (ErrorMessage) new Serializer().serialize(response.getHttpResponse(), ErrorMessage.class);
        assertThat(error.getMessage(),is("connection to session server failed"));
        assertThat(error.getTrackingId(),is(request.getSessionRequest().getCorrelationId()));
    }



    private void buildDefaultGetGroupProductsRequest() {

        request = GetGroupProductsReq.builder()
                .compGroupCode("FIBREBB")
                .packageCode("WSBBFI01")
                .sessionRequest(SessionReq
                        .builder()
                        .attributes(Attributes
                                .builder()
                                .build())
                        .correlationId("123")
                        .systemTypeCd("cerillion")
                        .build())
                .build();
    }

    private void sendRequest() {

        response = new GatewayRequest()
                .forService()
                .getGroupProducts(request)
                .send();
    }

}
