package com.electro.mapper.general;

import com.electro.model.request.general.NotificationRequest;
import com.electro.model.reponse.general.NotificationResponse;
import com.electro.model.entity.general.Notification;
import com.electro.mapper.GenericMapper;
import com.electro.utils.MapperUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = MapperUtils.class)
public interface NotificationMapper extends GenericMapper<Notification, NotificationRequest, NotificationResponse> {

    @Override
    @Mapping(source = "userId", target = "user")
    Notification requestToEntity(NotificationRequest request);

    @Override
    @Mapping(source = "userId", target = "user")
    Notification partialUpdate(@MappingTarget Notification entity, NotificationRequest request);

}
