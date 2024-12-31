package com.electro.service.promotion;

import com.electro.constant.FieldName;
import com.electro.constant.ResourceName;
import com.electro.constant.SearchFields;
import com.electro.model.common.ListResponse;
import com.electro.model.request.promotion.PromotionRequest;
import com.electro.model.reponse.promotion.PromotionResponse;
import com.electro.model.entity.product.Product;
import com.electro.model.entity.promotion.Promotion;
import com.electro.exception.ResourceNotFoundException;
import com.electro.mapper.promotion.PromotionMapper;
import com.electro.repository.promotion.PromotionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PromotionServiceImpl implements PromotionService {

    private final  PromotionRepository promotionRepository;
    private final PromotionMapper promotionMapper;

    @Override
    public ListResponse<PromotionResponse> findAll(int page, int size, String sort, String filter, String search, boolean all) {
        return defaultFindAll(page, size, sort, filter, search, all, SearchFields.PROMOTION.getFields(), promotionRepository, promotionMapper);
    }

    @Override
    public PromotionResponse findById(Long id) {
        return defaultFindById(id, promotionRepository, promotionMapper, ResourceName.PROMOTION.getResourceName());
    }

    @Override
    public PromotionResponse save(PromotionRequest request) {
        Promotion promotion = promotionMapper.requestToEntity(request);

        if (promotion.getProducts().size() == 0) {
            throw new RuntimeException("Product list of promotion is empty");
        }

        for (Product product : promotion.getProducts()) {
            List<Promotion> promotions = promotionRepository
                    .findByProductId(product.getId(), promotion.getStartDate(), promotion.getEndDate());
            if (promotions.size() > 0) {
                throw new RuntimeException("Overlap promotion with product id: " + product.getId());
            }
        }

        return promotionMapper.entityToResponse(promotionRepository.save(promotion));
    }

    @Override
    public PromotionResponse save(Long id, PromotionRequest request) {
        Promotion promotion = promotionRepository.findById(id)
                .map(existingEntity -> promotionMapper.partialUpdate(existingEntity, request))
                .orElseThrow(() -> new ResourceNotFoundException(ResourceName.PROMOTION.getResourceName(), FieldName.ID.getFieldName(), id));

        if (promotion.getProducts().size() == 0) {
            throw new RuntimeException("Product list of promotion is empty");
        }

        return promotionMapper.entityToResponse(promotionRepository.save(promotion));
    }

    @Override
    public void delete(Long id) {
        promotionRepository.deleteById(id);
    }

    @Override
    public void delete(List<Long> ids) {
        promotionRepository.deleteAllById(ids);
    }

    @Override
    public boolean checkCanCreatePromotionForProduct(Long productId, Instant startDate, Instant endDate) {
        List<Promotion> promotions = promotionRepository.findByProductId(productId, startDate, endDate);
        return promotions.size() == 0;
    }

}
