package com.electro.model.reponse.inventory;

import lombok.Data;
import org.springframework.lang.Nullable;

import java.time.Instant;

@Data
public class ProductInventoryLimitResponse {
    private Long id;
    private Instant createdAt;
    private Instant updatedAt;
    @Nullable
    private Integer minimumLimit;
    @Nullable
    private Integer maximumLimit;
}
