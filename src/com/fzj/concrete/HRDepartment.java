package com.fzj.concrete;

public class HRDepartment extends Company{

    public HRDepartment(String name) {
        super(name);

    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int num) {

        for (int i = 0; i < num; i++) {
            System.out.print("-");
        }
        System.out.print(this.name);
        System.out.println();

    }

    @Override
    public void lineOfDuty() {
        System.out.println("HR招聘管理~~~~" + name);
    }
}
