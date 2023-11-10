package com.example.adapterpatterndemo.service;

import com.example.adapterpatterndemo.Domain.Member;

public class AuthServiceImpl implements AuthService{
    private static final String password = "1234";

    @Override
    public boolean isAuth(Member member) {
        return password.equals(member.getPassword());
    }
}
