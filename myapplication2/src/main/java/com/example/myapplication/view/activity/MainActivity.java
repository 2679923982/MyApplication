package com.example.myapplication.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.myapplication.R;
import com.example.myapplication.model.bean.TestBean;
import com.example.myapplication.presenter.MainPresenter;
import com.example.myapplication.view.IView.IMainView;
import com.example.myapplication.view.adpater.SongListAdapter;
import com.facebook.drawee.backends.pipeline.Fresco;

public class MainActivity extends BaseActivity implements IMainView{

    private MainPresenter mainPresenter;
    private RecyclerView recyclerView;
    private SongListAdapter songListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    void initData() {
        songListAdapter = new SongListAdapter(this);
         recyclerView.setAdapter(songListAdapter);
        mainPresenter = new MainPresenter();

        //MainActivity == this
        mainPresenter.attachView(this);

        mainPresenter.loadDataFromServer();
    }

    @Override
    void initView() {
        recyclerView = findViewById(R.id.songList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);

    }

    @Override
    int setContentViewId() {
        return R.layout.activity_main;
    }



    @Override
    public void onSuccess(TestBean testBean, boolean needClear) {
        songListAdapter.setListData(testBean.getSong_list(),needClear);
        songListAdapter.notifyDataSetChanged();
        System.out.println("testBean = " + testBean);
    }
    protected void onDestroy() {
        super.onDestroy();
        if (mainPresenter != null) {
            mainPresenter.dettachView();
        }
    }


    public void onRefresh() {

        mainPresenter.refreshData();

        Log.e("myMessage","onRefresh");
    }
}
