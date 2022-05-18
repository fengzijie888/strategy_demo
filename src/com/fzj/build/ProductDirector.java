package com.fzj.build;

public class ProductDirector {


    public ProductDirector() {
    }

    public void productConstruct(Builder builder) {

        builder.buildPartA();
        builder.buildPartB();

    }
}
