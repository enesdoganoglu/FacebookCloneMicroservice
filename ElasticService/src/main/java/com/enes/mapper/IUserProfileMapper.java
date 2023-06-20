package com.enes.mapper;

import com.enes.repository.entity.UserProfile;
import com.enes.dto.request.UserProfileDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,componentModel = "spring")
public interface IUserProfileMapper {
    IUserProfileMapper INSTANCE = Mappers.getMapper(IUserProfileMapper.class);

    @Mapping(target= "userid",source= "id")
    UserProfile toUserProfile(final UserProfileDto dto);
}
