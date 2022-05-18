package com.fzj.statemode;

public class MorniingState extends State{
    @Override
    public void writeprogram(Work work) {

        if (work.getHour()<12){
            System.out.println("时间为："+work.getHour()+",早上写程序精神百倍");
        }else {
            work.setState(new AfternoonState());
            work.writeProgram();
        }
    }
}
