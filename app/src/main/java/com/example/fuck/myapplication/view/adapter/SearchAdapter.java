package com.example.fuck.myapplication.view.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fuck.myapplication.R;
import com.example.fuck.myapplication.model.bean.NewsBean;
import com.example.fuck.myapplication.model.bean.bean.EventBean;
import com.example.fuck.myapplication.model.http.HttpCallback;
import com.example.fuck.myapplication.model.http.HttpClient;
import com.example.fuck.myapplication.view.activity.DownloadInfo;
import com.example.fuck.myapplication.view.activity.Main3Activity;
import com.example.fuck.myapplication.view.activity.SongActivity;
import com.example.fuck.myapplication.view.activity.SousuoActivity;
import com.example.fuck.myapplication.view.fragment.MusicPlayerService;
import com.facebook.drawee.view.SimpleDraweeView;

import org.greenrobot.eventbus.EventBus;

import java.io.IOException;
import java.util.Timer;

/**
 * Created by fuck on 2018/1/1.
 */
public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.MyHolder> {
    private Context context;
    private NewsBean bean;
    private boolean isPlaying = true;
    private String findk;

    private SeekBar smk;
    private Handler handler = new Handler();
    private Timer timer;
  MediaPlayer  mediaPlayer = new MediaPlayer();
    private BangdanAdapter.OnItemClickListener mOnItemClickListener;
    private String link;


    public SearchAdapter(Context context, NewsBean bean) {
        this.context = context;
        this.bean = bean;
        lodaData();
    }

    private void lodaData() {


    }


    public void setOnItemClickListener(BangdanAdapter.OnItemClickListener mOnItemClickListener){
        this.mOnItemClickListener = mOnItemClickListener;
    }
    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyHolder holder = new MyHolder(LayoutInflater.from(context).inflate(R.layout.sou_litem, parent, false));
        return holder;
    }
    @Override
    public void onBindViewHolder(final MyHolder holder, final int position) {
        holder.sou_gq.setText(bean.getAlbum().get(position).getAlbumname());
        holder.sou_gs.setText(bean.getAlbum().get(position).getArtistname());
        holder.sou_svs.setImageURI(bean.getAlbum().get(position).getArtistpic());
        Log.i("+++++++++",bean.getSong().get(0).getSongid());
        if (mOnItemClickListener != null){
            holder.sou_svs.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = holder.getLayoutPosition(); // 1
                    mOnItemClickListener.onItemClick(holder.itemView,position); // 2
                }
            });
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Main3Activity.class);
                intent.putExtra("song_id",bean.getSong().get(position).getSongid());
                intent.putExtra("name",bean.getAlbum().get(position).getAlbumname());
                intent.putExtra("songer_name",bean.getAlbum().get(position).getArtistname());
                context.startActivity(intent);

            }
        });
    }
    @Override
    public int getItemCount() {
        if (bean.getAlbum() != null){
            return bean.getAlbum().size();
        }
        return 0;
    }


    class MyHolder extends RecyclerView.ViewHolder {

        TextView sou_gq;
        TextView sou_gs;
        SimpleDraweeView sou_svs;

        @SuppressLint("CutPasteId")
        public MyHolder(View itemView) {
            super(itemView);
            sou_gq = itemView.findViewById(R.id.sou_gq);
            sou_gs = itemView.findViewById(R.id.sou_gs);
            sou_svs = itemView.findViewById(R.id.sou_svs);
        }
    }
}
