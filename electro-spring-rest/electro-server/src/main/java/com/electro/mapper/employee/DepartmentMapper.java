package com.electro.mapper.employee;

import com.electro.model.request.employee.DepartmentRequest;
import com.electro.model.reponse.employee.DepartmentResponse;
import com.electro.model.entity.employee.Department;
import com.electro.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DepartmentMapper extends GenericMapper<Department, DepartmentRequest, DepartmentResponse> {
}
