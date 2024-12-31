package com.electro.mapper.product;

import com.electro.model.request.product.GuaranteeRequest;
import com.electro.model.reponse.product.GuaranteeResponse;
import com.electro.model.entity.product.Guarantee;
import com.electro.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface GuaranteeMapper extends GenericMapper<Guarantee, GuaranteeRequest, GuaranteeResponse> {
}
