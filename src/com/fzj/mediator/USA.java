package com.fzj.mediator;

public class USA extends Country{

    //设置涌哪一个中介者
    public USA(UnitedNations mediator) {
        super(mediator);
    }

    public void declare(String message){

        //发送什么信息
        mediator.declare(message,this);

    }

    public void getMessage(String message){

        System.out.println("美国收到消息：" + message);

    }

}
