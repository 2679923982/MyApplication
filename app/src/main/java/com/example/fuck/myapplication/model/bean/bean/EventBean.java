package com.example.fuck.myapplication.model.bean.bean;

/**
 * Created by fuck on 2018/1/8.
 */

public class EventBean {
    private  String songid;

    public EventBean(String songid) {
        this.songid = songid;
    }

    public String getSongid() {
        return songid;
    }

    public void setSongid(String songid) {
        this.songid = songid;
    }
}
