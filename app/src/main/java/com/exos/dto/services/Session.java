package com.exos.dto.services;


import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(chain = true)
public class Session {

    private Attributes attributes;
    private String correlationId;
    private String email;
    private String fullName;
    private String loginName;
    private String xCorrelationId;

}
