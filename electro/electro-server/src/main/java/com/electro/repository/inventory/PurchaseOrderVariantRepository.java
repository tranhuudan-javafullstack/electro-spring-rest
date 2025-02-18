package com.electro.repository.inventory;

import com.electro.model.entity.inventory.PurchaseOrderVariant;
import com.electro.model.entity.inventory.PurchaseOrderVariantKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseOrderVariantRepository extends JpaRepository<PurchaseOrderVariant, PurchaseOrderVariantKey>,
        JpaSpecificationExecutor<PurchaseOrderVariant> {}
