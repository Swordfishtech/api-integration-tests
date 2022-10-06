package com.exos.dto.services.sessionController;

import lombok.Getter;

import java.util.List;

@Getter
public class SessionResp {

    private String systemTypeCd;
    private List<Integer> accountNos = null;
    private String sessionHandle;
}
