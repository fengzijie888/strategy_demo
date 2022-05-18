package com.fzj.proxy;

public class ProxyDemo {


    public static void main(String[] args) {

        SchoolGirl schoolGirl = new SchoolGirl("zqr");

        Proxy daili = new Proxy(schoolGirl);

        daili.giveDolls();

        daili.giveFlowers();

        daili.giveRings();


    }

}
