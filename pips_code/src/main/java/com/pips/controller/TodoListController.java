package com.pips.controller;

import com.pips.pojo.TodoItem;
import com.pips.pojo.TodoList;
import com.pips.service.TodoItemService;
import com.pips.service.TodoListService;
import com.pips.vo.ItemListVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/TodoList")
public class TodoListController {
    @Autowired
    private TodoItemService todoItemService;
    @Autowired
    private TodoListService todoListService;

    @RequestMapping("/toMainPage")
    public String toMainPage(Model model){
        Date date = new Date();
        List<TodoList> todoLists = todoListService.findAllLists();  // 获取所有列表
        HashMap<String, TodoList> idListMap = new HashMap<>();
        List<ItemListVo> itemListVoList = new ArrayList<>();    // Vo类，存储了列表及其所属的对象
        for (TodoList list: todoLists) {
            // 找出需要显示到前端的代办事项
            List<TodoItem> todoItems = todoItemService.findDisplayItemById(list.getList_id(), date);
            ItemListVo itemListVo = new ItemListVo(list.getList_id(), list.getList_name(), list.getIntro(), todoItems);
            itemListVoList.add(itemListVo);
        }
        model.addAttribute("itemListVoList", itemListVoList);
        model.addAttribute("idListMap", idListMap);
        return "todoList/mainPage";
    }
}
