package com.electro.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum FieldName {
    ID("id"),
    SLUG("slug"),
    USER_ID("user_id"),
    PRODUCT_ID("product_id"),
    ORDER_CODE("order_code"),
    USERNAME("username"),
    PAYPAL_ORDER_ID("paypal_order_id"),
    WAYBILL_CODE("waybill_code"),
    CODE("code");

    private String fieldName;

}
