package com.electro.repository.customer;

import com.electro.model.entity.customer.CustomerResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerResourceRepository extends JpaRepository<CustomerResource, Long>, JpaSpecificationExecutor<CustomerResource> {
}