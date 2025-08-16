package com.bradybassett.todoapp.mappers.impl;

import com.bradybassett.todoapp.mappers.Mapper;
import com.bradybassett.todoapp.model.dto.TodoListDto;
import com.bradybassett.todoapp.model.entity.TodoListEntity;
import org.modelmapper.ModelMapper;

public class TodoListMapper implements Mapper<TodoListEntity, TodoListDto> {

    private ModelMapper modelMapper;

    public TodoListMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public TodoListDto mapToDto(TodoListEntity todoListEntity) {
        return modelMapper.map(todoListEntity, TodoListDto.class);
    }

    @Override
    public TodoListEntity mapToEntity(TodoListDto todoListDto) {
        return modelMapper.map(todoListDto, TodoListEntity.class);
    }
}
