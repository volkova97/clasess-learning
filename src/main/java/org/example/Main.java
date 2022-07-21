package org.example;

public class Main {
    public static void main(String[] args) {
        //first part of task - inner class
        UserInner userInner = new UserInner();

        userInner.createQuery(userInner.getLogin(), userInner.getPassword());

        userInner.new Query().printToLog(userInner.getLogin(), userInner.getPassword());

        UserInner.Query query = new UserInner().new Query();
        query.printToLog(userInner.getLogin(), userInner.getPassword());

        //second part of task - method local inner class

        UserLocal userLocal = new UserLocal();
        userLocal.createQuery(userLocal.getLogin(), userLocal.getPassword());

        //third part of task

        Printable printable = new Printable() {
            @Override
            public void print(String login, String password) {
                System.out.println("User with login \"" + userInner.getLogin() + "\" and password \"" +
                        userInner.getPassword() + "\" sent a request");
            }
        };

        printable.print(userLocal.getLogin(), userLocal.getPassword());

        //through lambda

        Printable printableLambda = (login, password) -> System.out.println(
                "User with login \"" + userInner.getLogin() + "\" and password \"" +
                userInner.getPassword() + "\" sent a request");

        printableLambda.print(userLocal.getLogin(), userLocal.getPassword());

        //fourth part of task

        UserInner.QueryStatic queryStatic = new UserInner.QueryStatic();
        queryStatic.printToLog(userLocal.getLogin(), userLocal.getPassword());
    }
}