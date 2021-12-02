package com.blacksoft.daggerexample.dagger.Modules;

import com.blacksoft.daggerexample.dagger.models.Shoes.AdidasShoes;

import dagger.Module;
import dagger.Provides;

@Module
public class AdidasModule {

    @Provides
    AdidasShoes provideAdidasShoes(AdidasShoes adidasShoes) {
        return adidasShoes;
    }
}
