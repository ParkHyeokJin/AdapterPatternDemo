package com.example.adapterpatterndemo.Domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Member {
    private String id;
    private String password;
    private String token;
}
