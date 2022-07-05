package com.example.demo.todo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/todo")
class TodoRestController {

    private final TodoRepository todoRepository;

    TodoRestController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @PostMapping
    void add(@RequestBody TodoItem todoItem) {
        todoRepository.save(todoItem);
    }

    @GetMapping
    List<TodoItem> getAll() {
        return todoRepository.findAll();
    }

    @DeleteMapping
    void remove(@RequestBody TodoItem todoItem) {
        todoRepository.delete(todoItem);
    }
}
