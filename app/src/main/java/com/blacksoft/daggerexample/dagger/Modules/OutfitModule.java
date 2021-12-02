package com.blacksoft.daggerexample.dagger.Modules;

import com.blacksoft.daggerexample.dagger.models.Outfit;
import com.blacksoft.daggerexample.dagger.models.Short;
import com.blacksoft.daggerexample.dagger.models.Tshirt;

import dagger.Module;
import dagger.Provides;

/**
 * @author AbdelWadoud Rasmi
 * <p>
 * this is an outfit module
 */
@Module
public class OutfitModule {

    @Provides
    static Short provideShort() {
        return new Short();
    }

    @Provides
   static Tshirt provideTshirt() {
        return new Tshirt();
    }

    @Provides
    static Outfit provideOutfit(Tshirt tshirt, Short ashort) {
        return new Outfit(tshirt, ashort);
    }

}