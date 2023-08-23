package com.pips.vo;

import java.util.Date;

public class TodoItemVo {
    private String itemId;
    private String itemName;
    private int[] startTimeReadable;
    private int[] endTimeReadable;
    private String belongList;
    private String repeat;
    private boolean addToClock;
    private Integer priority;
    private String intro;
    private boolean finish;

    public TodoItemVo(String itemId, String itemName, int[] startTimeReadable, int[] endTimeReadable, String belongList,
                      String repeat, boolean addToClock, Integer priority, String intro, boolean finish) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.startTimeReadable = startTimeReadable;
        this.endTimeReadable = endTimeReadable;
        this.belongList = belongList;
        this.repeat = repeat;
        this.addToClock = addToClock;
        this.priority = priority;
        this.intro = intro;
        this.finish = finish;
    }

    public TodoItemVo(String itemId, String itemName, Date startTime, Date endTime, String belongList, String repeat, boolean addToClock, Integer priority, String intro, boolean finish) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.belongList = belongList;
        this.repeat = repeat;
        this.addToClock = addToClock;
        this.priority = priority;
        this.intro = intro;
        this.finish = finish;
        if (startTime!=null)
            startTimeReadable = new int[]{startTime.getYear(), startTime.getMonth()+1, startTime.getDate(), startTime.getHours(), startTime.getMinutes()};
        else
            startTimeReadable = new int[]{0,0,0,0,0};
        if (endTime!=null)
            endTimeReadable = new int[]{endTime.getYear(), endTime.getMonth()+1, endTime.getDate(), endTime.getHours(), endTime.getMinutes()};
        else
            endTimeReadable = new int[]{0,0,0,0,0};
    }

    public TodoItemVo() {
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int[] getStartTimeReadable() {
        return startTimeReadable;
    }

    public void setStartTimeReadable(int[] startTimeReadable) {
        this.startTimeReadable = startTimeReadable;
    }

    public int[] getEndTimeReadable() {
        return endTimeReadable;
    }

    public void setEndTimeReadable(int[] endTimeReadable) {
        this.endTimeReadable = endTimeReadable;
    }

    public String getBelongList() {
        return belongList;
    }

    public void setBelongList(String belongList) {
        this.belongList = belongList;
    }

    public String getRepeat() {
        return repeat;
    }

    public void setRepeat(String repeat) {
        this.repeat = repeat;
    }

    public boolean isAddToClock() {
        return addToClock;
    }

    public void setAddToClock(boolean addToClock) {
        this.addToClock = addToClock;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }
}
