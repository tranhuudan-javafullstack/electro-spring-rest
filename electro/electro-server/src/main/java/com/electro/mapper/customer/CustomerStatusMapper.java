package com.electro.mapper.customer;

import com.electro.model.request.customer.CustomerStatusRequest;
import com.electro.model.reponse.customer.CustomerStatusResponse;
import com.electro.model.entity.customer.CustomerStatus;
import com.electro.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CustomerStatusMapper extends GenericMapper<CustomerStatus, CustomerStatusRequest, CustomerStatusResponse> {
}
