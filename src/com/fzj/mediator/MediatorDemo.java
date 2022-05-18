package com.fzj.mediator;

public class MediatorDemo {


    public static void main(String[] args) {

        UnitedNationsMediator mediator = new UnitedNationsMediator();

        USA u1= new USA(mediator);

        IRon i1 = new IRon(mediator);

        mediator.setCollege1(u1);

        mediator.setCollege2(i1);

        mediator.getCollege1().declare("我美国说，我就是无赖");

        mediator.getCollege2().declare("我伊朗说，我知道你美国人厚颜无耻，哈哈哈哈");



    }

}
