package com.electro.model.request.inventory;

import lombok.Data;

@Data
public class DocketVariantKeyRequest {
    private Long docketId;
    private Long variantId;
}
