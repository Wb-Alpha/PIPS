package com.pips.mapper;

import com.pips.pojo.TodoList;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoListMapper {
    public void addTodoList(TodoList todoList);

    public void deleteTodoList(String id);

    public TodoList getListById(String id);

    public List<TodoList> getAllLists();
}
