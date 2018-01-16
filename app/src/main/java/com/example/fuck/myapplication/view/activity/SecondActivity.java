package com.example.fuck.myapplication.view.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.fuck.myapplication.R;
import com.example.fuck.myapplication.model.bean.ContentModel;
import com.example.fuck.myapplication.model.bean.MusicMedia;
import com.example.fuck.myapplication.view.adapter.ContentAdapter;
import com.example.fuck.myapplication.view.fragment.Fragment_mine;
import com.example.fuck.myapplication.view.fragment.Fragment_new;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends BaseActivity {

    private ImageButton gongneng;
    private ImageButton sousuo;
    private RadioGroup group;
    private ViewPager pager;
    private RadioButton news;
    private RadioButton mine;
    private RelativeLayout relativeLayout;
    private DrawerLayout drawerLayout;
    ArrayList<ContentModel> list;
    private static int currentposition = -1;
    public static ArrayList<MusicMedia> musicList = null;
    private int
            theme= R.style.AppTheme;
    private TextView textView1;
    private ImageView imageView1;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState !=null)
        {
            theme= savedInstanceState.getInt("theme");
            setTheme(theme);
        }

    }

    protected void initData() {

        textView = (TextView)findViewById(R.id.musicinfo);
        gongneng = findViewById(R.id.gongneng);
        sousuo = findViewById(R.id.sousuo);
        group = findViewById(R.id.group);
        pager = findViewById(R.id.pager);
        news = findViewById(R.id.news);
        mine = findViewById(R.id.mine);
        drawerLayout = findViewById(R.id.drawerlayout);

        relativeLayout = findViewById(R.id.left);
        sousuo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, SousuoActivity.class);
                startActivity(intent);
            }
        });
        gongneng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (! drawerLayout.isDrawerOpen(relativeLayout)){
                    //就打开
                    drawerLayout.openDrawer(relativeLayout);
                }
            }
        });
        final ListView listView = (ListView) findViewById(R.id.left_listview);



        list = new ArrayList<ContentModel>();

        list.add(new ContentModel(R.drawable.gz, "功能设置", 1));
        list.add(new ContentModel(R.drawable.hd, "夜间模式", 2));
        list.add(new ContentModel(R.drawable.kh, "定时停止播放", 3));
        list.add(new ContentModel(R.drawable.lljl, "退出应用", 4));
        list.add(new ContentModel(R.drawable.mydd, "关于波尼音乐", 5));
        ContentAdapter adapter = new ContentAdapter(this, list);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch ((int) id) {
                    case 1:
                        Intent intent = new Intent(SecondActivity.this, Main2Activity.class);
                             startActivity(intent);
                        break;
                    case 2:
                        theme= (theme==
                                R.style.AppTheme) ? R.style.NightAppTheme:
                                R.style.AppTheme;

                        recreate();
                        break;

                    default:
                        break;
                }

                drawerLayout.closeDrawer(Gravity.LEFT);
            }
        });
        listView.setAdapter(adapter);
        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            public void onCheckedChanged(RadioGroup radioGroup, int i) {//fragment滑动
                switch (i){
                    case R.id.mine:
                        pager.setCurrentItem(0,false);
                        break;
                    case R.id.news:
                        pager.setCurrentItem(1,false);
                        break;

                }
            }
        });
//        tablayout.setupWithViewPager(viewPager);
        pager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {//viewpager点击

            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }


            public void onPageSelected(int position) {
                group.check(group.getChildAt(position).getId());
            }


            public void onPageScrollStateChanged(int state) {

            }
        });
        pager.setAdapter(new FragmentPagerAdapter(this.getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                Fragment fragment=null;
                switch (position){
                    case 0:
                        fragment=new Fragment_mine();
                        break;
                    case 1:fragment=new Fragment_new();
                        break;

                }
                return fragment;
            }


            public int getCount() {
                return 2;
            }
        });
    }

    @Override
    protected void initView() {


    }

    @Override
    int setContentViewId() {
        return R.layout.activity_second;
    }
    protected void
    onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("theme",theme);
    }


    //取
    @Override
    protected void
    onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        theme= savedInstanceState.getInt("theme");
    }
}
