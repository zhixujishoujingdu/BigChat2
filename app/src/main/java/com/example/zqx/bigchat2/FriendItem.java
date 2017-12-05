package com.example.zqx.bigchat2;

/**
 * Created by Zqx on 2017/12/2.
 */

public class FriendItem {
    private String name;
    private int imageId;
    public FriendItem(String name, int imageId){
        this.name=name;
        this.imageId=imageId;
    }
    public String getName( ){
        return name;
    }
    public int getImageId(){
        return imageId;
    }
}
