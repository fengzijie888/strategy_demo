package com.fzj.simplefactory;

import com.fzj.simplefactory.operation.Operation;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        boolean isNext = true;
        String numberA;
        String numberB;
        double result = 0;
        Scanner scanner;
        while (isNext) {
            scanner = new Scanner(System.in);
            System.out.println("欢迎进入计算器服务系统");
            System.out.println("请输入一个字数");
            numberA = scanner.next();
            System.out.println("请输入一个运算符");
            String oper = scanner.next();
            System.out.println("请输入一个字数");
            numberB = scanner.next();
            Operation operation = OperationFactory.createOperation(oper);
            operation.a = Double.parseDouble(numberA);
            operation.b = Double.parseDouble(numberB);
            result = operation.getResult();
            System.out.println("结果为：" + result + ",继续计算请按true，退出请按false");
            isNext = scanner.nextBoolean();
        }



    }

}
