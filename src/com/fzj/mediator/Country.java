package com.fzj.mediator;

abstract class Country {


    protected UnitedNations mediator;

    //用来初始化时定义使用哪个中介者
    public Country(UnitedNations m){
        mediator = m;
    }


}
