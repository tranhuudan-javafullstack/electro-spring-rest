package com.electro.repository.cart;

import com.electro.model.entity.cart.CartVariant;
import com.electro.model.entity.cart.CartVariantKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CartVariantRepository extends JpaRepository<CartVariant, CartVariantKey>,
        JpaSpecificationExecutor<CartVariant> {}
