package com.fzj.build;

public class ConcreteBuilderB extends Builder{

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("AA");
    }

    @Override
    public void buildPartB() {
        product.add("BB");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
