package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProvider userDataProvider = new UserDatabaseProvider();
        UserManager userManager = new UserManager(userDataProvider);
        System.out.println(userManager.getUserInfo());

        UserDataProvider webServiceProvider = new WebServiceDataProvider();
        UserManager userManagerWithWebServices = new UserManager(webServiceProvider);
        System.out.println(userManagerWithWebServices.getUserInfo());

        UserDataProvider newDatabaseInAction = new NewDatabaseProvider();
        UserManager userManagerWithNewDatabaseInAction = new UserManager(newDatabaseInAction);
        System.out.println(userManagerWithNewDatabaseInAction.getUserInfo());
    }
}
