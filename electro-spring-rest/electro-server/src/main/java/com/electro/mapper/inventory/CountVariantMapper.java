package com.electro.mapper.inventory;

import com.electro.model.request.inventory.CountVariantRequest;
import com.electro.model.reponse.inventory.CountVariantResponse;
import com.electro.model.entity.inventory.CountVariant;
import com.electro.mapper.GenericMapper;
import com.electro.utils.MapperUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = MapperUtils.class)
public interface CountVariantMapper extends GenericMapper<CountVariant, CountVariantRequest, CountVariantResponse> {

    @Override
    @Mapping(source = "variantId", target = "variant")
    CountVariant requestToEntity(CountVariantRequest request);

    @Override
    @Mapping(source = "variantId", target = "variant")
    CountVariant partialUpdate(@MappingTarget CountVariant entity, CountVariantRequest request);

}
