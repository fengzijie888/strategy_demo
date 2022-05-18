package com.fzj.factory.db;

public class DataAccess {

    private static String assemblyName = "com.fzj.factory.db.";

    private static String db = "Mysql";

    public static IUser createUser() throws Exception {

        String className =  assemblyName + db + "User";

        return (IUser) Class.forName(className).newInstance();

    }


    public static IDepartment createDepartment() throws Exception {

        String className =  assemblyName + db + "DepartMent";

        return (IDepartment) Class.forName(className).newInstance();

    }

}
