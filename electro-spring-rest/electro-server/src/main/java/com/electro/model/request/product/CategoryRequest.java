package com.electro.model.request.product;

import lombok.Data;

@Data
public class CategoryRequest {
    private String name;
    private String slug;
    private String description;
    private String thumbnail;
    private Long parentCategoryId;
    private Integer status;
}
