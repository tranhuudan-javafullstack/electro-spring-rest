package com.electro.service.inventory;

import com.electro.model.request.inventory.CountVariantRequest;
import com.electro.model.reponse.inventory.CountVariantResponse;
import com.electro.model.entity.inventory.CountVariantKey;
import com.electro.service.CrudService;

public interface CountVariantService extends CrudService<CountVariantKey, CountVariantRequest, CountVariantResponse> {}
