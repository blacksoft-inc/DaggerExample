package com.blacksoft.daggerexample.dagger.Modules;

import com.blacksoft.daggerexample.dagger.models.Shoes.AdidasShoes;
import com.blacksoft.daggerexample.dagger.models.Shoes.NikeShoes;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class NikeModule {

    @Binds
    abstract NikeShoes bindAdidasShoes(NikeShoes nikeShoes);
}
