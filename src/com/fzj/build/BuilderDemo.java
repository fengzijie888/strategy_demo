package com.fzj.build;

import java.util.Dictionary;

public class BuilderDemo {

    public static void main(String[] args) {

        ProductDirector director = new ProductDirector();
        Builder builderA = new ConcreteBuilderA();
        Builder builderB = new ConcreteBuilderB();
        director.productConstruct(builderA);
        Product result = builderA.getResult();
        result.display();


    }


}
