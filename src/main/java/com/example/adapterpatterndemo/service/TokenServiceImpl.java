package com.example.adapterpatterndemo.service;

public class TokenServiceImpl {
    private static final String Token = "Bearer 1234";

    public boolean isAuth(String token) {
        return Token.equals(token);
    }
}
