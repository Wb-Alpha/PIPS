package com.pips.service;

import com.pips.pojo.TodoItem;
import com.pips.pojo.TodoList;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface TodoItemService {
    public List<TodoItem> findAllItem();

    public List<TodoItem> findItemByList(String listId);

    public void addItem(TodoItem item);

    public void deleteItemById(String id);

    // 获取需要显示的待办事项
    // 主要有三类：1.已经过期但未完成的事项 2.今天需要完成的事项 3.没有指定截止时间也没有完成的实现那
    public List<TodoItem> findDisplayItem(Date date);

    public List<TodoItem> findDisplayItemById(String id, Date  nowTime);

    // 通过列表id找出所有到期但是未完成的事项
    public List<TodoItem> findNotFinishItem(Date date);

    // 通过列表Id找出所有到期但是未完成的事项
    public List<TodoItem> findNotFinishItemByList(String id, Date date);
}
