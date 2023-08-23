package com.pips.pojo;

import java.util.Date;

// 实体类，用于表示一个存储的物品
public class Item{
    private String id;
    private String itemName;
    private String belongList;
    private Date ownTime;
    private Date serviceDuration;
    private float fav;
    private int price;
    private String location;
    private String tag_list;
    private String intro;

    public Item(String id, String itemName, String belongList, Date ownTime, Date serviceDuration, float fav, int price,
                String location, String tag_list, String intro) {
        this.id = id;
        this.itemName = itemName;
        this.belongList = belongList;
        this.ownTime = ownTime;
        this.serviceDuration = serviceDuration;
        this.fav = fav;
        this.price = price;
        this.location = location;
        this.tag_list = tag_list;
        this.intro = intro;
    }

    public Item() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getBelongList() {
        return belongList;
    }

    public void setBelongList(String belongList) {
        this.belongList = belongList;
    }

    public Date getOwnTime() {
        return ownTime;
    }

    public void setOwnTime(Date ownTime) {
        this.ownTime = ownTime;
    }

    public Date getServiceDuration() {
        return serviceDuration;
    }

    public void setServiceDuration(Date serviceDuration) {
        this.serviceDuration = serviceDuration;
    }

    public float getFav() {
        return fav;
    }

    public void setFav(float fav) {
        this.fav = fav;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTag_list() {
        return tag_list;
    }

    public void setTag_list(String tag_list) {
        this.tag_list = tag_list;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", itemName='" + itemName + '\'' +
                ", belongList='" + belongList + '\'' +
                ", ownTime=" + ownTime +
                ", serviceDuration=" + serviceDuration +
                ", fav=" + fav +
                ", price=" + price +
                ", location='" + location + '\'' +
                ", tag_list='" + tag_list + '\'' +
                ", intro='" + intro + '\'' +
                '}';
    }
}
