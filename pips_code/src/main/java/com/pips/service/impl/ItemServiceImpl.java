package com.pips.service.impl;

import com.pips.pojo.Item;
import com.pips.pojo.ItemList;
import com.pips.service.ItemListService;
import com.pips.service.ItemService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Override
    public List<Item> findAllItem() {
        return null;
    }

    @Override
    public List<Item> findItemsByListId(String listId) {
        return null;
    }

    @Override
    public void addItem(Item item) {

    }

    @Override
    public void deleteItemById(String id) {

    }

    @Override
    public void alterItem(Item item) {

    }
}
