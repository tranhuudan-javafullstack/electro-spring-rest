package com.electro.repository.employee;

import com.electro.model.entity.employee.JobLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface JobLevelRepository extends JpaRepository<JobLevel, Long>, JpaSpecificationExecutor<JobLevel> {
}