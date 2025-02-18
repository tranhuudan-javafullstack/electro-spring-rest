package com.electro.model.reponse.client;

import com.electro.model.reponse.authentication.UserResponse;
import com.electro.model.reponse.order.OrderCancellationReasonResponse;
import com.electro.model.reponse.order.OrderResourceResponse;
import com.electro.model.reponse.order.OrderVariantResponse;
import lombok.Data;
import org.springframework.lang.Nullable;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Set;

@Data
public class ClientOrderResponse {
    private Long id;
    private Instant createdAt;
    private Instant updatedAt;
    private String code;
    private Integer status;
    private String toName;
    private String toPhone;
    private String toAddress;
    private String toWardName;
    private String toDistrictName;
    private String toProvinceName;
    private OrderResourceResponse orderResource;
    @Nullable
    private OrderCancellationReasonResponse orderCancellationReason;
    @Nullable
    private String note;
    private UserResponse user;
    private Set<OrderVariantResponse> orderVariants;
    private BigDecimal totalAmount;
    private BigDecimal tax;
    private BigDecimal shippingCost;
    private BigDecimal totalPay;
    private String paypalOrderId;
    private String paypalOrderStatus;
}
