package com.electro.mapper.employee;

import com.electro.model.request.employee.JobTitleRequest;
import com.electro.model.reponse.employee.JobTitleResponse;
import com.electro.model.entity.employee.JobTitle;
import com.electro.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface JobTitleMapper extends GenericMapper<JobTitle, JobTitleRequest, JobTitleResponse> {
}
