package com.electro.mapper.product;

import com.electro.model.request.product.SupplierRequest;
import com.electro.model.reponse.product.SupplierResponse;
import com.electro.model.entity.product.Supplier;
import com.electro.mapper.GenericMapper;
import com.electro.mapper.address.AddressMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = AddressMapper.class)
public interface SupplierMapper extends GenericMapper<Supplier, SupplierRequest, SupplierResponse> {
}
