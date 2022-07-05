package com.example.demo.todo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
class TodoItem {

    @Id
    public String task;
}
