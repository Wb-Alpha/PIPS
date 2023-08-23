package com.pips.vo;

import com.pips.pojo.TodoItem;

import java.util.Collection;
import java.util.List;

// VO类，里面包含待办清单TodoList的信息以及属于该List的所有待办事项Item
public class ItemListVo {
    private String list_id;
    private String list_name;
    private String intro;
    private Collection<TodoItemVo> itemVoList;

    public ItemListVo() {
    }

    public ItemListVo(String list_id, String list_name, String intro, Collection<TodoItemVo> itemVoList) {
        this.list_id = list_id;
        this.list_name = list_name;
        this.intro = intro;
        this.itemVoList = itemVoList;
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

    public Collection<TodoItemVo> getItemVoList() {
        return itemVoList;
    }

    public void setItemVoList(Collection<TodoItemVo> itemVoList) {
        this.itemVoList = itemVoList;
    }

    @Override
    public String toString() {
        return "ItemListVo{" +
                "list_id='" + list_id + '\'' +
                ", list_name='" + list_name + '\'' +
                ", intro='" + intro + '\'' +
                ", itemVoList=" + itemVoList +
                '}';
    }
}
