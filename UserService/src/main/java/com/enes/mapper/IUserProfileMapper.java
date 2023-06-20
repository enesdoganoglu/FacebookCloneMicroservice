package com.enes.mapper;

import com.enes.dto.request.UserProfileSaveRequestDto;
import com.enes.dto.request.UserProfileUpdateRequestDto;
import com.enes.rabbitmq.model.CreateUserModel;
import com.enes.repository.entity.UserProfile;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,componentModel = "spring")
public interface IUserProfileMapper {
    IUserProfileMapper INSTANCE = Mappers.getMapper(IUserProfileMapper.class);

    UserProfile toUserProfile(final UserProfileSaveRequestDto dto);

    UserProfile toUserProfile( final UserProfileUpdateRequestDto dto);

    UserProfile toUserProfile(final CreateUserModel model);
}
