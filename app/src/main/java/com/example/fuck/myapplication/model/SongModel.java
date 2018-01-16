package com.example.fuck.myapplication.model;

import android.os.Handler;
import android.os.Message;

import com.example.fuck.myapplication.model.http.HttpInterceptor;
import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by MK on 2017/12/28.
 */

public class SongModel<B> {
    IModel miModel;
    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            B b = (B) msg.obj;
            miModel.success(b);
        }
    };
    public void loadSongData(String type, int size, int offset, final Class<B> clazz, IModel iModel){
        miModel = iModel;
        //http://tingapi.ting.baidu.com/v1/restserver/ting?method=baidu.ting.billboard.billList&type=1&size=10&offset=0
        String baseUrl = "http://tingapi.ting.baidu.com/v1/restserver/ting?method=baidu.ting.billboard.billList&type="+type+"&size="+size+"&offset="+offset+"";
        OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(new HttpInterceptor()).build();
        final Request request = new Request.Builder()
                .url(baseUrl)
                .build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                miModel.failure(e.getMessage());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String string = response.body().string();
                Gson gson = new Gson();
                B b = gson.fromJson(string, clazz);
                //发送到主线程里让他更新数据
                Message mes = handler.obtainMessage();
                mes.obj = b;
                handler.sendMessage(mes);
            }
        });
    }

    public interface IModel<B>{
        public void success(B b);
        public void failure(String mes);
    }
}
