package com.pips.mapper;

import com.pips.pojo.TodoItem;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface TodoItemMapper {
    public List<TodoItem> getAllItems();

    public List<TodoItem> getItemById(String id);

    public void addItem(TodoItem item);

    public void deleteItemById(String id);

    public List<TodoItem> selectDisplayItem(Date date);

    public List<TodoItem> selectDisplayItemById(String id, Date date);
}
