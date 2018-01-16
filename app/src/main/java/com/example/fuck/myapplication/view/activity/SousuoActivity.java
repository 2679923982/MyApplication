package com.example.fuck.myapplication.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.fuck.myapplication.R;
import com.example.fuck.myapplication.model.bean.NewsBean;
import com.example.fuck.myapplication.model.bean.bean.EventBean;
import com.example.fuck.myapplication.presenter.SearchPresenter;
import com.example.fuck.myapplication.view.IView.ISearchView;
import com.example.fuck.myapplication.view.adapter.SearchAdapter;

import org.greenrobot.eventbus.EventBus;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SousuoActivity extends AppCompatActivity implements ISearchView {

    @BindView(R.id.fanhui)
    ImageButton fanhui;
    @BindView(R.id.edit)
    EditText etSa;;
    @BindView(R.id.sousuo)
    ImageButton ivScSs;;
    @BindView(R.id.recycleSou)
    RecyclerView souRv;

    private SearchPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sousuo);
        ButterKnife.bind(this);
        fanhui.setOnClickListener(
                new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        initData();


    }

    private void initData() {

        ivScSs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SousuoActivity.this, "正在搜索", Toast.LENGTH_SHORT).show();
            }
        });


        presenter = new SearchPresenter(this);

        // getSupportActionBar().hide();
        //返回

        //搜索
        ivScSs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                presenter.ShowSeach(etSa.getText().toString().trim());
            }
        });
    }

    @Override
    public void onSuccer(final NewsBean bean) {
        souRv.setLayoutManager(new LinearLayoutManager(this));
        SearchAdapter adapter = new SearchAdapter(this,bean);
        souRv.setAdapter(adapter);

    }
}
