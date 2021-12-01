package com.blacksoft.daggerexample.dagger.models;

import android.util.Log;

import javax.inject.Inject;

/**
 * @author AbdelWadoud Rasmi
 * <p>
 * this class is a player class which represents a football player
 */
public class Player {
    private static final String TAG = "Player";
    //
    private String fullName;
    private double salary;
    private Shoes shoes;

    @Inject
    public Player(Shoes shoes) {
        this.shoes = shoes;
    }

    @Inject
    public void wear(ChangeRoom changeRoom) {
        changeRoom.wear(this);
    }

    //
    public void plays() {
        Log.d(TAG, "plays now !");
    }

}