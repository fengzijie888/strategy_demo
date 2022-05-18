package com.fzj.statemode;

public class SleepingState extends State {
    @Override
    public void writeprogram(Work work) {
        System.out.println("现在时间为：" + work.getHour() + "加班快要睡着了~~~~~~") ;
    }
}
