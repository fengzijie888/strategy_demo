package com.fzj.strategy;

public class CashNormal extends CashSuper{
    @Override
    public double acceptMoney(double money) {
        return money;
    }
}
