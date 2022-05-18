package com.fzj.statemode;

public class RestState extends State {
    @Override
    public void writeprogram(Work work) {
        System.out.println("下班回家啦啊啊啊啊啊啊啊啊啊，时间为：" + work.getHour());
    }
}
