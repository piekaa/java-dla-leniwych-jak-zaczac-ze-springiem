package com.example.demo.todo;

import org.springframework.data.jpa.repository.JpaRepository;

interface TodoRepository extends JpaRepository<TodoItem, String> {
}
