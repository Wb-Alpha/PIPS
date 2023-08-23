package com.pips.controller;

import com.pips.pojo.TodoItem;
import com.pips.pojo.TodoList;
import com.pips.service.TodoItemService;
import com.pips.service.TodoListService;
import com.pips.vo.ItemListVo;
import com.pips.vo.TodoItemVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
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
        List<ItemListVo> itemListVoList = new ArrayList<>();    // Vo类，存储了列表及其所属的对象
        for (TodoList list: todoLists) {
            // 找出需要显示到前端的代办事项
            List<TodoItem> todoItems = todoItemService.findDisplayItemById(list.getList_id(), date);
            List<TodoItemVo> todoItemVoList = new ArrayList<>();
            for (TodoItem i: todoItems) {
                TodoItemVo todoItemVo = new TodoItemVo(i.getItemId(), i.getItemName(), i.getStartTime(),i.getEndTime(), i.getBelongList(),
                        i.getRepeat(), i.isAddToClock(), i.getPriority(), i.getIntro(), i.isFinish());
                todoItemVoList.add(todoItemVo);
            }
            ItemListVo itemListVo = new ItemListVo(list.getList_id(), list.getList_name(), list.getIntro(), todoItemVoList);
            itemListVoList.add(itemListVo);
        }
        model.addAttribute("itemListVoList", itemListVoList);
        model.addAttribute("hello","hello");
        return "todoList/mainPage";
    }

    @GetMapping("/getVoList")
    public List getVoList(){
        List<String> list = new ArrayList<>();
        list.add("aaaa");
        return list;
    }

    @RequestMapping("/addTodoList")
    public String addTodoList(Model model, HttpSession session){
        System.out.println("execute");
        TodoList todoList = new TodoList("10002", "xxx", "test");
        todoListService.createTodoList(todoList);
        return "todoList/mainPage";
    }

    @RequestMapping("/deleteTodoList")
    public String deleteTodoList(Model model){
        String id = "10002";
        todoListService.deleteTodoListById(id);
        return "todoList/mainPage";
    }

    @RequestMapping("/addItem")
    public String createItem(Model model, TodoItem item){
        todoItemService.addItem(item);
        return "todoList/mainPage";
    }
}
