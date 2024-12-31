package com.electro.mapper.reward;

import com.electro.model.request.reward.RewardStrategyRequest;
import com.electro.model.reponse.reward.RewardStrategyResponse;
import com.electro.model.entity.reward.RewardStrategy;
import com.electro.mapper.GenericMapper;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RewardStrategyMapper extends GenericMapper<RewardStrategy, RewardStrategyRequest, RewardStrategyResponse> {

    @Override
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    RewardStrategy partialUpdate(@MappingTarget RewardStrategy entity, RewardStrategyRequest request);

}
