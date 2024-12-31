
package com.electro.service.waybill;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum WaybillCallbackConstants {
    WAITING(1),
    SHIPPING(2),
    SUCCESS(3),
    FAILED(4),
    RETURN(5);

    private final int code;


    public static WaybillCallbackConstants getStatusFromDescription(String description) {
        switch (description) { // Mới tạo đơn hàng
            case "ready_to_pick":
            case "picking":// Nhân viên đang lấy hàng
                return WAITING;
            case "cancel": // Hủy đơn hàng
                return FAILED;// Đang thu tiền người gửi
            // Nhân viên đã lấy hàng
            // Đang luân chuyển hàng
            // Đang phân loại hàng hóa
            // Nhân viên đang giao cho người nhận
            case "money_collect_picking":
            case "picked":
            case "transporting":
            case "sorting":
            case "delivering":
            case "money_collect_delivering":
                return SHIPPING;// Nhân viên đã giao hàng thành công
            case "delivered":
            case "returned":// Nhân viên trả hàng thành công
                return SUCCESS;// Đang đợi trả hàng về cho người gửi
            // Trả hàng
            // Đang luân chuyển hàng trả
            // Đang luân chuyển hàng trả
            // Đang phân loại hàng trả
            // Nhân viên đang đi trả hàng
            // Nhân viên trả hàng thất bại
            // Đơn hàng ngoại lệ không nằm trong quy trình
            // Hàng bị hư hỏng
            case "delivery_fail":
            case "waiting_to_return":
            case "return":
            case "return_transporting":
            case "return_sorting":
            case "returning":
            case "return_fail":
            case "exception":
            case "damage":
            case "lost":
                return FAILED;
            default:
                throw new IllegalArgumentException("Unknown description: " + description);
        }
    }
}

