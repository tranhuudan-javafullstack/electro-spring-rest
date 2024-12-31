package com.electro.repository.employee;

import com.electro.model.entity.employee.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface JobTitleRepository extends JpaRepository<JobTitle, Long>, JpaSpecificationExecutor<JobTitle> {
}