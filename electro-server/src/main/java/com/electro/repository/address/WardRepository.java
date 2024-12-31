package com.electro.repository.address;

import com.electro.model.entity.address.Ward;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface WardRepository extends JpaRepository<Ward, Long>, JpaSpecificationExecutor<Ward> {
}
