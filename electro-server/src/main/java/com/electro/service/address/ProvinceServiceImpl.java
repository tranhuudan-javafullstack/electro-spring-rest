package com.electro.service.address;

import com.electro.constant.ResourceName;
import com.electro.constant.SearchFields;
import com.electro.model.common.ListResponse;
import com.electro.model.request.address.ProvinceRequest;
import com.electro.model.reponse.address.ProvinceResponse;
import com.electro.mapper.address.ProvinceMapper;
import com.electro.repository.address.ProvinceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProvinceServiceImpl implements ProvinceService {

    private final ProvinceRepository provinceRepository;

    private final ProvinceMapper provinceMapper;

    @Override
    public ListResponse<ProvinceResponse> findAll(int page, int size, String sort, String filter, String search, boolean all) {
        return defaultFindAll(page, size, sort, filter, search, all, SearchFields.PROVINCE.getFields(), provinceRepository, provinceMapper);
    }

    @Override
    public ProvinceResponse findById(Long id) {
        return defaultFindById(id, provinceRepository, provinceMapper, ResourceName.PROVINCE.getResourceName());
    }

    @Override
    public ProvinceResponse save(ProvinceRequest request) {
        return defaultSave(request, provinceRepository, provinceMapper);
    }

    @Override
    public ProvinceResponse save(Long id, ProvinceRequest request) {
        return defaultSave(id, request, provinceRepository, provinceMapper, ResourceName.PROVINCE.getResourceName());
    }

    @Override
    public void delete(Long id) {
        provinceRepository.deleteById(id);
    }

    @Override
    public void delete(List<Long> ids) {
        provinceRepository.deleteAllById(ids);
    }

}
