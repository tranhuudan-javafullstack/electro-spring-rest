package com.electro.mapper.inventory;

import com.electro.model.request.inventory.DocketReasonRequest;
import com.electro.model.reponse.inventory.DocketReasonResponse;
import com.electro.model.entity.inventory.DocketReason;
import com.electro.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DocketReasonMapper extends GenericMapper<DocketReason, DocketReasonRequest, DocketReasonResponse> {}
