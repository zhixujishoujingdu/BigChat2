package com.example.zqx.bigchat2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Zqx on 2017/12/2.
 */

public class FriendAdapter extends ArrayAdapter<FriendItem> {
    private int resourceId;
    public FriendAdapter(Context context, int textViewResourceId, List<FriendItem> objects) {
        super(context, textViewResourceId, objects);
        resourceId=textViewResourceId;
    }
    public View getView(int position, View covertView, ViewGroup parent){
        FriendItem friend = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        ImageView friendImage=(ImageView)view.findViewById(R.id.friend_image);
        TextView friendName=(TextView)view.findViewById(R.id.friend_name);
        friendImage.setImageResource(friend.getImageId());
        friendName.setText(friend.getName());
        return view;
    }
}
