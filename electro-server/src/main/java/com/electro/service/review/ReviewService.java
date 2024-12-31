package com.electro.service.review;

import com.electro.model.request.review.ReviewRequest;
import com.electro.model.reponse.review.ReviewResponse;
import com.electro.service.CrudService;

public interface ReviewService extends CrudService<Long, ReviewRequest, ReviewResponse> {}
