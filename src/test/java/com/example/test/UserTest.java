package com.example.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserTest {
    public static final String LOGIN = "VLADIK";
    public static final String EMAIL = "zitarvlad11@gmail.com";
    public static final String LOGIN_NULL = " ";
    public static final String EMAIL_NULL = " ";
    public static final String EMAIL_WITHOUT_A_SYMBOL = "zitarvlad11gmailcom";
    User user = new User(LOGIN, EMAIL);
    User user2 = new User(LOGIN_NULL, EMAIL_NULL);
    User user3 = new User(LOGIN, EMAIL_WITHOUT_A_SYMBOL);

    @Test
    void MustReturnTheDataWhenCreatingTheObject() {
        String userLogin = user.getLogin();
        String userEmail = user.getEmail();
        Assertions.assertEquals(LOGIN, userLogin);
        Assertions.assertEquals(EMAIL, userEmail);
    }

    @Test
    void MustReturnAnObjectWithoutParameters() {
        String userLogin = user2.getLogin();
        String userEmail = user2.getEmail();
        Assertions.assertEquals(LOGIN_NULL, userLogin);
        Assertions.assertEquals(EMAIL_NULL, userEmail);
    }

    @Test
    void MustReturnTheCorrectEmailWithAllTheCharacters() {
        String userLogin = user3.getLogin();
        String userEmail = user3.userEmail(EMAIL);
        Assertions.assertEquals(LOGIN, userLogin);
        Assertions.assertEquals(EMAIL, userEmail);
    }

    @Test
    void mustReturnTheUsernameAndEmailInequality() {
        String userLogin = user.getLogin();
        String userEmail = user.getEmail();
        Assertions.assertEquals(userLogin.equals(userEmail), user.equalsParameters(LOGIN,EMAIL));
    }
}
