package com.electro.mapper.employee;

import com.electro.model.request.employee.JobLevelRequest;
import com.electro.model.reponse.employee.JobLevelResponse;
import com.electro.model.entity.employee.JobLevel;
import com.electro.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface JobLevelMapper extends GenericMapper<JobLevel, JobLevelRequest, JobLevelResponse> {
}
