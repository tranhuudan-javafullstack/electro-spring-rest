package com.electro.mapper.product;

import com.electro.model.request.product.BrandRequest;
import com.electro.model.reponse.product.BrandResponse;
import com.electro.model.entity.product.Brand;
import com.electro.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BrandMapper extends GenericMapper<Brand, BrandRequest, BrandResponse> {}
