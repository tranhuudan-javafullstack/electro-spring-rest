package com.electro.repository.inventory;

import com.electro.model.entity.inventory.VariantInventoryLimit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface VariantInventoryLimitRepository extends JpaRepository<VariantInventoryLimit, Long>,
        JpaSpecificationExecutor<VariantInventoryLimit> {}
