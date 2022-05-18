package com.fzj.statemode;

public class AfternoonState extends State {
    @Override
    public void writeprogram(Work work) {
        if (work.getHour()<17){
            System.out.println("时间为："+work.getHour()+",下午写程序无精打采");
        }else {
           work.setState(new EveningState());
           work.writeProgram();
        }
    }
}
