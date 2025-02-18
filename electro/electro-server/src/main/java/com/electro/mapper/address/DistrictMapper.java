package com.electro.mapper.address;

import com.electro.model.request.address.DistrictRequest;
import com.electro.model.reponse.address.DistrictResponse;
import com.electro.model.entity.address.District;
import com.electro.mapper.GenericMapper;
import com.electro.utils.MapperUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = MapperUtils.class)
public interface DistrictMapper extends GenericMapper<District, DistrictRequest, DistrictResponse> {

    @Override
    @Mapping(source = "provinceId", target = "province")
    District requestToEntity(DistrictRequest request);

    @Override
    @Mapping(source = "provinceId", target = "province")
    District partialUpdate(@MappingTarget District entity, DistrictRequest request);

}
