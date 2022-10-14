package com.exos.dto.services.translation.basket;

import lombok.Getter;

import java.util.List;

@Getter
public class CommitBasketResp {

    private List<NewRecordId> newRecordIds = null;

    @Getter
    public class NewRecordId {

        private String recordIdType;
        private Integer uid;

    }
}
