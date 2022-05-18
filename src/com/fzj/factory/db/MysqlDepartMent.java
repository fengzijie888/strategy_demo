package com.fzj.factory.db;

public class MysqlDepartMent implements IDepartment{
    @Override
    public void insert() {
        System.out.println("Department ------ 插入一个条数据 ----Myslq");
    }

    @Override
    public void get() {
        System.out.println("Department ------ 获取一个条数据 ----Myslq");

    }
}
