package com.exos.dto.services.translation.catalogue;

import com.exos.dto.services.Catalogue;
import lombok.Getter;

import java.util.List;

public class GetCatalogueResp {

    @Getter private List<Catalogue> catalogues;
}
