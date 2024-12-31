package com.electro.repository.employee;

import com.electro.model.entity.employee.Office;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficeRepository extends JpaRepository<Office, Long>, JpaSpecificationExecutor<Office> {
}
