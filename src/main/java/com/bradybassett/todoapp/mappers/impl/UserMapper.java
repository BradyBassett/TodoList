package com.bradybassett.todoapp.mappers.impl;

import com.bradybassett.todoapp.mappers.Mapper;
import com.bradybassett.todoapp.model.dto.UserDto;
import com.bradybassett.todoapp.model.entity.UserEntity;
import org.modelmapper.ModelMapper;

public class UserMapper implements Mapper<UserEntity, UserDto> {

    private ModelMapper modelMapper;

    public UserMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public UserDto mapToDto(UserEntity userEntity) {
        return modelMapper.map(userEntity, UserDto.class);
    }

    @Override
    public UserEntity mapToEntity(UserDto userDto) {
        return modelMapper.map(userDto, UserEntity.class);
    }
}
