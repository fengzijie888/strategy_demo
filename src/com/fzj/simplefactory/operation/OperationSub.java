package com.fzj.simplefactory.operation;

public class OperationSub extends Operation{


    @Override
    public double getResult() {

        double result = 0;

        result = a - b;

        return result;
    }
}
