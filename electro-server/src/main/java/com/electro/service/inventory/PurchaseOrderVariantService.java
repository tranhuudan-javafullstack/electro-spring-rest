package com.electro.service.inventory;

import com.electro.model.request.inventory.PurchaseOrderVariantRequest;
import com.electro.model.reponse.inventory.PurchaseOrderVariantResponse;
import com.electro.model.entity.inventory.PurchaseOrderVariantKey;
import com.electro.service.CrudService;

public interface PurchaseOrderVariantService extends CrudService<PurchaseOrderVariantKey, PurchaseOrderVariantRequest,
        PurchaseOrderVariantResponse> {}
