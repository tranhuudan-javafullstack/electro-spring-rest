package com.electro.mapper.address;

import com.electro.model.request.address.ProvinceRequest;
import com.electro.model.reponse.address.ProvinceResponse;
import com.electro.model.entity.address.Province;
import com.electro.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProvinceMapper extends GenericMapper<Province, ProvinceRequest, ProvinceResponse> {
}
