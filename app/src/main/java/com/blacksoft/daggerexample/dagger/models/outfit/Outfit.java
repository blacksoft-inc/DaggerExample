package com.blacksoft.daggerexample.dagger.models.outfit;

import android.util.Log;

/**
 * @author AbdelWadoud Rasmi
 * <p>
 * this class is supposed to be an external library class,
 * it's used to try Modules and provider methods
 */
public class Outfit {
    Tshirt tshirt;
    Short aShort;
    private static final String TAG = "Outfit";

    public Outfit(Tshirt tshirt, Short aShort) {
        Log.d(TAG, "Outfit: created");
        this.tshirt = tshirt;
        this.aShort = aShort;
    }
}
