package com.electro.repository.inventory;

import com.electro.model.entity.inventory.Count;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CountRepository extends JpaRepository<Count, Long>, JpaSpecificationExecutor<Count> {}
