package com.electro.mapper.product;

import com.electro.model.request.product.UnitRequest;
import com.electro.model.reponse.product.UnitResponse;
import com.electro.model.entity.product.Unit;
import com.electro.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UnitMapper extends GenericMapper<Unit, UnitRequest, UnitResponse> {
}
