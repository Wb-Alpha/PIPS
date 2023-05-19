package com.pips.pojo;

public class TodoList {
    private String list_id;
    private String list_name;
    private String intro;

    public TodoList() {
    }

    public TodoList(String list_id, String list_name, String intro) {
        this.list_id = list_id;
        this.list_name = list_name;
        this.intro = intro;
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

    @Override
    public String toString() {
        return "TodoList{" +
                "list_id='" + list_id + '\'' +
                ", list_name='" + list_name + '\'' +
                ", intro='" + intro + '\'' +
                '}';
    }
}
