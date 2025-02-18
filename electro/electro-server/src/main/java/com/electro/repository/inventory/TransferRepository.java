package com.electro.repository.inventory;

import com.electro.model.entity.inventory.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferRepository extends JpaRepository<Transfer, Long>, JpaSpecificationExecutor<Transfer> {}
