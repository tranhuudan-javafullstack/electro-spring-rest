package com.electro.model.request.address;

import lombok.Data;

@Data
public class DistrictRequest {
    private String name;
    private String code;
    private Long provinceId;
}