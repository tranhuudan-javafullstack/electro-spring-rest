package com.electro.mapper.customer;

import com.electro.model.request.customer.CustomerGroupRequest;
import com.electro.model.reponse.customer.CustomerGroupResponse;
import com.electro.model.entity.customer.CustomerGroup;
import com.electro.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CustomerGroupMapper extends GenericMapper<CustomerGroup, CustomerGroupRequest, CustomerGroupResponse> {
}
