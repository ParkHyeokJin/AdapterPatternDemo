package com.example.adapterpatterndemo.service;

import com.example.adapterpatterndemo.Domain.Member;

public class AuthServiceAdapter implements AuthService{

    @Override
    public boolean isAuth(Member member) {
        TokenServiceImpl tokenService = new TokenServiceImpl();
        return tokenService.isAuth(member.getToken());
    }
}
