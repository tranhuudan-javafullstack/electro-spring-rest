package com.electro.mapper.authentication;

import com.electro.model.request.authentication.RoleRequest;
import com.electro.model.reponse.authentication.RoleResponse;
import com.electro.model.entity.authentication.Role;
import com.electro.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RoleMapper extends GenericMapper<Role, RoleRequest, RoleResponse> {
}
