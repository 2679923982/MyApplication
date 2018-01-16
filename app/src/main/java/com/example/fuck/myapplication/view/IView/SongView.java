package com.example.fuck.myapplication.view.IView;


import com.example.fuck.myapplication.model.bean.SongBean;

/**
 * Created by MK on 2017/12/28.
 */

public interface SongView {
    public void success(SongBean bean);
    public void failure(String mes);
}
