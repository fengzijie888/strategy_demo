package com.fzj.factory;

public class FactoryDemo {

//    工厂模板：就是首先定义好一个稳定的产品（即产品的特性方法）这里用接口，再创建
//    其他工厂继承这个节点稳定的产品，自己再加工（将这个方法重写或者不重写）。每个工厂
//    继承后原来的接口都有它的特性，实例化的时候实例不同的工厂，那么它加工的方法也可以使用了（
//            此时有原来产品的特性和工厂加工后的特性）
//    优点：
//    与创建者解耦，
//    符合单一原则
//    抽象工厂模式就是将这个稳定的接口与其他稳定的接口联系其他，实例化加工产品与工厂模式一致
    public static void main(String[] args) {

        IFactroy graduateFactory = new GraduateFactory();

        LeiFeng student = graduateFactory.createLeiFeng();

        student.cook();
        student.sweep();
        student.wash();

        IFactroy volunteerFactory = new VolunteerFactory();

        LeiFeng volunteer = volunteerFactory.createLeiFeng();

        volunteer.wash();
        volunteer.sweep();
        volunteer.cook();
    }



}
