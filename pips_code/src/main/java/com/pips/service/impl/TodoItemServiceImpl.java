package com.pips.service.impl;

import com.pips.mapper.TodoItemMapper;
import com.pips.pojo.TodoItem;
import com.pips.service.TodoItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoItemServiceImpl implements TodoItemService {
    @Autowired
    private TodoItemMapper todoItemMapper;

    @Override
    public List<TodoItem> findAllItem() {
        return null;
    }

    @Override
    public List<TodoItem> findItemByList(String listId) {
        return null;
    }

    @Override
    public void addItem(TodoItem item) {
        todoItemMapper.addItem(item);
    }

    @Override
    public void deleteItemById(String id) {

    }

    @Override
    public List<TodoItem> findDisplayItem(Date date) {
        return null;
    }

    @Override
    public List<TodoItem> findDisplayItemById(String id, Date nowTime) {
        return todoItemMapper.selectDisplayItemById(id, nowTime);
    }

    @Override
    public List<TodoItem> findNotFinishItem(Date date) {
        return null;
    }

    @Override
    public List<TodoItem> findNotFinishItemByList(String id, Date date) {
        return null;
    }
}
