package com.caves.backend.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.caves.backend.dto.SignUpDto;
import com.caves.backend.dto.UserDto;
import com.caves.backend.entities.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);

    @Mapping(target = "password", ignore = true)
    User signUpToUser(SignUpDto signUpDto);
}
