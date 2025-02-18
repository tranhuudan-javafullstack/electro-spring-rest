package com.electro.repository.order;

import com.electro.model.entity.order.OrderVariant;
import com.electro.model.entity.order.OrderVariantKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrderVariantRepository extends JpaRepository<OrderVariant, OrderVariantKey>,
        JpaSpecificationExecutor<OrderVariant> {}
