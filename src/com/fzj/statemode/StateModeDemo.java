package com.fzj.statemode;

public class StateModeDemo {

    public static void main(String[] args) {

        Work work = new Work();
        work.setHour(9);
        work.writeProgram();

        work.setHour(13);
        work.writeProgram();


        work.setHour(21);
        work.writeProgram();


        work.setHourAndFinish(22,true);
        work.writeProgram();


    }


}
