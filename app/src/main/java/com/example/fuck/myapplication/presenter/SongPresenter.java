package com.example.fuck.myapplication.presenter;


import com.example.fuck.myapplication.model.SongModel;
import com.example.fuck.myapplication.model.bean.SongBean;
import com.example.fuck.myapplication.view.IView.SongView;

/**
 * Created by MK on 2017/12/28.
 */

public class SongPresenter extends BasePrsenter<SongView>{

    private final SongModel model;

    public SongPresenter() {
        model = new SongModel();
    }

    public void getData(String type,int size,int offset){
        model.loadSongData(type,size,offset,SongBean.class, new SongModel.IModel<SongBean>() {
            @Override
            public void success(SongBean bean) {
                getView().success(bean);
            }

            @Override
            public void failure(String mes) {
                getView().failure(mes);
            }
        });
    }
}
