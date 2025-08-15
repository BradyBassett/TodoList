package com.bradybassett.todoapp.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "todo_items")
public class TodoItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "todo_item_id_seq")
    private long id;

    private String title;

    private String description;

    private boolean is_completed;

    @ManyToOne()
    @JoinColumn(name = "todo_list_id")
    private TodoListEntity listEntity;
}
