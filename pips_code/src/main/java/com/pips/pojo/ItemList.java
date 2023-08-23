package com.pips.pojo;

public class ItemList {
    private String id;
    private String listName;

    public ItemList() {
    }

    public ItemList(String id, String listName) {
        this.id = id;
        this.listName = listName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    @Override
    public String toString() {
        return "ItemList{" +
                "id='" + id + '\'' +
                ", listName='" + listName + '\'' +
                '}';
    }
}
