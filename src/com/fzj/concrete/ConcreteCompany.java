package com.fzj.concrete;

import java.util.ArrayList;
import java.util.List;

//总部的操作
public class ConcreteCompany extends Company{


    //子公司的操作列表
    private List<Company> children = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        children.add(company);
    }

    @Override
    public void remove(Company company) {
        children.remove(company);
    }

    @Override
    public void display(int num) {
        for (int i = num; i > 0; i--) {
            System.out.print("-");
        }
        System.out.println(name);
        for (Company child : children) {
            child.display(num+2);
        }
    }

    @Override
    public void lineOfDuty() {
        for (Company child : children) {
            child.lineOfDuty();
        }
    }
}
