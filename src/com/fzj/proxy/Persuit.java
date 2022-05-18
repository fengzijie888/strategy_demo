package com.fzj.proxy;

public class Persuit implements GiveGift{

    SchoolGirl schoolGirl;

    public Persuit(SchoolGirl schoolGirl) {
        this.schoolGirl = schoolGirl;
    }

    @Override
    public void giveDolls() {
        System.out.println("fzj送娃娃给zqr~~~~~");
    }

    @Override
    public void giveFlowers() {
        System.out.println("fzj送花给zqr~~~~~");
    }

    @Override
    public void giveRings() {
        System.out.println("fzj送戒指给zqr~~~~~~~~~");
    }
}
