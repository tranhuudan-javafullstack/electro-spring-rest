package com.electro.mapper.employee;

import com.electro.model.request.employee.JobTypeRequest;
import com.electro.model.reponse.employee.JobTypeResponse;
import com.electro.model.entity.employee.JobType;
import com.electro.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface JobTypeMapper extends GenericMapper<JobType, JobTypeRequest, JobTypeResponse> {
}
