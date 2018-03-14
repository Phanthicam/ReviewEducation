package com.example.revieweducation.controller;

import com.example.revieweducation.model.User;

import java.util.ArrayList;

/**
 * Created by Admin on 3/2/2018.
 */

public class UserManager {
    private static UserManager sInstance = null;

    private ArrayList<User> mUserList;


    public UserManager() {
        mUserList = new ArrayList<>();
    }
    public void  load() {
        mUserList.clear();

        mUserList.add(new User(1, "PhanThiCam","123"));
        mUserList.add(new User(2, "CaoThiAnhDao","1234"));
        mUserList.add(new User(3, "LeThiHongVan","12345"));
        mUserList.add(new User(4, "DangVanHieu","123456"));

    }
    public ArrayList<User> getUser () {
        if (mUserList.isEmpty()) {
            load();
        }
        return mUserList;
    }
    public static UserManager getsInstance () {
        if(sInstance==null) {
            sInstance = new UserManager();
        }
        return  sInstance;
    }
}
