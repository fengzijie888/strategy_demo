package com.fzj.build;

public class ConcreteBuilderA extends Builder{

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("A");
    }

    @Override
    public void buildPartB() {
        product.add("B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
