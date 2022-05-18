package com.fzj.templatemethod;

public class TemplateMethodDemo {

    public static void main(String[] args) {

        TestPaper paperA = new PaperA();
        paperA.question1();
        paperA.question2();

        TestPaper paperB = new PaperB();
        paperB.question1();
        paperB.question2();
    }



}
