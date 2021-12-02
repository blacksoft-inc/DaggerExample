package com.blacksoft.daggerexample.dagger.models.Shoes;

import javax.inject.Inject;

import lombok.Getter;
import lombok.Setter;

public class AdidasShoes implements Shoes{
    @Getter
    @Setter
    private String brand;
    @Getter
    @Setter
    private short size;

    @Inject
    public AdidasShoes() {
        this.brand = brand;
        this.size = size;
    }
}
