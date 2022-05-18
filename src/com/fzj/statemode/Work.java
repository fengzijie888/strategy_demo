package com.fzj.statemode;

public class Work {

    private State current;

    private double hour;

    public boolean finish = false;

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }


    public void setHourAndFinish(double h,boolean f){
        this.hour = h;
        this.finish = f;
    }


    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public State getCurrent() {
        return current;
    }

    public void setState(State s) {
        this.current = s;
    }

    public Work(){

        //初始化是早上写代码的状态
        current = new MorniingState();

    }


    public void writeProgram(){

        current.writeprogram(this);

    }

}
