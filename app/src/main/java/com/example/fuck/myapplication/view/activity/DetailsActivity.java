package com.example.fuck.myapplication.view.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.fuck.myapplication.R;
import com.example.fuck.myapplication.model.bean.SongBean;
import com.example.fuck.myapplication.presenter.SongPresenter;
import com.example.fuck.myapplication.view.IView.SongView;
import com.example.fuck.myapplication.view.adapter.BangdanAdapter;
import com.example.fuck.myapplication.view.adapter.ReAdapter;
import com.liaoinstan.springview.container.DefaultFooter;
import com.liaoinstan.springview.widget.SpringView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailsActivity extends AppCompatActivity implements SongView {

    @BindView(R.id.iv_cover)
    ImageView ivCover;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.tv_update_date)
    TextView tvUpdateDate;
    @BindView(R.id.tv_comment)
    TextView tvComment;
    @BindView(R.id.recyclerviewid)
    RecyclerView recyclerviewid;
    private SongPresenter songPresenter;
    private ReAdapter reAdapter;
    private SpringView springviewid;
    int size=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ButterKnife.bind(this);
        springviewid = findViewById(R.id.spring_view);
        Intent intent = getIntent();
        final String type = intent.getStringExtra("type");
        Toast.makeText(this, type, Toast.LENGTH_SHORT).show();

        songPresenter = new SongPresenter();
        songPresenter.attachView(this);
        songPresenter.getData(type, 20, 0);



        springviewid.setFooter(new DefaultFooter(this));
        springviewid.setListener(new SpringView.OnFreshListener() {
            @Override
            public void onRefresh() {

            }

            @Override
            public void onLoadmore() {
                 size+= 10;
                songPresenter.getData(type, size, 0);
                /**
                 * 关闭加载提示
                 */
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        springviewid.onFinishFreshAndLoad();
                    }
                },1000);
            }
        });

    }

    @Override
    public void success(SongBean bean) {
        Glide.with(this)
                .load(bean.getBillboard().getPic_s192())
                .into(ivCover);
        tvTitle.setText(bean.getBillboard().getName());
        tvUpdateDate.setText("最新更新:"+bean.getBillboard().getUpdate_date());
        tvComment.setText(bean.getBillboard().getComment());
        recyclerviewid.setLayoutManager(new LinearLayoutManager(this));
        reAdapter = new ReAdapter(this, bean);
        recyclerviewid.setAdapter(reAdapter);
    }

    @Override
    public void failure(String mes) {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        songPresenter.dattachView();
    }
}
