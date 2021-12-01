package com.blacksoft.daggerexample.dagger.models;

import android.util.Log;

import javax.inject.Inject;

/**
 * @author AbdelWadoud Rasmi
 * <p>
 * this class is a ChangeRoom
 */
public class ChangeRoom {
    private static final String TAG = "ChangeRoom";

    @Inject
    public ChangeRoom(){}

    public void wear(Player player){
        Log.d(TAG, "wearing his outfit...");
    }
}