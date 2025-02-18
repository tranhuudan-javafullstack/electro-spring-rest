package com.electro.service.promotion;

import com.electro.model.request.promotion.PromotionRequest;
import com.electro.model.reponse.promotion.PromotionResponse;
import com.electro.service.CrudService;

import java.time.Instant;

public interface PromotionService extends CrudService<Long, PromotionRequest, PromotionResponse> {

    boolean checkCanCreatePromotionForProduct(Long productId, Instant startDate, Instant endDate);

}
