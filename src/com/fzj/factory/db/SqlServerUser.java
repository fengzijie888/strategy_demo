package com.fzj.factory.db;

public class SqlServerUser implements IUser{
    @Override
    public void insert() {
        System.out.println("User插入一条数据---sqlServer");
    }

    @Override
    public void get() {
        System.out.println("User获取一条数据---sqlServer");
    }
}
