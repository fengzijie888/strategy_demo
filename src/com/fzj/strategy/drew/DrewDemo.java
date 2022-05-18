package com.fzj.strategy.drew;

import java.util.Scanner;

public class DrewDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();
        DrewContext drewContext = new DrewContext(type);
        System.out.println(drewContext.getWhat("t"));

    }
}
