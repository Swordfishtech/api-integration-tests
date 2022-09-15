package com.exos.services.translation;

import com.aventstack.extentreports.Status;
import com.exos.BaseTest;
import com.exos.GatewayRequest;
import com.exos.dto.services.translation.catalogue.GetCatalogueReq;
import com.exos.dto.services.translation.catalogue.GetCatalogueResp;
import org.testng.annotations.Test;

import static com.exos.helpers.AssertHelper.assertResponseCode;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestGetCatalogues extends BaseTest {


    @Test(groups = {"SURE-102"})
    public void test_get_catalogues() {

        GetCatalogueReq getCatalogueReq = GetCatalogueReq.builder()
                .catalogueUid(1)
                .handle("string")
                .build();

        GatewayRequest gatewayRequest = new GatewayRequest();
        gatewayRequest
                .forService()
                .getCatalogues(getCatalogueReq)
                .send();

        assertResponseCode(gatewayRequest, 200);
    }

    @Test(groups = {"SURE-101"})
    public void test_using_uid_1_returns_catalogue_uid_1_only() {

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
        assertResponseCode(gatewayRequest, 200);
        assertThat(getCatalogueResp.getCatalogues(), hasSize(1));
        getTestReporter().log(Status.PASS, "Validated only 1 catalogue item is returned");
        assertThat(getCatalogueResp.getCatalogues().get(0).getCatalogueUid(), is(1));
        getTestReporter().log(Status.PASS, "Validated catalogue item 1 is returned");
    }

    @Test(groups = {"SURE-101"})
    public void test_using_uid_0_returns_all_catalogue_items() {

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
        assertResponseCode(gatewayRequest, 200);
        assertThat(getCatalogueResp.getCatalogues(), hasSize(4));
        getTestReporter().log(Status.PASS, "Validated correct number of catalogue items returned");
    }

    @Test(groups = {"SURE-101"})
    public void test_using_uid_that_does_not_exist() {

        GetCatalogueReq getCatalogueReq = GetCatalogueReq.builder()
                .catalogueUid(10000)
                .handle("string")
                .build();

        GatewayRequest gatewayRequest = new GatewayRequest();
        gatewayRequest
                .forService()
                .getCatalogues(getCatalogueReq)
                .send();

        GetCatalogueResp getCatalogueResp = (GetCatalogueResp) gatewayRequest.getSerializedResponse();
        assertResponseCode(gatewayRequest, 200);
        assertThat(getCatalogueResp.getCatalogues(), hasSize(0));
        getTestReporter().log(Status.PASS, "Validated 0 catalogue items returned");
    }

    @Test(groups = {"SURE-101"})
    public void test_using_invalid_catalogue_uid() {

        GetCatalogueReq getCatalogueReq = GetCatalogueReq.builder()
                .catalogueUid("A")
                .handle("string")
                .build();

        GatewayRequest gatewayRequest = new GatewayRequest();
        gatewayRequest
                .forService()
                .getCatalogues(getCatalogueReq)
                .send();

        assertResponseCode(gatewayRequest, 400);
    }

    @Test(groups = {"SURE-103"})
    public void test_no_handle_parameter() {

        GetCatalogueReq getCatalogueReq = GetCatalogueReq.builder()
                .catalogueUid(1)
                .build();

        GatewayRequest gatewayRequest = new GatewayRequest();
        gatewayRequest
                .forService()
                .getCatalogues(getCatalogueReq)
                .send();

        assertResponseCode(gatewayRequest, 400);
    }
}
