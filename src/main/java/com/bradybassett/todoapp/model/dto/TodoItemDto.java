package com.bradybassett.todoapp.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TodoItemDto {

    private long id;

    private String title;

    private String description;

    private boolean is_completed;

    private TodoListDto listDto;
}
