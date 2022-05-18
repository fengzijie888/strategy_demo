package com.fzj.mediator;

public class IRon extends Country{

    public IRon(UnitedNations m) {
        super(m);
    }

    public void declare(String message){

        mediator.declare(message,this);

    }

    public void getMessage(String message){

        System.out.println("伊朗收到对方信息：" + message);

    }

}
