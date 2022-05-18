package com.fzj.strategy;

public class CashDiscount extends CashSuper{

    private double moneyDiscount;

    public CashDiscount(String discount){

        this.moneyDiscount = Double.parseDouble(discount);

    }

    @Override
    public double acceptMoney(double money) {
        return money * moneyDiscount;
    }
}
