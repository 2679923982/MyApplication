package com.example.fuck.myapplication.model.IMainmodel;

import com.example.fuck.myapplication.model.bean.ReBean;

/**
 * Created by fuck on 2017/12/28.
 */

public interface ModelCallBack {
    void onSuccess(ReBean bean);

    void onFailure(Exception e);


}
