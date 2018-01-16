package com.example.fuck.myapplication.view.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by fuck on 2017/12/26.
 */

public abstract  class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setContentViewId());
        initView();
        initData();
    }

    protected abstract void initData();

    protected abstract void initView();

    abstract int setContentViewId();
}
