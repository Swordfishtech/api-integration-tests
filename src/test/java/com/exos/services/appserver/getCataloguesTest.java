package com.exos.services.appserver;

import com.aventstack.extentreports.Status;
import com.exos.BaseTest;
import com.exos.GatewayRequest;
import com.exos.services.catalogue.GetCatalogueReq;
import com.exos.services.catalogue.GetCatalogueResp;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class getCataloguesTest extends BaseTest {


    @Test(groups = {"SURE-102"})
    public void returns_200_OK_response() {

        GetCatalogueReq getCatalogueReq = GetCatalogueReq.builder()
                .catalogueUid(1)
                .handle("string")
                .build();

        GatewayRequest gatewayRequest = new GatewayRequest();
        gatewayRequest
                .forService()
                .getCatalogues(getCatalogueReq)
                .send();

        assertThat(gatewayRequest.getHttpResponse().getStatus(), is(200));
        getTestReporter().log(Status.PASS, "Returned Status code 200 OK");
    }

    @Test(groups = {"SURE-101"})
    public void using_catalogue_uid_1_returns_catalogue_uid_1_only() {

        GetCatalogueReq getCatalogueReq = GetCatalogueReq.builder()
                .catalogueUid(1)
                .handle("string")
                .build();

        GatewayRequest gatewayRequest = new GatewayRequest();
        gatewayRequest
                .forService()
                .getCatalogues(getCatalogueReq)
                .send();

        GetCatalogueResp getCatalogueResp = (GetCatalogueResp) gatewayRequest.getSerializedResponse();
        assertThat(getCatalogueResp.getCatalogues(), hasSize(1));
        getTestReporter().log(Status.PASS, "Returned 1 catalogue item");
        assertThat(getCatalogueResp.getCatalogues().get(0).getCatalogueUid(), is(1));
        getTestReporter().log(Status.PASS, "Returned catalogue item 1");
    }

    @Test(groups = {"SURE-101"})
    public void using_catalogue_uid_0_returns_4_items() {

        GetCatalogueReq getCatalogueReq = GetCatalogueReq.builder()
                .catalogueUid(0)
                .handle("string")
                .build();

        GatewayRequest gatewayRequest = new GatewayRequest();
        gatewayRequest
                .forService()
                .getCatalogues(getCatalogueReq)
                .send();

        GetCatalogueResp getCatalogueResp = (GetCatalogueResp) gatewayRequest.getSerializedResponse();
        assertThat(getCatalogueResp.getCatalogues(), hasSize(4));
        getTestReporter().log(Status.PASS, "Correct number of catalogue items returned");
    }

    @Test(groups = {"SURE-102"})
    public void no_request_body_returns_400_bad_request() {

        GatewayRequest gatewayRequest = new GatewayRequest();
        gatewayRequest
                .forService()
                .getCatalogues(GetCatalogueReq.builder().build())
                .send();

        //todo this is empty request body rather than without a request body
        assertThat(gatewayRequest.getHttpResponse().getStatus(), is(400));
        getTestReporter().log(Status.PASS, "Returned Status code 400 Bad Request");
    }

    @Test(groups = {"SURE-103"})
    public void no_handle_parameter_returns_400_bad_request() {

        GetCatalogueReq getCatalogueReq = GetCatalogueReq.builder()
                .catalogueUid(1)
                .build();

        GatewayRequest gatewayRequest = new GatewayRequest();
        gatewayRequest
                .forService()
                .getCatalogues(getCatalogueReq)
                .send();

        assertThat("Invalid HTTP Respose Code returned", gatewayRequest.getHttpResponse().getStatus(), is(400));
        getTestReporter().log(Status.PASS, "Returned Status code 400 Bad Request");
    }
}
