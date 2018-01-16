package com.example.fuck.myapplication.view.IView;


import com.example.fuck.myapplication.model.bean.TestBean;

/**
 * Created by fuck on 2017/12/27.
 */

public interface IMainView {
    void onSuccess(TestBean testBean, boolean needClear);

    void onSuccess01(TestBean testBean, boolean needClear);
}
