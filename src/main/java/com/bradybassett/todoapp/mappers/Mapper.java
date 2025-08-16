package com.bradybassett.todoapp.mappers;

public interface Mapper<Entity, Dto> {
    Dto mapToDto(Entity entity);

    Entity mapToEntity(Dto dto);
}
