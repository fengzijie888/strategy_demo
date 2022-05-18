package com.fzj.strategy;

public class CashReturn extends CashSuper{

    //满300-100，300为moneyCondition,100为moneyReturn

    private double moneyCondition;//设置满多少钱可以返利

    private double moneyReturn;//设置返利为多少

    public CashReturn(String moneyCondition,String moneyReturn){

        this.moneyCondition = Double.parseDouble(moneyCondition);

        this.moneyReturn = Double.parseDouble(moneyReturn);

    }

    @Override
    public double acceptMoney(double money) {

        double result = money;

        if (money >= moneyCondition){
            //比如700元满足300-100，700/300=2.3,向下取整就是可以-2次*100
            result = money - (Math.floor(money/moneyCondition)*moneyReturn);
        }

        return result;
    }




}
