package com.pips.pojo;

import java.util.Date;


public class TodoItem {
    private String itemId;
    private String itemName;
    private Date startTime;
    private Date endTime;
    private String belongList;
    private String repeat;
    private boolean addToClock;
    private Integer priority;
    private String intro;
    private boolean finish;

    public TodoItem() {
    }

    public TodoItem(String itemId, String itemName, Date startTime, Date endTime, String belongList,
                    String repeat, boolean addToClock, Integer priority, boolean finish, String intro) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.belongList = belongList;
        this.repeat = repeat;
        this.addToClock = addToClock;
        this.priority = priority;
        this.intro = intro;
        this.finish = finish;
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

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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

    @Override
    public String toString() {
        return "TodoItem{" +
                "itemId='" + itemId + '\'' +
                ", itemName='" + itemName + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", belongList='" + belongList + '\'' +
                ", repeat='" + repeat + '\'' +
                ", addToClock=" + addToClock +
                ", priority=" + priority +
                ", intro='" + intro + '\'' +
                ", finish=" + finish +
                '}';
    }
}
