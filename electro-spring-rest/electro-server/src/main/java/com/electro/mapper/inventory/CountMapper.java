package com.electro.mapper.inventory;

import com.electro.model.request.inventory.CountRequest;
import com.electro.model.reponse.inventory.CountResponse;
import com.electro.model.entity.inventory.Count;
import com.electro.mapper.GenericMapper;
import com.electro.utils.MapperUtils;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,
        uses = {MapperUtils.class, WarehouseMapper.class, CountVariantMapper.class})
public interface CountMapper extends GenericMapper<Count, CountRequest, CountResponse> {

    @Override
    @BeanMapping(qualifiedByName = "attachCount")
    @Mapping(source = "warehouseId", target = "warehouse")
    Count requestToEntity(CountRequest request);

    @Override
    @BeanMapping(qualifiedByName = "attachCount")
    @Mapping(source = "warehouseId", target = "warehouse")
    Count partialUpdate(@MappingTarget Count entity, CountRequest request);

}
