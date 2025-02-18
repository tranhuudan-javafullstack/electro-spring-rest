package com.electro.mapper.customer;

import com.electro.model.request.customer.CustomerResourceRequest;
import com.electro.model.reponse.customer.CustomerResourceResponse;
import com.electro.model.entity.customer.CustomerResource;
import com.electro.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CustomerResourceMapper extends GenericMapper<CustomerResource, CustomerResourceRequest, CustomerResourceResponse> {
}
