package com.electro.model.projection.inventory;

import com.electro.model.entity.inventory.DocketVariant;
import com.electro.model.entity.product.Variant;
import lombok.Data;

import java.util.List;

@Data
public class VariantInventory {
    private Variant variant;
    private List<DocketVariant> transactions;
    private Integer inventory;
    private Integer waitingForDelivery;
    private Integer canBeSold;
    private Integer areComing;
}
