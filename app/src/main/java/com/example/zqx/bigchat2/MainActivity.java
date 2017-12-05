package com.example.zqx.bigchat2;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView item_talk,item_friend,item_find,item_mine;
    private ViewPager vp;
    private TalkFragment talkFragment;
    private FriendFragment friendFragment;
    private FindFragment findFragment;
    private MineFragment mineFragmen;
    private List<Fragment>mFragmentList = new ArrayList<Fragment>();
    private FragmentAdapter mFragmentAdapter;




    //String[] titles = new String[]{"聊天", "好友", "发现", "我的"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //去除工具栏
        getSupportActionBar().hide();
        initViews();

        mFragmentAdapter = new FragmentAdapter(this.getSupportFragmentManager(), mFragmentList);
        vp.setOffscreenPageLimit(4);//ViewPager的缓存为4帧
        vp.setAdapter(mFragmentAdapter);
        vp.setCurrentItem(0);//初始设置ViewPager选中第一帧
        item_talk.setTextColor(Color.parseColor("#66CDAA"));

        vp.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                //title.setText(titles[position]);
                changeTextColor(position);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void initViews() {
        item_talk=(TextView)findViewById(R.id.item_talk);
        item_friend=(TextView)findViewById(R.id.item_friend);
        item_find=(TextView)findViewById(R.id.item_find);
        item_mine=(TextView)findViewById(R.id.item_mine);

        item_talk.setOnClickListener(this);
        item_friend.setOnClickListener(this);
        item_find.setOnClickListener(this);
        item_mine.setOnClickListener(this);

        vp=(ViewPager)findViewById(R.id.main_page);
        talkFragment=new TalkFragment();
        friendFragment=new FriendFragment();
        findFragment= new FindFragment();
        mineFragmen=new MineFragment();

        mFragmentList.add(talkFragment);
        mFragmentList.add(friendFragment);
        mFragmentList.add(findFragment);
        mFragmentList.add(mineFragmen);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.item_talk:
                vp.setCurrentItem(0,true);
                break;
            case R.id.item_friend:
                vp.setCurrentItem(1,true);
                break;
            case R.id.item_find:
                vp.setCurrentItem(2,true);
                break;
            case R.id.item_mine:
                vp.setCurrentItem(3,true);
                break;
        }
    }
    /*
*由ViewPager的滑动修改底部导航Text的颜色
*/
    private void changeTextColor(int position) {
        if (position == 0) {
            item_talk.setTextColor(Color.parseColor("#66CDAA"));
            item_friend.setTextColor(Color.parseColor("#000000"));
            item_find.setTextColor(Color.parseColor("#000000"));
            item_mine.setTextColor(Color.parseColor("#000000"));
        }
        if (position == 1) {
            item_talk.setTextColor(Color.parseColor("#000000"));
            item_friend.setTextColor(Color.parseColor("#66CDAA"));
            item_find.setTextColor(Color.parseColor("#000000"));
            item_mine.setTextColor(Color.parseColor("#000000"));
        }
        if (position == 2) {
            item_talk.setTextColor(Color.parseColor("#000000"));
            item_friend.setTextColor(Color.parseColor("#000000"));
            item_find.setTextColor(Color.parseColor("#66CDAA"));
            item_mine.setTextColor(Color.parseColor("#000000"));
        }
        if (position == 3) {
            item_talk.setTextColor(Color.parseColor("#000000"));
            item_friend.setTextColor(Color.parseColor("#000000"));
            item_find.setTextColor(Color.parseColor("#000000"));
            item_mine.setTextColor(Color.parseColor("#66CDAA"));
        }
    }
}
