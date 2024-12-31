package com.electro.repository.inventory;

import com.electro.model.entity.inventory.CountVariant;
import com.electro.model.entity.inventory.CountVariantKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CountVariantRepository extends JpaRepository<CountVariant, CountVariantKey>,
        JpaSpecificationExecutor<CountVariant> {}
