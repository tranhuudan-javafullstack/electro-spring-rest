package com.electro.service.inventory;

import com.electro.model.request.inventory.DocketVariantRequest;
import com.electro.model.reponse.inventory.DocketVariantResponse;
import com.electro.model.entity.inventory.DocketVariantKey;
import com.electro.service.CrudService;

public interface DocketVariantService extends CrudService<DocketVariantKey, DocketVariantRequest, DocketVariantResponse> {}
