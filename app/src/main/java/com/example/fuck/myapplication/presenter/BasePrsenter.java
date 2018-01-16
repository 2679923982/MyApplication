package com.example.fuck.myapplication.presenter;

/**
 * Created by MK on 2017/12/28.
 */

public class BasePrsenter<V> {
    private V view;
    //接收数据
    public void attachView(V view) {
        this.view = view;
    }
    //释放数据
    public void dattachView(){
        this.view = null;
    }
    public V getView(){
        return view;
    }

}
