package com.fzj.statemode;


public class EveningState extends State {

    @Override
    public void writeprogram(Work work) {

        if (work.isFinish())
        {
            work.setState(new RestState());
            work.writeProgram();
        }else {

            if (work.getHour()<21){
                System.out.println("时间为："+work.getHour()+",加班加班，很烦很烦");
            }else {
                work.setState(new SleepingState());
                work.writeProgram();
            }

        }


    }
}
