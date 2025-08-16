package com.bradybassett.todoapp.mappers.impl;

import com.bradybassett.todoapp.mappers.Mapper;
import com.bradybassett.todoapp.model.dto.TodoItemDto;
import com.bradybassett.todoapp.model.entity.TodoItemEntity;
import org.modelmapper.ModelMapper;

public class TodoItemMapper implements Mapper<TodoItemEntity, TodoItemDto> {

    private ModelMapper modelMapper;

    public TodoItemMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public TodoItemDto mapToDto(TodoItemEntity todoItemEntity) {
        return modelMapper.map(todoItemEntity, TodoItemDto.class);
    }

    @Override
    public TodoItemEntity mapToEntity(TodoItemDto todoItemDto) {
        return modelMapper.map(todoItemDto, TodoItemEntity.class);
    }
}
