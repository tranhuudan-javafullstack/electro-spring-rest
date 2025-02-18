package com.electro.mapper.inventory;

import com.electro.model.request.inventory.WarehouseRequest;
import com.electro.model.reponse.inventory.WarehouseResponse;
import com.electro.model.entity.inventory.Warehouse;
import com.electro.mapper.GenericMapper;
import com.electro.mapper.address.AddressMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = AddressMapper.class)
public interface WarehouseMapper extends GenericMapper<Warehouse, WarehouseRequest, WarehouseResponse> {}
