package com.electro.model.request.review;

import lombok.Data;
import org.springframework.lang.Nullable;

@Data
public class ReviewRequest {
    private Long userId;
    private Long productId;
    private Integer ratingScore;
    private String content;
    @Nullable
    private String reply;
    private Integer status;
}
