package com.example.zqx.bigchat2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FriendFragment extends Fragment {
    List<FriendItem> friendList = new ArrayList<>();

    public FriendFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_friend,container,false);
        ListView listView=(ListView)view.findViewById(android.R.id.list);
        FriendAdapter adapter = new FriendAdapter(getActivity(),R.layout.item_friend,friendList);
        listView.setAdapter(adapter);
        return view;
    }
    public void initFriends() {

        FriendItem Zhao = new FriendItem("赵一", R.drawable.cat);
        friendList.add(Zhao);
        FriendItem Qian = new FriendItem("钱二", R.drawable.dark);
        friendList.add(Qian);
        FriendItem Sun = new FriendItem("孙三", R.drawable.dog);
        friendList.add(Sun);
        FriendItem Li = new FriendItem("李四", R.drawable.excuse);
        friendList.add(Li);
        FriendItem Zhou = new FriendItem("周五", R.drawable.gril);
        friendList.add(Zhou);
        FriendItem Wu = new FriendItem("吴六", R.drawable.jack);
        friendList.add(Wu);
        FriendItem Zheng = new FriendItem("郑七", R.drawable.plan);
        friendList.add(Zheng);
        FriendItem Wang = new FriendItem("王八", R.drawable.smoke);
        friendList.add(Wang);
        FriendItem He = new FriendItem("何九", R.drawable.sad);
        friendList.add(He);

    }

}
