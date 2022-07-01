package org.example;

public class UserLocal {
    private String login = "admin";
    private String password = "qwerty";

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void createQuery(String login, String password) {
        class Query {
            public void printToLog(String login, String password) {
                System.out.println("User with login \"" + login + "\" and password \"" + password + "\" sent a request");
            }
        }

        Query query = new Query();
        query.printToLog(login, password);
    }
}
