package com.example.fuck.myapplication.view.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.fuck.myapplication.R;
import com.example.fuck.myapplication.model.bean.TestBean;
import com.example.fuck.myapplication.presenter.MainPresenter;
import com.example.fuck.myapplication.presenter.MainPresenter01;
import com.example.fuck.myapplication.view.IView.IMainView;
import com.example.fuck.myapplication.view.activity.DetailsActivity;
import com.example.fuck.myapplication.view.activity.SecondActivity;
import com.example.fuck.myapplication.view.adapter.BangdanAdapter;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by fuck on 2017/12/27.
 */
public class Fragment_new extends Fragment{


    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_news, container, false);
        recyclerView = view.findViewById(R.id.recyclerviewid);
        return view;
    }
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //布局管理者
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        //适配器
        BangdanAdapter bangdanAdapter = new BangdanAdapter(getActivity());
        recyclerView.setAdapter(bangdanAdapter);
        bangdanAdapter.setOnItemClickListener(new BangdanAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position, String type) {
                Intent intent = new Intent(getActivity(), DetailsActivity.class);
                intent.putExtra("type",type);
                getActivity().startActivity(intent);
            }

            @Override
            public void onItemClick(View itemView, int position) {

            }
        });
    }


}
