package com.electro.mapper.product;

import com.electro.model.request.product.CategoryRequest;
import com.electro.model.reponse.product.CategoryResponse;
import com.electro.model.entity.product.Category;
import com.electro.mapper.GenericMapper;
import com.electro.utils.MapperUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = MapperUtils.class)
public interface CategoryMapper extends GenericMapper<Category, CategoryRequest, CategoryResponse> {

    @Override
    @Mapping(source = "parentCategoryId", target = "parentCategory")
    Category requestToEntity(CategoryRequest request);

    @Override
    @Mapping(source = "parentCategoryId", target = "parentCategory")
    Category partialUpdate(@MappingTarget Category entity, CategoryRequest request);

}
