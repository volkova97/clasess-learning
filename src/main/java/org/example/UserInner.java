package org.example;

public class UserInner {
    private String login = "admin";
    private String password = "qwerty";

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void createQuery(String login, String password) {
        Query query = new Query();
        query.printToLog(login, password);
    }

    public class Query {
        public void printToLog(String login, String password) {
            System.out.println("User with login \"" + login + "\" and password \"" + password + "\" sent a request");
        }
    }

    public static class QueryStatic {
        public void printToLog(String login, String password) {
            System.out.println("User with login \"" + login + "\" and password \"" + password + "\" sent a request");
        }
    }
}
