package com.example.fuck.myapplication.presenter;

import com.example.fuck.myapplication.model.ISearchModel;
import com.example.fuck.myapplication.model.bean.NewsBean;
import com.example.fuck.myapplication.view.IView.ISearchView;

/**
 * Created by fuck on 2018/1/1.
 */

public class SearchPresenter implements ISearchModel.Succuss {
    ISearchView view;
    ISearchModel model;

    public SearchPresenter(ISearchView view) {
        this.view = view;
        model = new ISearchModel();
        model.setSuccuss(this);
    }


    public void onChense(NewsBean bean) {
        view.onSuccer(bean);
    }

    public void ShowSeach(String query){
        model.ChenSearc(query);
    }
}
