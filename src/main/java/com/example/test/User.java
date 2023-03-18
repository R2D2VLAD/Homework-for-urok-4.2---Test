package com.example.test;

import lombok.Data;

@Data
public class User {
    private String login;
    private String email;

    public User() {
    }

    public User(String login, String email) {
        this.login = login;
        this.email = userEmail(email);
    }
    public String userEmail(String email) {
        if (!email.contains("@") && !email.contains(".")) {
            throw new IllegalArgumentException ("В параметрах запроса отсутсвует знак @ или .");
        }
        if (login.equals(email)) {
            throw new IllegalArgumentException("Поля E-mail и Логин совподают!");
        } else {
            return email;
        }
    }

    public String getLogin() {
        return login;
    }
    public String getEmail() {
        return email;
    }
}
