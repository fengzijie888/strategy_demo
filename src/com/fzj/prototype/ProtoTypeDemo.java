package com.fzj.prototype;

public class ProtoTypeDemo {


    public static void main(String[] args) throws CloneNotSupportedException {

        Resume a = new Resume("冯梓杰",21);
        a.setPersonInfo("冯梓杰",21,"男");
        a.setWorkExperience("阿里巴巴","2020-2021");
        a.display();

        System.out.println();

        Resume b = (Resume) a.clone();
        b.setWorkExperience("华为","2021-2022");
        b.display();
    }

}
