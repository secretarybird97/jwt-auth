package com.caves.backend.mappers;

import org.mapstruct.Mapper;

import com.caves.backend.dto.UserDto;
import com.caves.backend.entities.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);
}
