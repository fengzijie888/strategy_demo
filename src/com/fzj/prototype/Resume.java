package com.fzj.prototype;

public class Resume implements Cloneable{

    private String sex;

    private String name;

    private int age;

    private String timeArea;

    private String company;


    public Resume(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setPersonInfo(String name,int age,String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void display(){
        System.out.println("姓名：" + name + "，年龄：" + age + "，性别：" + sex);
        System.out.println("工作经历：" + company + "，" + timeArea);
    }

    public void setWorkExperience(String company,String timeArea){
        this.company = company;
        this.timeArea = timeArea;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
