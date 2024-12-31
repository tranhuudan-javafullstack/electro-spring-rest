package com.electro.repository.inventory;

import com.electro.model.entity.inventory.ProductInventoryLimit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductInventoryLimitRepository extends JpaRepository<ProductInventoryLimit, Long>,
        JpaSpecificationExecutor<ProductInventoryLimit> {}
