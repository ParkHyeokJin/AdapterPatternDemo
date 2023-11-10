package com.example.adapterpatterndemo.service;

import com.example.adapterpatterndemo.Domain.Member;

public interface AuthService {
    boolean isAuth(Member member);
}
