package com.example.myapplication.view.adpater;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.model.bean.TestBean;
import com.facebook.drawee.backends.pipeline.Fresco;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fuck on 2017/12/27.
 */

public class SongListAdapter extends RecyclerView.Adapter<SongListAdapter.SongListHolder> {
    Context mContext;

    public SongListAdapter(Context mContext) {
         this.mContext=mContext;
    }
      private ArrayList<TestBean.SongListBean> listBeans=new ArrayList<>();
    @Override
    public SongListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(mContext).inflate(R.layout.item_song_list, parent,false);
        return new SongListHolder(inflate);
    }

    @Override
    public void onBindViewHolder(SongListHolder holder, int position) {
        SongListHolder songListHolder = (SongListHolder) holder;
        songListHolder.songName.setText(listBeans.get(position).getTitle());
    }


    public class SongListHolder extends RecyclerView.ViewHolder {
        TextView songName;
        public SongListHolder(View itemView) {
            super(itemView);
            songName = itemView.findViewById(R.id.songName);
        }
    }
    @Override
    public int getItemCount() {
        return listBeans.size();
    }

    public void setListData(List<TestBean.SongListBean> song_list, boolean needClear) {
        if (song_list!=null){
            listBeans.clear();
        }
        listBeans.addAll(song_list);
    }
}
