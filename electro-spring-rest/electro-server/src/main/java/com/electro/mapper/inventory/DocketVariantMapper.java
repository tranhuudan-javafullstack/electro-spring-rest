package com.electro.mapper.inventory;

import com.electro.model.reponse.inventory.DocketVariantEliminatedResponse;
import com.electro.model.reponse.inventory.DocketVariantExtendedResponse;
import com.electro.model.request.inventory.DocketVariantRequest;
import com.electro.model.reponse.inventory.DocketVariantResponse;
import com.electro.model.entity.inventory.DocketVariant;
import com.electro.mapper.GenericMapper;
import com.electro.utils.MapperUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,
        uses = {DocketReasonMapper.class, WarehouseMapper.class, MapperUtils.class})
public interface DocketVariantMapper extends GenericMapper<DocketVariant, DocketVariantRequest, DocketVariantResponse> {

    @Override
    @Mapping(source = "variantId", target = "variant")
    DocketVariant requestToEntity(DocketVariantRequest request);

    @Override
    @Mapping(source = "variantId", target = "variant")
    DocketVariant partialUpdate(@MappingTarget DocketVariant entity, DocketVariantRequest request);

    DocketVariantExtendedResponse docketVariantToDocketVariantExtendedResponse(DocketVariant docketVariant);

    DocketVariantEliminatedResponse docketVariantToDocketVariantEliminatedResponse(DocketVariant docketVariant);

}
