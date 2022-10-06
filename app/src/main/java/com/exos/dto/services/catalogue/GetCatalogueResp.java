package com.exos.dto.services.catalogue;

import com.exos.dto.services.Catalogue;
import lombok.Getter;

import java.util.List;

public class GetCatalogueResp {

    @Getter private List<Catalogue> catalogues;
}
