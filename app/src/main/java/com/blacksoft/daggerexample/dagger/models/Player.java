package com.blacksoft.daggerexample.dagger.models;

import android.util.Log;

import com.blacksoft.daggerexample.dagger.models.Shoes.Shoes;
import com.blacksoft.daggerexample.dagger.models.outfit.Outfit;

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
    private Outfit outfit;
    private Shoes shoes;

    @Inject
    public Player(Shoes shoes, Outfit outfit) {
        this.shoes = shoes;
        this.outfit = outfit;
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