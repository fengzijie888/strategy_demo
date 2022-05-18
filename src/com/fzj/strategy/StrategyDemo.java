package com.fzj.strategy;

import java.util.Scanner;

public class StrategyDemo {

    static int i;

    //策略模式的特点就是会写一个算法抽象类，每个算法都继承与它并重写，
    // 重写完之后编写一个Context上下文进行对这些算法管理，供给返回给客户端选择使用哪种算法

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("-------------总价格-------------");
//        String money = scanner.next();
//        System.out.println("---------请选择收费标准----------");
//        System.out.println("------------正常收费------------");
//        System.out.println("-----------满300-100------------");
//        System.out.println("-------------打8折--------------");
//        String type = scanner.next();
//        CashContext cashContext = new CashContext(type);
//        double result = cashContext.getResult(Double.parseDouble(money));
//        System.out.println(result);
        System.out.println(i);


    }

}
