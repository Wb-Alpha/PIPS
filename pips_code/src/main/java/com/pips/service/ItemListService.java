package com.pips.service;

import com.pips.pojo.ItemList;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ItemListService {
    public List<ItemList> findAllList();

    public ItemList findListById(String id);

    public void addList(ItemList list);

    public void deleteListById(String id);
}
