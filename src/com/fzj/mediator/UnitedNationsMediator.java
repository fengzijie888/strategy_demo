package com.fzj.mediator;

public class UnitedNationsMediator extends UnitedNations{

    private USA college1;

    private IRon college2;

    public USA getCollege1() {
        return college1;
    }

    public void setCollege1(USA college1) {
        this.college1 = college1;
    }

    public IRon getCollege2() {
        return college2;
    }

    public void setCollege2(IRon college2) {
        this.college2 = college2;
    }

    @Override
    public void declare(String message, Country college) {

        if (college == college1){

            college2.getMessage(message);

        }else {

            college1.getMessage(message);

        }



    }
}
