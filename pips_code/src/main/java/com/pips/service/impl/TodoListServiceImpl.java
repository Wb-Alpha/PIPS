package com.pips.service.impl;

import com.pips.mapper.TodoListMapper;
import com.pips.pojo.TodoList;
import com.pips.service.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoListServiceImpl implements TodoListService {
    @Autowired
    private TodoListMapper todoListMapper;

    @Override
    public void createTodoList(TodoList todoList) {
        todoListMapper.addTodoList(todoList);
    }

    @Override
    public void deleteTodoListById(String id) {
        todoListMapper.deleteTodoList(id);
    }

    @Override
    public TodoList findListById(String id) {
        return null;
    }

    @Override
    public List<TodoList> findAllLists() {
//        List<TodoList> lists = new ArrayList<>();
//        lists.add(new TodoList("10001","默认清单",""));
        return todoListMapper.getAllLists();
    }
}
