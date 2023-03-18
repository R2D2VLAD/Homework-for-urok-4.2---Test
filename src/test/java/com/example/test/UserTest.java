package com.example.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserTest {
    public static final String LOGIN = "VLADIK";
    public static final String EMAIL = "zitarvlad11@gmail.com";
    public static final String LOGIN_NULL = " ";
    public static final String EMAIL_NULL = " ";
    public static final String EMAIL_WITHOUT_A_SYMBOL = "zitarvlad11gmailcom";

    @Test
    void mustReturnTheDataWhenCreatingTheObject() {
        User result = new User(LOGIN, EMAIL);
        Assertions.assertNotNull(result);
    }

    @Test
    void mustReturnAnObjectWithoutParameters() {
        User result = new User();
        Assertions.assertNotNull(result);
    }

    @Test
    void mustReturnTheCorrectEmailWithAllTheCharacters() {
        User result = new User(LOGIN, EMAIL);
        Assertions.assertTrue(result.getEmail().contains("@")
                && result.getEmail().contains("."));
    }

    @Test
    void mustReturnTheUsernameAndEmailInequality() {
        User result = new User(LOGIN, EMAIL);
        Assertions.assertNotEquals(result.getLogin(), result.getEmail());
    }
}
