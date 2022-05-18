package com.fzj.strategy;

public class CashContext {

    //这个模型还是简单的工厂模式和策略模式的相结合
    CashSuper cashSuper;

    public CashContext(String type){

        switch (type){

            case "正常收费":
                CashNormal cashNormal = new CashNormal();
                cashSuper = cashNormal;
                break;
            case "满300-100":
                CashReturn cashReturn = new CashReturn("300","100");
                cashSuper = cashReturn;
                break;
            case "打8折":
                CashDiscount cashDiscount = new CashDiscount("0.8");
                cashSuper = cashDiscount;
                break;
        }

    }

    public double getResult(double money){

        return cashSuper.acceptMoney(money);

    }

}
