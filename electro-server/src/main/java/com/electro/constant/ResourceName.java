package com.electro.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ResourceName {
    PROVINCE("Province"),
    DISTRICT("District"),
    WARD("Ward"),
    ADDRESS("Address"),
    USER("User"),
    ROLE("Role"),
    OFFICE("Office"),
    DEPARTMENT("Department"),
    JOB_TITLE("JobTitle"),
    JOB_LEVEL("JobLevel"),
    JOB_TYPE("JobType"),
    EMPLOYEE("Employee"),
    CUSTOMER_GROUP("CustomerGroup"),
    CUSTOMER_RESOURCE("CustomerResource"),
    CUSTOMER_STATUS("CustomerStatus"),
    CUSTOMER("Customer"),
    PROPERTY("Property"),
    CATEGORY("Category"),
    TAG("Tag"),
    GUARANTEE("Guarantee"),
    UNIT("Unit"),
    SUPPLIER("Supplier"),
    BRAND("Brand"),
    SPECIFICATION("Specification"),
    PRODUCT("Product"),
    VARIANT("Variant"),
    IMAGE("Image"),
    PRODUCT_INVENTORY_LIMIT("ProductInventoryLimit"),
    VARIANT_INVENTORY_LIMIT("VariantInventoryLimit"),
    COUNT_VARIANT("CountVariant"),
    WAREHOUSE("Warehouse"),
    COUNT("Count"),
    DESTINATION("Destination"),
    DOCKET_REASON("DocketReason"),
    TRANSFER("Transfer"),
    DOCKET("Docket"),
    STORAGE_LOCATION("StorageLocation"),
    DOCKET_VARIANT("DocketVariant"),
    PURCHASE_ORDER("PurchaseOrder"),
    PURCHASE_ORDER_VARIANT("PurchaseOrderVariant"),
    ORDER_RESOURCE("OrderResource"),
    ORDER_CANCELLATION_REASON("OrderCancellationReason"),
    ORDER("Order"),
    ORDER_VARIANT("OrderVariant"),
    WAYBILL("Waybill"),
    PREORDER("Preorder"),
    REVIEW("Review"),
    NOTIFICATION("Notification"),
    CART("Cart"),
    PAYMENT_METHOD("PaymentMethod"),
    PROMOTION("Promotion"),
    ROOM("Room"),
    MESSAGE("Message"),
    REWARD_STRATEGY("RewardStrategy");

    private String resourceName;

}
