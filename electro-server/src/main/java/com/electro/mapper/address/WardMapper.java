package com.electro.mapper.address;

import com.electro.model.request.address.WardRequest;
import com.electro.model.reponse.address.WardResponse;
import com.electro.model.entity.address.Ward;
import com.electro.mapper.GenericMapper;
import com.electro.utils.MapperUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = MapperUtils.class)
public interface WardMapper extends GenericMapper<Ward, WardRequest, WardResponse> {

    @Override
    @Mapping(source = "districtId", target = "district")
    Ward requestToEntity(WardRequest request);

    @Override
    @Mapping(source = "districtId", target = "district")
    Ward partialUpdate(@MappingTarget Ward entity, WardRequest request);

}
