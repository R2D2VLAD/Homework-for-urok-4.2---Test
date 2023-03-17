package com.example.test;

import lombok.Data;

@Data
public class User {
    private String login;
    private String email;

    public User(String login, String email) {
        this.login = login;
        this.email = email;
    }
    public String userEmail(String email) {
        if (email.contains("@") && email.contains(".")) {
            return email;
        } else {
            throw new IllegalArgumentException ("В параметрах запроса отсутсвует знак @ или .");
        }
    }

    public boolean equalsParameters(String login, String email) {
        if (login.equals(email)) {
            return false;
        } else {
            return true;
        }
    }

    public String getLogin() {
        return login;
    }
    public String getEmail() {
        return email;
    }
}
