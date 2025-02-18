package com.electro.model.projection.inventory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SimpleProductInventory {
    private Long productId;
    private Integer inventory;
    private Integer waitingForDelivery;
    private Integer canBeSold;
    private Integer areComing;

    public SimpleProductInventory(Long productId, Long inventory, Long waitingForDelivery, Long canBeSold, Long areComing) {
        this.productId = productId;
        this.inventory = Math.toIntExact(inventory);
        this.waitingForDelivery = Math.toIntExact(waitingForDelivery);
        this.canBeSold = Math.toIntExact(canBeSold);
        this.areComing = Math.toIntExact(areComing);
    }
}
