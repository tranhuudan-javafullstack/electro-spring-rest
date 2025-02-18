package com.electro.mapper.product;

import com.electro.model.request.product.TagRequest;
import com.electro.model.reponse.product.TagResponse;
import com.electro.model.entity.product.Tag;
import com.electro.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TagMapper extends GenericMapper<Tag, TagRequest, TagResponse> {
}
