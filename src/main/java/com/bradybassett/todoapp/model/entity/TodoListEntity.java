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
@Table(name = "todo_lists")
public class TodoListEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "todo_list_id_seq")
    private long id;

    private String name;

    private String description;

    private boolean is_completed;

    @ManyToOne()
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;
}
