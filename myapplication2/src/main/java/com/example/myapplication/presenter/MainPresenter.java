package com.example.myapplication.presenter;

import com.example.myapplication.model.bean.TestBean;
import com.example.myapplication.model.http.HttpUtils;
import com.example.myapplication.view.IView.IMainView;
import com.example.myapplication.view.activity.MainActivity;

/**
 * Created by fuck on 2017/12/27.
 */

public class MainPresenter extends BasePresenter implements HttpUtils.HttpUtilsCallback<TestBean>{

    private IMainView iBaseView;
    private boolean needClear = false;
    private int page;
    private int pageSize = 15;
    private HttpUtils httpUtils;

    public MainPresenter() {
        httpUtils = new HttpUtils();
    }

    public void loadDataFromServer() {


        httpUtils.loadData(this,"23",15,0,TestBean.class);

    }

    public void attachView(IMainView view) {
        //IMainView view = MainActivity
        this.iBaseView = view;
    }

    public void dettachView() {
        iBaseView = null;
    }

    @Override
    public void callbackOK(TestBean testBean) {
        //做逻辑判断 回调数据
        iBaseView.onSuccess(testBean,needClear);
        needClear = false;
    }

    @Override
    public void callbackErr(String errMessage) {

    }

    public void refreshData() {
        needClear = true;
        page = 0;
        httpUtils.loadData(this,"23",pageSize,page*pageSize,TestBean.class);
    }

    public void loadMore() {
        page++;
        httpUtils.loadData(this,"23",pageSize,page*pageSize,TestBean.class);
    }
}
