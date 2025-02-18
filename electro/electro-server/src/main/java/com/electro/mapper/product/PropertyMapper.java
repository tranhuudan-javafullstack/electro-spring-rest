package com.electro.mapper.product;

import com.electro.model.request.product.PropertyRequest;
import com.electro.model.reponse.product.PropertyResponse;
import com.electro.model.entity.product.Property;
import com.electro.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PropertyMapper extends GenericMapper<Property, PropertyRequest, PropertyResponse> {
}
