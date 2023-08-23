package com.pips.service.impl;

import com.pips.pojo.ItemList;
import com.pips.service.ItemListService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemListServiceImpl implements ItemListService {
    @Override
    public List<ItemList> findAllList() {
        List<ItemList> lists = new ArrayList<>();
        ItemList itemList1 = new ItemList("10001","默认列表");
        ItemList itemList2 = new ItemList("10002","菜谱");
        ItemList itemList3 = new ItemList("10003","露营装备");
        lists.add(itemList1);
        lists.add(itemList2);
        lists.add(itemList3);
        return lists;
    }

    @Override
    public ItemList findListById(String id) {
        return null;
    }

    @Override
    public void addList(ItemList list) {

    }

    @Override
    public void deleteListById(String id) {

    }
}
