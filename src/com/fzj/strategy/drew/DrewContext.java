package com.fzj.strategy.drew;

public class DrewContext {

    DrewSuper drewSuper;

    public DrewContext(String type) {

        switch (type){

            case "t":
                drewSuper = new DrewTShirt();
                break;
            case "h":
                drewSuper = new DrewHoodie();
                break;

        }
    }

    public String getWhat(String goods){
        return drewSuper.getWhat(goods);
    }
}
