package com.example.fuck.myapplication.view.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.example.fuck.myapplication.R;
import com.example.fuck.myapplication.model.bean.SongBean;
import com.example.fuck.myapplication.model.http.okhttp.AbstractUiCallBack;
import com.example.fuck.myapplication.model.http.okhttp.OkhttpUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MK on 2017/12/29.
 */

public class BangdanAdapter extends RecyclerView.Adapter{
    Context context;
    private ViewHolder01 viewHolder01;
    private ViewHolder02 viewHolder02;

    public BangdanAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getItemViewType(int position) {
        if (position==0 || position == 3 || position==11){
            return 0;
        }
        return 1;
    }
    //声明一个这个接口的变量
    private OnItemClickListener mOnItemClickListener = null;
    //最后暴露给外面的调用者，定义一个设置Listener的方法（）：
    public void setOnItemClickListener(OnItemClickListener listener) {
        this.mOnItemClickListener = listener;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType==0){
            View view = View.inflate(context, R.layout.adapter_viewholder01, null);
            viewHolder01 = new ViewHolder01(view);
            return viewHolder01;
        }else{
            View view = View.inflate(context, R.layout.adapter_viewholder02, null);
            viewHolder02 = new ViewHolder02(view,mOnItemClickListener);
            return viewHolder02;
        }

    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {

        if (holder instanceof ViewHolder01){
            if (position==0){
                ((ViewHolder01) holder).textView.setText("主打榜单");
            }else if (position==3){
               ((ViewHolder01) holder).textView.setText("分类榜单");
            }else if (position==11){
                ((ViewHolder01) holder).textView.setText("媒体榜单");
            }
        }else if (holder instanceof ViewHolder02){
            //将position保存在itemView的Tag中，以便点击时进行获取
            //viewHolder02.itemView.setTag(position);
            //http://tingapi.ting.baidu.com/v1/restserver/ting?method=baidu.ting.billboard.billList&type=1&size=10&offset=0
            if (position==1){
                String type = "2";
                ((ViewHolder02)holder).itemView.setTag(type);
                OkhttpUtils.getInstance().asy(null, "http://tingapi.ting.baidu.com/v1/restserver/ting?method=baidu.ting.billboard.billList&type="+type+"&size=10&offset=0", new AbstractUiCallBack<SongBean>() {
                    @Override
                    public void success(SongBean bean) {
                        Glide.with(context)
                                .load(bean.getBillboard().getPic_s192())
                                .into(((ViewHolder02) holder).imageView);
                        ((ViewHolder02) holder).tv_music_1.setText("1."+bean.getSong_list().get(0).getTitle()+"-"+bean.getSong_list().get(0).getAuthor());
                        ((ViewHolder02) holder).tv_music_2.setText("2."+bean.getSong_list().get(1).getTitle()+"-"+bean.getSong_list().get(1).getAuthor());
                        ((ViewHolder02) holder).tv_music_3.setText("3."+bean.getSong_list().get(2).getTitle()+"-"+bean.getSong_list().get(2).getAuthor());
                    }

                    @Override
                    public void failure(Exception e) {

                    }
                });


            }else if (position==2){
                String type = "1";
                ((ViewHolder02)holder).itemView.setTag(type);
                OkhttpUtils.getInstance().asy(null, "http://tingapi.ting.baidu.com/v1/restserver/ting?method=baidu.ting.billboard.billList&type="+type+"&size=10&offset=0", new AbstractUiCallBack<SongBean>() {
                    @Override
                    public void success(SongBean bean) {
                        Glide.with(context)
                                .load(bean.getBillboard().getPic_s192())
                                .into(((ViewHolder02) holder).imageView);
                        ((ViewHolder02) holder).tv_music_1.setText("1."+bean.getSong_list().get(0).getTitle()+"-"+bean.getSong_list().get(0).getAuthor());
                        ((ViewHolder02) holder).tv_music_2.setText("2."+bean.getSong_list().get(1).getTitle()+"-"+bean.getSong_list().get(1).getAuthor());
                        ((ViewHolder02) holder).tv_music_3.setText("3."+bean.getSong_list().get(2).getTitle()+"-"+bean.getSong_list().get(2).getAuthor());
                    }

                    @Override
                    public void failure(Exception e) {

                    }
                });
            }else if (position==4){
                String type = "20";
                ((ViewHolder02)holder).itemView.setTag(type);
                OkhttpUtils.getInstance().asy(null, "http://tingapi.ting.baidu.com/v1/restserver/ting?method=baidu.ting.billboard.billList&type="+type+"&size=10&offset=0", new AbstractUiCallBack<SongBean>() {
                    @Override
                    public void success(SongBean bean) {
                        Glide.with(context)
                                .load(bean.getBillboard().getPic_s192())
                                .into(((ViewHolder02) holder).imageView);
                        ((ViewHolder02) holder).tv_music_1.setText("1."+bean.getSong_list().get(0).getTitle()+"-"+bean.getSong_list().get(0).getAuthor());
                        ((ViewHolder02) holder).tv_music_2.setText("2."+bean.getSong_list().get(1).getTitle()+"-"+bean.getSong_list().get(1).getAuthor());
                        ((ViewHolder02) holder).tv_music_3.setText("3."+bean.getSong_list().get(2).getTitle()+"-"+bean.getSong_list().get(2).getAuthor());
                    }

                    @Override
                    public void failure(Exception e) {

                    }
                });
            }else if (position==5){
                String type = "21";
                ((ViewHolder02)holder).itemView.setTag(type);
                OkhttpUtils.getInstance().asy(null, "http://tingapi.ting.baidu.com/v1/restserver/ting?method=baidu.ting.billboard.billList&type="+type+"&size=10&offset=0", new AbstractUiCallBack<SongBean>() {
                    @Override
                    public void success(SongBean bean) {
                        Glide.with(context)
                                .load(bean.getBillboard().getPic_s192())
                                .into(((ViewHolder02) holder).imageView);
                        ((ViewHolder02) holder).tv_music_1.setText("1."+bean.getSong_list().get(0).getTitle()+"-"+bean.getSong_list().get(0).getAuthor());
                        ((ViewHolder02) holder).tv_music_2.setText("2."+bean.getSong_list().get(1).getTitle()+"-"+bean.getSong_list().get(1).getAuthor());
                        ((ViewHolder02) holder).tv_music_3.setText("3."+bean.getSong_list().get(2).getTitle()+"-"+bean.getSong_list().get(2).getAuthor());
                    }

                    @Override
                    public void failure(Exception e) {

                    }
                });
            }else if (position==6){
                String type = "24";
                ((ViewHolder02)holder).itemView.setTag(type);
                OkhttpUtils.getInstance().asy(null, "http://tingapi.ting.baidu.com/v1/restserver/ting?method=baidu.ting.billboard.billList&type="+type+"&size=10&offset=0", new AbstractUiCallBack<SongBean>() {
                    @Override
                    public void success(SongBean bean) {
                        Glide.with(context)
                                .load(bean.getBillboard().getPic_s192())
                                .into(((ViewHolder02) holder).imageView);
                        ((ViewHolder02) holder).tv_music_1.setText("1."+bean.getSong_list().get(0).getTitle()+"-"+bean.getSong_list().get(0).getAuthor());
                        ((ViewHolder02) holder).tv_music_2.setText("2."+bean.getSong_list().get(1).getTitle()+"-"+bean.getSong_list().get(1).getAuthor());
                        ((ViewHolder02) holder).tv_music_3.setText("3."+bean.getSong_list().get(2).getTitle()+"-"+bean.getSong_list().get(2).getAuthor());
                    }

                    @Override
                    public void failure(Exception e) {

                    }
                });
            }else if (position==7){
                String type = "23";
                ((ViewHolder02)holder).itemView.setTag(type);
                OkhttpUtils.getInstance().asy(null, "http://tingapi.ting.baidu.com/v1/restserver/ting?method=baidu.ting.billboard.billList&type="+type+"&size=10&offset=0", new AbstractUiCallBack<SongBean>() {
                    @Override
                    public void success(SongBean bean) {
                        Glide.with(context)
                                .load(bean.getBillboard().getPic_s192())
                                .into(((ViewHolder02) holder).imageView);
                        ((ViewHolder02) holder).tv_music_1.setText("1."+bean.getSong_list().get(0).getTitle()+"-"+bean.getSong_list().get(0).getAuthor());
                        ((ViewHolder02) holder).tv_music_2.setText("2."+bean.getSong_list().get(1).getTitle()+"-"+bean.getSong_list().get(1).getAuthor());
                        ((ViewHolder02) holder).tv_music_3.setText("3."+bean.getSong_list().get(2).getTitle()+"-"+bean.getSong_list().get(2).getAuthor());
                    }

                    @Override
                    public void failure(Exception e) {

                    }
                });
            }else if (position==8){
                String type = "25";
                ((ViewHolder02)holder).itemView.setTag(type);
                OkhttpUtils.getInstance().asy(null, "http://tingapi.ting.baidu.com/v1/restserver/ting?method=baidu.ting.billboard.billList&type="+type+"&size=10&offset=0", new AbstractUiCallBack<SongBean>() {
                    @Override
                    public void success(SongBean bean) {
                        Glide.with(context)
                                .load(bean.getBillboard().getPic_s192())
                                .into(((ViewHolder02) holder).imageView);
                        ((ViewHolder02) holder).tv_music_1.setText("1."+bean.getSong_list().get(0).getTitle()+"-"+bean.getSong_list().get(0).getAuthor());
                        ((ViewHolder02) holder).tv_music_2.setText("2."+bean.getSong_list().get(1).getTitle()+"-"+bean.getSong_list().get(1).getAuthor());
                        ((ViewHolder02) holder).tv_music_3.setText("3."+bean.getSong_list().get(2).getTitle()+"-"+bean.getSong_list().get(2).getAuthor());
                    }

                    @Override
                    public void failure(Exception e) {

                    }
                });
            }else if (position==9){
                String type = "22";
                ((ViewHolder02)holder).itemView.setTag(type);
                OkhttpUtils.getInstance().asy(null, "http://tingapi.ting.baidu.com/v1/restserver/ting?method=baidu.ting.billboard.billList&type="+type+"&size=10&offset=0", new AbstractUiCallBack<SongBean>() {
                    @Override
                    public void success(SongBean bean) {
                        Glide.with(context)
                                .load(bean.getBillboard().getPic_s192())
                                .into(((ViewHolder02) holder).imageView);
                        ((ViewHolder02) holder).tv_music_1.setText("1."+bean.getSong_list().get(0).getTitle()+"-"+bean.getSong_list().get(0).getAuthor());
                        ((ViewHolder02) holder).tv_music_2.setText("2."+bean.getSong_list().get(1).getTitle()+"-"+bean.getSong_list().get(1).getAuthor());
                        ((ViewHolder02) holder).tv_music_3.setText("3."+bean.getSong_list().get(2).getTitle()+"-"+bean.getSong_list().get(2).getAuthor());
                    }

                    @Override
                    public void failure(Exception e) {

                    }
                });
            }else if (position==10){
                String type = "11";
                ((ViewHolder02)holder).itemView.setTag(type);
                OkhttpUtils.getInstance().asy(null, "http://tingapi.ting.baidu.com/v1/restserver/ting?method=baidu.ting.billboard.billList&type="+type+"&size=10&offset=0", new AbstractUiCallBack<SongBean>() {
                    @Override
                    public void success(SongBean bean) {
                        Glide.with(context)
                                .load(bean.getBillboard().getPic_s192())
                                .into(((ViewHolder02) holder).imageView);
                        ((ViewHolder02) holder).tv_music_1.setText("1."+bean.getSong_list().get(0).getTitle()+"-"+bean.getSong_list().get(0).getAuthor());
                        ((ViewHolder02) holder).tv_music_2.setText("2."+bean.getSong_list().get(1).getTitle()+"-"+bean.getSong_list().get(1).getAuthor());
                        ((ViewHolder02) holder).tv_music_3.setText("3."+bean.getSong_list().get(2).getTitle()+"-"+bean.getSong_list().get(2).getAuthor());
                    }

                    @Override
                    public void failure(Exception e) {

                    }
                });
            }else if (position==12){
                String type = "6";
                ((ViewHolder02)holder).itemView.setTag(type);
                OkhttpUtils.getInstance().asy(null, "http://tingapi.ting.baidu.com/v1/restserver/ting?method=baidu.ting.billboard.billList&type="+type+"&size=10&offset=0", new AbstractUiCallBack<SongBean>() {
                    @Override
                    public void success(SongBean bean) {
                        Glide.with(context)
                                .load(bean.getBillboard().getPic_s192())
                                .into(((ViewHolder02) holder).imageView);
                        ((ViewHolder02) holder).tv_music_1.setText("1."+bean.getSong_list().get(0).getTitle()+"-"+bean.getSong_list().get(0).getAuthor());
                        ((ViewHolder02) holder).tv_music_2.setText("2."+bean.getSong_list().get(1).getTitle()+"-"+bean.getSong_list().get(1).getAuthor());
                        ((ViewHolder02) holder).tv_music_3.setText("3."+bean.getSong_list().get(2).getTitle()+"-"+bean.getSong_list().get(2).getAuthor());
                    }

                    @Override
                    public void failure(Exception e) {

                    }
                });
            }else if (position==13){
                String type = "8";
                ((ViewHolder02)holder).itemView.setTag(type);
                OkhttpUtils.getInstance().asy(null, "http://tingapi.ting.baidu.com/v1/restserver/ting?method=baidu.ting.billboard.billList&type="+type+"&size=10&offset=0", new AbstractUiCallBack<SongBean>() {
                    @Override
                    public void success(SongBean bean) {
                        Glide.with(context)
                                .load(bean.getBillboard().getPic_s192())
                                .into(((ViewHolder02) holder).imageView);
                        ((ViewHolder02) holder).tv_music_1.setText("1."+bean.getSong_list().get(0).getTitle()+"-"+bean.getSong_list().get(0).getAuthor());
                        ((ViewHolder02) holder).tv_music_2.setText("2."+bean.getSong_list().get(1).getTitle()+"-"+bean.getSong_list().get(1).getAuthor());
                        ((ViewHolder02) holder).tv_music_3.setText("3."+bean.getSong_list().get(2).getTitle()+"-"+bean.getSong_list().get(2).getAuthor());
                    }

                    @Override
                    public void failure(Exception e) {

                    }
                });
            }else if (position==14){
                String type = "18";
                ((ViewHolder02)holder).itemView.setTag(type);
                OkhttpUtils.getInstance().asy(null, "http://tingapi.ting.baidu.com/v1/restserver/ting?method=baidu.ting.billboard.billList&type="+type+"&size=10&offset=0", new AbstractUiCallBack<SongBean>() {
                    @Override
                    public void success(SongBean bean) {
                        Glide.with(context)
                                .load(bean.getBillboard().getPic_s192())
                                .into(((ViewHolder02) holder).imageView);
                        ((ViewHolder02) holder).tv_music_1.setText("1."+bean.getSong_list().get(0).getTitle()+"-"+bean.getSong_list().get(0).getAuthor());
                        ((ViewHolder02) holder).tv_music_2.setText("2."+bean.getSong_list().get(1).getTitle()+"-"+bean.getSong_list().get(1).getAuthor());
                        ((ViewHolder02) holder).tv_music_3.setText("3."+bean.getSong_list().get(2).getTitle()+"-"+bean.getSong_list().get(2).getAuthor());
                    }

                    @Override
                    public void failure(Exception e) {

                    }
                });
            }else if (position==15){
                String type = "7";
                ((ViewHolder02)holder).itemView.setTag(type);
                OkhttpUtils.getInstance().asy(null, "http://tingapi.ting.baidu.com/v1/restserver/ting?method=baidu.ting.billboard.billList&type="+type+"&size=10&offset=0", new AbstractUiCallBack<SongBean>() {
                    @Override
                    public void success(SongBean bean) {
                        Glide.with(context)
                                .load(bean.getBillboard().getPic_s192())
                                .into(((ViewHolder02) holder).imageView);
                        ((ViewHolder02) holder).tv_music_1.setText("1."+bean.getSong_list().get(0).getTitle()+"-"+bean.getSong_list().get(0).getAuthor());
                        ((ViewHolder02) holder).tv_music_2.setText("2."+bean.getSong_list().get(1).getTitle()+"-"+bean.getSong_list().get(1).getAuthor());
                        ((ViewHolder02) holder).tv_music_3.setText("3."+bean.getSong_list().get(2).getTitle()+"-"+bean.getSong_list().get(2).getAuthor());
                    }

                    @Override
                    public void failure(Exception e) {

                    }
                });
            }
        }
    }

    @Override
    public int getItemCount() {
        return 16;
    }

    static class ViewHolder01 extends RecyclerView.ViewHolder {

        private final TextView textView;

        public ViewHolder01(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_bangdan);
        }
    }
   static class ViewHolder02 extends RecyclerView.ViewHolder implements View.OnClickListener {

        private final ImageView imageView;
       private final TextView tv_music_1;
       private final TextView tv_music_2;
       private final TextView tv_music_3;
       private OnItemClickListener mOnItemClickListener = null;

       public ViewHolder02(View itemView ,OnItemClickListener mClickListener) {
            super(itemView);
           this.mOnItemClickListener=mClickListener;
           imageView = itemView.findViewById(R.id.iv_cover);
            tv_music_1 = itemView.findViewById(R.id.tv_music_1);
            tv_music_2 = itemView.findViewById(R.id.tv_music_2);
           tv_music_3 = itemView.findViewById(R.id.tv_music_3);
           itemView.setOnClickListener(this);
        }
        //点击事件
       @Override
       public void onClick(View view) {
           mOnItemClickListener.onItemClick(view,getPosition(),(String) view.getTag());
       }


    }
    //定义接口
    public static interface OnItemClickListener {
        void onItemClick(View view, int position, String type);

        void onItemClick(View itemView, int position);
    }


}
