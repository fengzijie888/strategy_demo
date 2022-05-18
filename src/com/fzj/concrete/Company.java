package com.fzj.concrete;

abstract class Company {

    //公司名字
    protected String name;

    public Company(String name) {
        this.name = name;
    }

    public abstract void add(Company company);

    public abstract void remove(Company company);

    public abstract void display(int num);

    public abstract void lineOfDuty();
}
