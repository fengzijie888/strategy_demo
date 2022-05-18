package com.fzj.concrete;

public class FinanceDepartment extends Company{
    public FinanceDepartment(String name) {
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
        System.out.println(name);
        System.out.println();
    }

    @Override
    public void lineOfDuty() {
        System.out.println("财务部进行管理~~~~~" + name);
    }
}
