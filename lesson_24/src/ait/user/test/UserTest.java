package ait.user.test;

import ait.user.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private User user;
    private String email = "john@gmail.com";
    private String password = "1234";
    @BeforeEach
    void setUp() {
        user = new User(email, password);
    }

    @Test
    void testValidEmail(){
        String validEmail = "john@dmx.de";
        user.setEmail(validEmail);
        assertEquals(validEmail, user.getEmail());
    }

    @Test
    void testEmailWithoutAt(){
        String invalidEmail = "john.dmx.de";
        user.setEmail(invalidEmail);
        assertEquals(email,user.getEmail());
    }

    void testValidPassword(){
        String validPassword = "qwertY1@";
        user.setPassword(validPassword);
        assertEquals(validPassword, user.getPassword());

        }
    void testPasswordLength() {
        String invalidPassword = "wertY1@";
        user.setPassword(invalidPassword);
        assertEquals(password, user.getPassword());
    }

    void testPasswordLowercase() {
        String invalidPassword = "QWERTY1@";
        user.setPassword(invalidPassword);
        assertEquals(password, user.getPassword());
    }

    void testPasswordUppercase() {
        String invalidPassword = "qwertY1@";
        user.setPassword(invalidPassword);
        assertEquals(password, user.getPassword());
    }

    void testPasswordDigits() {
        String invalidPassword = "qwertYz@";
        user.setPassword(invalidPassword);
        assertEquals(password, user.getPassword());
    }
    void testPasswordSpecialSymbols() {
        String invalidPassword = "qwertY12";
        user.setPassword(invalidPassword);
        assertEquals(password, user.getPassword());
    }
}