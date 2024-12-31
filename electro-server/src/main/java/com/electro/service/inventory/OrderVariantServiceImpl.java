package com.electro.service.inventory;

import com.electro.constant.ResourceName;
import com.electro.constant.SearchFields;
import com.electro.model.common.ListResponse;
import com.electro.model.request.order.OrderVariantRequest;
import com.electro.model.reponse.order.OrderVariantResponse;
import com.electro.model.entity.order.OrderVariantKey;
import com.electro.mapper.order.OrderVariantMapper;
import com.electro.repository.order.OrderVariantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderVariantServiceImpl implements OrderVariantService {

    private final OrderVariantRepository orderVariantRepository;

    private final OrderVariantMapper orderVariantMapper;

    @Override
    public ListResponse<OrderVariantResponse> findAll(int page, int size, String sort, String filter, String search, boolean all) {
        return defaultFindAll(page, size, sort, filter, search, all, SearchFields.ORDER_VARIANT.getFields(), orderVariantRepository, orderVariantMapper);
    }

    @Override
    public OrderVariantResponse findById(OrderVariantKey id) {
        return defaultFindById(id, orderVariantRepository, orderVariantMapper, ResourceName.ORDER_VARIANT.getResourceName());
    }

    @Override
    public OrderVariantResponse save(OrderVariantRequest request) {
        return defaultSave(request, orderVariantRepository, orderVariantMapper);
    }

    @Override
    public OrderVariantResponse save(OrderVariantKey id, OrderVariantRequest request) {
        return defaultSave(id, request, orderVariantRepository, orderVariantMapper, ResourceName.ORDER_VARIANT.getResourceName());
    }

    @Override
    public void delete(OrderVariantKey id) {
        orderVariantRepository.deleteById(id);
    }

    @Override
    public void delete(List<OrderVariantKey> ids) {
        orderVariantRepository.deleteAllById(ids);
    }

}
