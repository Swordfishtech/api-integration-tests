package com.exos.services.product;

import com.exos.BaseTest;
import com.exos.GatewayRequest;
import com.exos.Serializer;
import com.exos.services.ErrorMessage;
import com.exos.services.productsController.Attributes;
import com.exos.services.productsController.GetGroupProductsReq;
import com.exos.services.productsController.GetGroupProductsResp;
import com.exos.services.productsController.SessionRequest;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.is;

public class getGroupProductsTest extends BaseTest {

    private GatewayRequest response;
    private GetGroupProductsReq request;

    @Test
    public void valid_request_returns_200_OK() {

        buildDefaultGetGroupProductsRequest();
        sendRequest();
        assertThat(response.getHttpResponse().getStatus(), is(200));
    }

    @Test
    public void empty_compGroupCode__value_returns_product_based_on_packageCode() {

        buildDefaultGetGroupProductsRequest();
        request.setCompGroupCode("");

        sendRequest();

        GetGroupProductsResp getGroupProductsResp = (GetGroupProductsResp) response.getSerializedResponse();

        assertThat(response.getHttpResponse().getStatus(),is(200));
        assertThat(getGroupProductsResp.getProductGroupDetail().isEmpty(),is(false));
        assertThat(getGroupProductsResp.getProductGroupDetail().get(0).getPackageCode(),is(request.getPackageCode()));
    }

    @Test
    public void empty_packageCode_value_returns_product_based_on_compGroupCode() {

        buildDefaultGetGroupProductsRequest();
        request.setPackageCode("");

        sendRequest();
        GetGroupProductsResp getGroupProductsResp = (GetGroupProductsResp) response.getSerializedResponse();

        assertThat(response.getHttpResponse().getStatus(),is(200));
        assertThat(getGroupProductsResp.getProductGroupDetail().isEmpty(),is(false));
        assertThat(getGroupProductsResp.getProductGroupDetail().get(0).getComponentCode(),is(request.getCompGroupCode()));
    }

    @Test
    public void empty_compGroupCode_and_packageCode_returns_400_Bad_Request() {

        buildDefaultGetGroupProductsRequest();
        request.setCompGroupCode("").setPackageCode("");

        sendRequest();
        assertThat(response.getHttpResponse().getStatus(),is(400));
    }

    @Test
    public void valid_compGroupCode_but_invalid_packageCode_returns_empty_body(){

        buildDefaultGetGroupProductsRequest();
        request.setPackageCode("random");

        sendRequest();
        assertThat(response.getHttpResponse().getStatus(),is(200));

        GetGroupProductsResp getGroupProductsResp = (GetGroupProductsResp) response.getSerializedResponse();
        assertThat(getGroupProductsResp.getProductGroupDetail(),empty());
    }

    @Test
    public void valid_packageCode_but_invalid_compGroupCode_returns_empty_body() {

        buildDefaultGetGroupProductsRequest();
        request.setCompGroupCode("random");

        sendRequest();

        assertThat(response.getHttpResponse().getStatus(),is(200));

        GetGroupProductsResp getGroupProductsResp = (GetGroupProductsResp) response.getSerializedResponse();
        assertThat(getGroupProductsResp.getProductGroupDetail(),empty());
    }

    @Test
    public void lowercase_valid_compGroupCode_returns_empty_body() {

        buildDefaultGetGroupProductsRequest();
        request.setCompGroupCode("fibrebb");

        sendRequest();
        assertThat(response.getHttpResponse().getStatus(),is(200));

        GetGroupProductsResp getGroupProductsResp = (GetGroupProductsResp) response.getSerializedResponse();
        assertThat(getGroupProductsResp.getProductGroupDetail(),empty());

    }

    @Test
    public void lowercase_valid_packageCode_returns_empty_body() {

        buildDefaultGetGroupProductsRequest();
        request.setPackageCode("wsbbfi01");

        sendRequest();
        assertThat(response.getHttpResponse().getStatus(),is(200));

        GetGroupProductsResp getGroupProductsResp = (GetGroupProductsResp) response.getSerializedResponse();
        assertThat(getGroupProductsResp.getProductGroupDetail(),empty());
    }

    @Test
    public void invalid_body_returns_400_Bad_Request() {

        //todo
    }

    @Test
    public void empty_correlation_id_returns_400_Bad_Request() {

        buildDefaultGetGroupProductsRequest();
        request.getSessionRequest().setCorrelationId("");

        sendRequest();
        assertThat(response.getHttpResponse().getStatus(),is(502));

        ErrorMessage error = (ErrorMessage) new Serializer().serialize(response.getHttpResponse(), ErrorMessage.class);
        assertThat(error.getMessage(),is("Invalid Correlation Id"));
        assertThat(error.getTrackingId(),is(request.getSessionRequest().correlationId));
    }

    @Test
    public void empty_systemTypeCd_returns_400_Bad_Request() {

        buildDefaultGetGroupProductsRequest();
        request.getSessionRequest().setSystemTypeCd("");

        sendRequest();

        assertThat(response.getHttpResponse().getStatus(),is(502));

        ErrorMessage error = (ErrorMessage) new Serializer().serialize(response.getHttpResponse(), ErrorMessage.class);
        assertThat(error.getMessage(),is("connection to session server failed"));
        assertThat(error.getTrackingId(),is(request.getSessionRequest().correlationId));
    }



    private void buildDefaultGetGroupProductsRequest() {

        request = GetGroupProductsReq.builder()
                .compGroupCode("FIBREBB")
                .packageCode("WSBBFI01")
                .sessionRequest(SessionRequest
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
