package com.example.fuck.myapplication.view.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.fuck.myapplication.R;
import com.example.fuck.myapplication.model.bean.TestBean;
import com.example.fuck.myapplication.presenter.MainPresenter;
import com.example.fuck.myapplication.view.IView.IMainView;

public class MainActivity extends BaseActivity  {

    private MainPresenter mainPresenter;
    private ImageView donghua;


    @SuppressLint("HandlerLeak")
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what==0){
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                      startActivity(intent);

            }
        }
    };
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        donghua = findViewById(R.id.Donghua);
        handler.sendEmptyMessageDelayed(0,3000);


    }

    @Override
    int setContentViewId() {
        return R.layout.activity_main;
    }

}
