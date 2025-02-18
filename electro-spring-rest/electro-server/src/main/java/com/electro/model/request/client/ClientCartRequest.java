package com.electro.model.request.client;

import com.electro.model.enums.UpdateQuantityType;
import lombok.Data;
import org.springframework.lang.Nullable;

import java.util.Set;

@Data
public class ClientCartRequest {
    @Nullable
    private Long cartId;
    private Long userId;
    private Set<ClientCartVariantRequest> cartItems;
    private Integer status;
    private UpdateQuantityType updateQuantityType;
}
