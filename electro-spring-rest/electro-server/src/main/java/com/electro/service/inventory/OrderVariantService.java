package com.electro.service.inventory;

import com.electro.model.request.order.OrderVariantRequest;
import com.electro.model.reponse.order.OrderVariantResponse;
import com.electro.model.entity.order.OrderVariantKey;
import com.electro.service.CrudService;

public interface OrderVariantService extends CrudService<OrderVariantKey, OrderVariantRequest, OrderVariantResponse> {}
