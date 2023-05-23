package com.pips.vo;

import com.pips.pojo.TodoItem;

import java.util.Collection;
import java.util.List;

// VO类，里面包含待办清单TodoList的信息以及属于该List的所有待办事项Item
public class ItemListVo {
    private String list_id;
    private String list_name;
    private String intro;
    private Collection<TodoItem> itemList;

    public ItemListVo() {
    }

    public ItemListVo(String list_id, String list_name, String intro, Collection<TodoItem> itemList) {
        this.list_id = list_id;
        this.list_name = list_name;
        this.intro = intro;
        this.itemList = itemList;
    }

    public String getList_id() {
        return list_id;
    }

    public void setList_id(String list_id) {
        this.list_id = list_id;
    }

    public String getList_name() {
        return list_name;
    }

    public void setList_name(String list_name) {
        this.list_name = list_name;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Collection<TodoItem> getItemList() {
        return itemList;
    }

    public void setItemList(Collection<TodoItem> itemList) {
        this.itemList = itemList;
    }

    @Override
    public String toString() {
        return "ItemListVo{" +
                "list_id='" + list_id + '\'' +
                ", list_name='" + list_name + '\'' +
                ", intro='" + intro + '\'' +
                ", itemList=" + itemList +
                '}';
    }
}
