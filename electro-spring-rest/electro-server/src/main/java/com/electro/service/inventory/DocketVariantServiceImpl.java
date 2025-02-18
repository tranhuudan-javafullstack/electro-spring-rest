package com.electro.service.inventory;

import com.electro.constant.ResourceName;
import com.electro.constant.SearchFields;
import com.electro.model.common.ListResponse;
import com.electro.model.request.inventory.DocketVariantRequest;
import com.electro.model.reponse.inventory.DocketVariantResponse;
import com.electro.model.entity.inventory.DocketVariantKey;
import com.electro.mapper.inventory.DocketVariantMapper;
import com.electro.repository.inventory.DocketVariantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DocketVariantServiceImpl implements DocketVariantService {

    private final DocketVariantRepository docketVariantRepository;

    private final DocketVariantMapper docketVariantMapper;

    @Override
    public ListResponse<DocketVariantResponse> findAll(int page, int size, String sort, String filter, String search, boolean all) {
        return defaultFindAll(page, size, sort, filter, search, all, SearchFields.DOCKET_VARIANT.getFields(), docketVariantRepository, docketVariantMapper);
    }

    @Override
    public DocketVariantResponse findById(DocketVariantKey id) {
        return defaultFindById(id, docketVariantRepository, docketVariantMapper, ResourceName.DOCKET_VARIANT.getResourceName());
    }

    @Override
    public DocketVariantResponse save(DocketVariantRequest request) {
        return defaultSave(request, docketVariantRepository, docketVariantMapper);
    }

    @Override
    public DocketVariantResponse save(DocketVariantKey id, DocketVariantRequest request) {
        return defaultSave(id, request, docketVariantRepository, docketVariantMapper, ResourceName.DOCKET_VARIANT.getResourceName());
    }

    @Override
    public void delete(DocketVariantKey id) {
        docketVariantRepository.deleteById(id);
    }

    @Override
    public void delete(List<DocketVariantKey> ids) {
        docketVariantRepository.deleteAllById(ids);
    }

}
