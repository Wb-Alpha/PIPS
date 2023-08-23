package com.pips.service;

import com.pips.pojo.Item;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface ItemService {
    public List<Item> findAllItem();

    public List<Item> findItemsByListId(String listId);

    public void addItem(Item item);

    public void deleteItemById(String id);

    public void alterItem(Item item);
}
