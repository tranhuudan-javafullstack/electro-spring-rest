package com.electro.service.inventory;

import com.electro.constant.ResourceName;
import com.electro.constant.SearchFields;
import com.electro.model.common.ListResponse;
import com.electro.model.request.inventory.PurchaseOrderVariantRequest;
import com.electro.model.reponse.inventory.PurchaseOrderVariantResponse;
import com.electro.model.entity.inventory.PurchaseOrderVariantKey;
import com.electro.mapper.inventory.PurchaseOrderVariantMapper;
import com.electro.repository.inventory.PurchaseOrderVariantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PurchaseOrderVariantServiceImpl implements PurchaseOrderVariantService {

    private final PurchaseOrderVariantRepository purchaseOrderVariantRepository;

    private final PurchaseOrderVariantMapper purchaseOrderVariantMapper;

    @Override
    public ListResponse<PurchaseOrderVariantResponse> findAll(int page, int size, String sort, String filter, String search, boolean all) {
        return defaultFindAll(page, size, sort, filter, search, all, SearchFields.PURCHASE_ORDER_VARIANT.getFields(), purchaseOrderVariantRepository, purchaseOrderVariantMapper);
    }

    @Override
    public PurchaseOrderVariantResponse findById(PurchaseOrderVariantKey id) {
        return defaultFindById(id, purchaseOrderVariantRepository, purchaseOrderVariantMapper, ResourceName.PURCHASE_ORDER_VARIANT.getResourceName());
    }

    @Override
    public PurchaseOrderVariantResponse save(PurchaseOrderVariantRequest request) {
        return defaultSave(request, purchaseOrderVariantRepository, purchaseOrderVariantMapper);
    }

    @Override
    public PurchaseOrderVariantResponse save(PurchaseOrderVariantKey id, PurchaseOrderVariantRequest request) {
        return defaultSave(id, request, purchaseOrderVariantRepository, purchaseOrderVariantMapper, ResourceName.PURCHASE_ORDER_VARIANT.getResourceName());
    }

    @Override
    public void delete(PurchaseOrderVariantKey id) {
        purchaseOrderVariantRepository.deleteById(id);
    }

    @Override
    public void delete(List<PurchaseOrderVariantKey> ids) {
        purchaseOrderVariantRepository.deleteAllById(ids);
    }

}
