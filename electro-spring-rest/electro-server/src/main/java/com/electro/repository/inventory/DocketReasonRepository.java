package com.electro.repository.inventory;

import com.electro.model.entity.inventory.DocketReason;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface DocketReasonRepository extends JpaRepository<DocketReason, Long>, JpaSpecificationExecutor<DocketReason> {}
