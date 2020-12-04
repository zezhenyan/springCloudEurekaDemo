package com.example.serviceregistrationanddiscoveryclient;



import java.util.Date;


public class Entity {
    private  String id;
    private Date nowDate;
    private String shortName;
    private String longName;



    public Entity(String id) {
        this.id = id;
        this.nowDate=new Date();
    }
 
    public Entity() {
 
    }

    public String getId() {
        return id;
    }

    public Date getNowDate() {
        return nowDate;
    }

    public String getShortName() {
        return shortName;
    }

    public String getLongName() {
        return longName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNowDate(Date nowDate) {
        this.nowDate = nowDate;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }
}