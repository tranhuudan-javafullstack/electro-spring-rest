package com.huudan.ecommerce.dto;

import com.huudan.ecommerce.entity.Address;
import com.huudan.ecommerce.entity.Customer;
import com.huudan.ecommerce.entity.Order;
import com.huudan.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
