package com.fzj.concrete;

public class CompanyDemo {


    public static void main(String[] args) {


        ConcreteCompany root = new ConcreteCompany("广州总公司");
        root.add(new HRDepartment("广州人力资源分公司"));
        root.add(new FinanceDepartment("广州财政部分公司"));

        ConcreteCompany cmp = new ConcreteCompany("广州南沙分公司");
        cmp.add(new HRDepartment("广州南沙人力分公司"));
        cmp.add(new FinanceDepartment("广州南沙财政分公司"));
        root.add(cmp);

        ConcreteCompany cmp2 = new ConcreteCompany("广州南沙东涌办事处");
        cmp2.add(new HRDepartment("广州南沙东涌HR办事处"));
        cmp2.add(new FinanceDepartment("广州南沙东涌财政办事处"));
        cmp.add(cmp2);

        root.display(1);


        System.out.println("---------------duty-------------------");

        root.lineOfDuty();

   }
}
