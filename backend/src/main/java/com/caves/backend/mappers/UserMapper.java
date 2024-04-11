package com.caves.backend.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.caves.backend.dto.SignUpDto;
import com.caves.backend.dto.UserDto;
import com.caves.backend.entities.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "token", ignore = true)
    UserDto toUserDto(User user);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "password", ignore = true)
    User signUpToUser(SignUpDto signUpDto);
}
