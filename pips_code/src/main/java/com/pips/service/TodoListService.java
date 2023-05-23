package com.pips.service;

import com.pips.pojo.TodoList;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoListService {
    public void createTodoList(TodoList todoList);

    public void deleteTodoList(TodoList todoList);

    public TodoList findListById(String id);

    public List<TodoList> findAllLists();
}
