package com.electro.mapper.inventory;

import com.electro.model.request.inventory.TransferRequest;
import com.electro.model.reponse.inventory.TransferResponse;
import com.electro.model.entity.inventory.Transfer;
import com.electro.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = DocketMapper.class)
public interface TransferMapper extends GenericMapper<Transfer, TransferRequest, TransferResponse> {}
