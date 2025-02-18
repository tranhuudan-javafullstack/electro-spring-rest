package com.electro.model.request.order;

import lombok.Data;
import org.springframework.lang.Nullable;

@Data
public class OrderResourceRequest {
    private String code;
    private String name;
    private String color;
    @Nullable
    private Long customerResourceId;
    private Integer status;
}
