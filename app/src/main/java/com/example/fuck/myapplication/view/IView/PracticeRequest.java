package com.example.fuck.myapplication.view.IView;

import com.example.fuck.myapplication.model.bean.NewsBean;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by fuck on 2018/1/1.
 */

public interface PracticeRequest {
    @GET("v1/restserver/ting?from=qianqian&version=2.1.0&method=baidu.ting.search.catalogSug&format=json&")
    Observable<NewsBean> getSearc(@Query("query") String query);
}
