package com.fzj.factory;

public class Graduate extends LeiFeng{

    @Override
    public void sweep() {
        System.out.println("学生打扫卫生~~~~~");
    }

    @Override
    public void wash() {
        System.out.println("学生洗衣服~~~~");
    }

    @Override
    public void cook() {
        System.out.println("学生煮饭~~~~");
    }
}
