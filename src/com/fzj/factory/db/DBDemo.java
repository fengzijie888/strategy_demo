package com.fzj.factory.db;

public class DBDemo {

    public static void main(String[] args) throws Exception {

        IUser user = DataAccess.createUser();

        user.insert();

        user.get();

        IDepartment department = DataAccess.createDepartment();

        department.get();

        department.insert();
    }
}
