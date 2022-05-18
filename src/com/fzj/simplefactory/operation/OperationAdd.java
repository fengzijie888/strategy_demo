package com.fzj.simplefactory.operation;

public class OperationAdd extends Operation{

    @Override
    public double getResult() {

        double result = 0;

        result = a + b;

        return result;
    }

}
