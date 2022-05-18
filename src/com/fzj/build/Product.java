package com.fzj.build;

import java.util.ArrayList;
import java.util.List;

public class Product {


    public List<String> parts = new ArrayList<>();

    public void add(String part){
        parts.add(part);
    }

    public void display(){
        for (String part : parts) {
            System.out.println(part);
        }
    }

}
