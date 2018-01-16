package com.example.fuck.myapplication.view.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fuck.myapplication.R;
import com.example.fuck.myapplication.model.bean.SongBean;
import com.example.fuck.myapplication.model.http.okhttp.OkhttpUtils;
import com.example.fuck.myapplication.view.activity.DetailsActivity;
import com.example.fuck.myapplication.view.activity.SongActivity;
import com.facebook.drawee.view.SimpleDraweeView;

/**
 * Created by fuck on 2018/1/2.
 */

public class ReAdapter extends RecyclerView.Adapter {
    Context context; SongBean bean;


    public ReAdapter(Context context, SongBean bean) {
        this.context = context;
        this.bean = bean;

    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.item_re1, null);

        return new ViewHolder02(view);
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder02) holder).tv_music_1.setText(bean.getSong_list().get(position).getAlbum_title());
        ((ViewHolder02) holder).re_tu.setImageURI(bean.getSong_list().get(position).getPic_s500());
        ((ViewHolder02) holder).tv_music_2.setText(bean.getSong_list().get(position).getAuthor());
        ((ViewHolder02) holder).itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, SongActivity.class);
                intent.putExtra("title", bean.getSong_list().get(position).getAlbum_title());
                intent.putExtra("songer_name", bean.getSong_list().get(position).getArtist_name());
                intent.putExtra("song_id",bean.getSong_list().get(position).getSong_id());
                context.startActivity(intent);
            }
        });
        ((ViewHolder02) holder).imageButton .setOnCreateContextMenuListener(new View.OnCreateContextMenuListener() {

            public void onCreateContextMenu(ContextMenu menu, View v,
                    ContextMenu.ContextMenuInfo menuInfo) {
                menu.add(0,0,0,"添加");
                menu.add(0,1,0,"删除");
                menu.add(0,2,0,"删除ALL");

            }
        });
    }
    static class ViewHolder02 extends RecyclerView.ViewHolder{
       ImageButton imageButton;
        SimpleDraweeView re_tu;
TextView tv_music_1;
    TextView tv_music_2;
        public ViewHolder02(View itemView) {
            super(itemView);
        re_tu= itemView.findViewById(R.id.re_tu);
            imageButton = itemView.findViewById(R.id.imageButton);
            tv_music_1 = itemView.findViewById(R.id.tv_music_1);
            tv_music_2 = itemView.findViewById(R.id.tv_music_2);

        }
        //点击事件

    }
    //定义接口

    @Override
    public int getItemCount() {
        return bean.getSong_list().size();
    }
}
