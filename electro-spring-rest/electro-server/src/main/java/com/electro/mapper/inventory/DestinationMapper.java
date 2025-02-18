package com.electro.mapper.inventory;

import com.electro.model.request.inventory.DestinationRequest;
import com.electro.model.reponse.inventory.DestinationResponse;
import com.electro.model.entity.inventory.Destination;
import com.electro.mapper.GenericMapper;
import com.electro.mapper.address.AddressMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = AddressMapper.class)
public interface DestinationMapper extends GenericMapper<Destination, DestinationRequest, DestinationResponse> {}
