package com.electro.repository.inventory;

import com.electro.model.entity.inventory.Docket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface DocketRepository extends JpaRepository<Docket, Long>, JpaSpecificationExecutor<Docket> {}
