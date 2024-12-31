package com.electro.mapper.product;

import com.electro.model.request.product.SpecificationRequest;
import com.electro.model.reponse.product.SpecificationResponse;
import com.electro.model.entity.product.Specification;
import com.electro.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SpecificationMapper extends GenericMapper<Specification, SpecificationRequest, SpecificationResponse> {
}
