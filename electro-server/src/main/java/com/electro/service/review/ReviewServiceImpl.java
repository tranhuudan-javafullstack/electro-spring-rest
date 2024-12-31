package com.electro.service.review;

import com.electro.constant.FieldName;
import com.electro.constant.ResourceName;
import com.electro.constant.SearchFields;
import com.electro.model.common.ListResponse;
import com.electro.model.request.review.ReviewRequest;
import com.electro.model.reponse.review.ReviewResponse;
import com.electro.model.entity.review.Review;
import com.electro.exception.ResourceNotFoundException;
import com.electro.mapper.review.ReviewMapper;
import com.electro.repository.review.ReviewRepository;
import com.electro.utils.RewardUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;
    private final ReviewMapper reviewMapper;
    private final RewardUtils rewardUtils;

    @Override
    public ListResponse<ReviewResponse> findAll(int page, int size, String sort, String filter, String search, boolean all) {
        return defaultFindAll(page, size, sort, filter, search, all, SearchFields.REVIEW.getFields(), reviewRepository, reviewMapper);
    }

    @Override
    public ReviewResponse findById(Long id) {
        return defaultFindById(id, reviewRepository, reviewMapper, ResourceName.REVIEW.getResourceName());
    }

    @Override
    public ReviewResponse save(ReviewRequest request) {
        return defaultSave(request, reviewRepository, reviewMapper);
    }

    @Override
    public ReviewResponse save(Long id, ReviewRequest request) {
        Review review = reviewRepository.findById(id)
                .map(existingEntity -> reviewMapper.partialUpdate(existingEntity, request))
                .map(reviewRepository::save)
                .orElseThrow(() -> new ResourceNotFoundException(ResourceName.DOCKET.getResourceName(), FieldName.ID.getFieldName(), id));

        rewardUtils.approveReviewHook(review);

        return reviewMapper.entityToResponse(review);
    }

    @Override
    public void delete(Long id) {
        reviewRepository.deleteById(id);
    }

    @Override
    public void delete(List<Long> ids) {
        reviewRepository.deleteAllById(ids);
    }

}
