package com.example.fuck.myapplication.model;

import com.example.fuck.myapplication.model.bean.NewsBean;
import com.example.fuck.myapplication.model.http.HttpInterceptor;
import com.example.fuck.myapplication.utils.RetrofitUnitl;
import com.example.fuck.myapplication.view.IView.PracticeRequest;

import okhttp3.OkHttpClient;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by fuck on 2018/1/1.
 */

public class ISearchModel {
    Succuss succuss;

    public void setSuccuss(Succuss succuss) {
        this.succuss = succuss;
    }

    //创建一个方法
    public void ChenSearc(String query){
        //OkHttp里面可以添加拦截器
        OkHttpClient ok = new OkHttpClient.Builder()
                .addInterceptor(new HttpInterceptor())
                .build();
        //请求数据
        RetrofitUnitl.getInstance("http://tingapi.ting.baidu.com/",ok)
                .setCreate(PracticeRequest.class)
                .getSearc(query)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Subscriber<NewsBean>() {

                    public void onCompleted() {
                    }

                    public void onError(Throwable e) {
                    }

                    public void onNext(NewsBean bean) {
                        succuss.onChense(bean);
                    }
                });
    }
    //定义一个接口
    public interface Succuss{
        void onChense(NewsBean bean);
    }
}