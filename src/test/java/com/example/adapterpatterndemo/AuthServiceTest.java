package com.example.adapterpatterndemo;

import com.example.adapterpatterndemo.Domain.Member;
import com.example.adapterpatterndemo.service.AuthService;
import com.example.adapterpatterndemo.service.AuthServiceAdapter;
import com.example.adapterpatterndemo.service.AuthServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AuthServiceTest {

    @Test
    @DisplayName("패스워드_인증_테스트")
    void PWD_AUTH_TEST(){
        AuthService authService = new AuthServiceImpl();
        Assertions.assertTrue(authService.isAuth(Member.builder()
                .id("TEST")
                .password("1234")
                .build())
        );
    }

    @Test
    @DisplayName("토큰_인증_테스트")
    void TOKEN_AUTH_TEST(){
        AuthService authService = new AuthServiceAdapter();
        Assertions.assertTrue(
                authService.isAuth(Member.builder()
                .token("Bearer 1234")
                .build())
        );
    }
}
