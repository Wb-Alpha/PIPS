package com.pips.controller;

import com.pips.pojo.Item;
import com.pips.pojo.ItemList;
import com.pips.service.ItemListService;
import com.pips.service.ItemService;
import com.pips.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

// 物品管理的Controller
@Controller
@RequestMapping("/ItemManage")
public class ItemController {
    @Autowired
    private ItemService itemService;
    @Autowired
    private ItemListService itemListService;
    @Autowired
    private TagService tagService;


    @RequestMapping("/toMainPage")
    public String toMainPage(Model model){
//        List<ItemList> allList = itemListService.findAllList();
        List<ItemList> lists = new ArrayList<>();
        ItemList itemList1 = new ItemList("10001","默认列表");
        ItemList itemList2 = new ItemList("10002","菜谱");
        ItemList itemList3 = new ItemList("10003","露营装备");
        lists.add(itemList1);
        lists.add(itemList2);
        lists.add(itemList3);
        model.addAttribute("allList",lists);
        return "itemManager/mainPage";
    }
}
