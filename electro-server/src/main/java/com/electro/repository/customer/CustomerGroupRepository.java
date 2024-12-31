package com.electro.repository.customer;

import com.electro.model.entity.customer.CustomerGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerGroupRepository extends JpaRepository<CustomerGroup, Long>, JpaSpecificationExecutor<CustomerGroup> {
}