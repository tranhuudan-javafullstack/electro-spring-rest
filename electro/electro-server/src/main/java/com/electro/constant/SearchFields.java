package com.electro.constant;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum SearchFields {
    PROVINCE,
    DISTRICT,
    WARD,
    ADDRESS,
    USER,
    ROLE,
    OFFICE,
    DEPARTMENT,
    JOB_TITLE,
    JOB_LEVEL,
    JOB_TYPE,
    EMPLOYEE,
    CUSTOMER_GROUP,
    CUSTOMER_RESOURCE,
    CUSTOMER_STATUS,
    CUSTOMER,
    PROPERTY,
    CATEGORY,
    TAG,
    GUARANTEE,
    UNIT,
    SUPPLIER,
    BRAND,
    SPECIFICATION,
    PRODUCT,
    VARIANT,
    IMAGE,
    PRODUCT_INVENTORY_LIMIT,
    VARIANT_INVENTORY_LIMIT,
    COUNT_VARIANT,
    WAREHOUSE,
    COUNT,
    DESTINATION,
    DOCKET_REASON,
    TRANSFER,
    DOCKET,
    STORAGE_LOCATION,
    DOCKET_VARIANT,
    PURCHASE_ORDER,
    PURCHASE_ORDER_VARIANT,
    ORDER_RESOURCE,
    ORDER_CANCELLATION_REASON,
    ORDER,
    ORDER_VARIANT,
    WAYBILL,
    PREORDER,
    REVIEW,
    PAYMENT_METHOD,
    PROMOTION,
    MESSAGE,
    ROOM,
    CLIENT_PRODUCT,
    REWARD_STRATEGY;

    public List<String> getFields() {
        switch (this) {
            case PROVINCE:
                return List.of("name", "code");
            case DISTRICT:
                return List.of("name", "code", "province.name", "province.code");
            case WARD:
                return List.of("name", "code", "district.name", "district.code");
            case ADDRESS:
                return List.of("line", "province.name", "province.code", "district.name", "district.code");
            case USER:
                return List.of("username", "fullname", "email", "phone", "address.line", "address.province.name",
                        "address.province.code", "address.district.name", "address.district.code");
            case ROLE:
                return List.of("code", "name");
            case OFFICE:
                return List.of("name", "address.line", "address.province.name", "address.province.code",
                        "address.district.name", "address.district.code");
            case DEPARTMENT:
                return List.of("name");
            case JOB_TITLE:
                return List.of("name");
            case JOB_LEVEL:
                return List.of("name");
            case JOB_TYPE:
                return List.of("name");
            case EMPLOYEE:
                return List.of("user.username", "user.fullname", "user.email", "user.phone", "user.address.line",
                        "user.address.province.name", "user.address.province.code", "user.address.district.name",
                        "user.address.district.code", "office.name", "office.address.line", "office.address.province.name",
                        "office.address.province.code", "office.address.district.name", "office.address.district.code",
                        "department.name", "jobType.name", "jobLevel.name", "jobTitle.name");
            case CUSTOMER_GROUP:
                return List.of("code", "name", "description");
            case CUSTOMER_RESOURCE:
                return List.of("code", "name", "description");
            case CUSTOMER_STATUS:
                return List.of("code", "name", "description");
            case CUSTOMER:
                return List.of("user.username", "user.fullname", "user.email", "user.phone", "user.address.line",
                        "user.address.province.name", "user.address.province.code", "user.address.district.name",
                        "user.address.district.code", "customerGroup.code", "customerGroup.name", "customerResource.code",
                        "customerResource.name", "customerStatus.code", "customerStatus.name");
            case PROPERTY:
                return List.of("name", "code", "description");
            case CATEGORY:
                return List.of("name", "slug", "description");
            case TAG:
                return List.of("name", "slug");
            case GUARANTEE:
                return List.of("name", "description");
            case UNIT:
                return List.of("name");
            case SUPPLIER:
                return List.of("displayName", "code", "contactFullname", "contactEmail", "contactPhone",
                        "companyName", "taxCode", "email", "phone", "fax", "website", "address.line",
                        "address.province.name", "address.province.code", "address.district.name", "address.district.code",
                        "description");
            case BRAND:
                return List.of("name", "code", "description");
            case SPECIFICATION:
                return List.of("name", "code", "description");
            case PRODUCT:
                return
                        List.of("name", "code", "slug", "shortDescription", "description", "category.name", "brand.name",
                                "brand.code", "supplier.displayName", "supplier.code", "supplier.contactFullname", "supplier.contactEmail",
                                "supplier.contactPhone", "supplier.companyName", "supplier.taxCode", "supplier.email", "supplier.phone",
                                "unit.name", "guarantee.name");
            case VARIANT:
                return List.of("product.name", "product.code", "sku");
            case IMAGE:
                return List.of("name", "contentType");
            case PRODUCT_INVENTORY_LIMIT:
                return
                        List.of("product.name", "product.code", "product.category.name", "minimumLimit", "maximumLimit");
            case VARIANT_INVENTORY_LIMIT:
                return
                        List.of("variant.product.name", "variant.product.code", "variant.sku", "variant.cost", "variant.price", "minimumLimit", "maximumLimit");
            case COUNT_VARIANT:
                return
                        List.of("count.code", "variant.product.name", "variant.product.code", "variant.sku", "variant.cost", "variant.price", "inventory", "actualInventory");
            case WAREHOUSE:
                return
                        List.of("code", "name", "address.line", "address.province.name", "address.province.code", "address.district.name", "address.district.code");
            case COUNT:
                return List.of("code", "warehouse.code", "warehouse.name");
            case DESTINATION:
                return
                        List.of("contactFullname", "contactEmail", "contactPhone", "address.line", "address.province.name", "address.province.code", "address.district.name", "address.district.code");
            case DOCKET_REASON:
                return List.of("name");
            case TRANSFER:
                return List.of("code");
            case DOCKET:
                return List.of("code", "reason.name", "warehouse.code", "warehouse.name");
            case STORAGE_LOCATION:
                return List.of("name", "warehouse.code", "warehouse.name");
            case DOCKET_VARIANT:
                return
                        List.of("docket.code", "variant.product.name", "variant.product.code", "variant.sku", "variant.cost", "variant.price", "quantity");
            case PURCHASE_ORDER:
                return
                        List.of("code", "supplier.displayName", "supplier.code", "supplier.contactFullname", "supplier.contactEmail", "supplier.contactPhone", "supplier.companyName", "destination.contactFullname", "destination.contactEmail", "destination.contactPhone");
            case PURCHASE_ORDER_VARIANT:
                return
                        List.of("purchaseOrder.code", "variant.product.name", "variant.product.code", "variant.sku", "variant.cost", "variant.price", "cost", "quantity", "amount");
            case ORDER_RESOURCE:
                return List.of("code", "name", "color", "customerResource.code", "customerResource.name");
            case ORDER_CANCELLATION_REASON:
                return List.of("name");
            case ORDER:
                return
                        List.of("code", "toName", "toPhone", "toAddress", "toWardName", "toDistrictName", "toProvinceName", "orderResource.name", "user.username", "user.fullname");
            case ORDER_VARIANT:
                return
                        List.of("order.code", "variant.product.name", "variant.product.code", "variant.sku", "variant.cost", "variant.price", "price", "quantity", "amount");
            case CLIENT_PRODUCT:
                return List.of("name", "slug", "category.name", "brand.name");
            case WAYBILL:
                return List.of("code", "order.code");
            case PREORDER:
                return List.of("Preorder");
            case REVIEW:
                return
                        List.of("user.username", "user.fullname", "product.name", "product.code", "product.slug", "content");
            case PAYMENT_METHOD:
                return List.of("name", "code");
            case PROMOTION:
                return List.of("name");
            case MESSAGE:
                return List.of("createdAt", "room.id");
            case ROOM:
                return List.of("id", "name", "user.id");
            case REWARD_STRATEGY:
                return List.of("name", "code", "formula");
        }
        return Collections.emptyList();
    }
}
