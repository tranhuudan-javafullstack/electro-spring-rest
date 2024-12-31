package com.electro.repository.customer;

import com.electro.model.entity.customer.CustomerStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerStatusRepository extends JpaRepository<CustomerStatus, Long>, JpaSpecificationExecutor<CustomerStatus> {
}