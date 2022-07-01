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

    }
}