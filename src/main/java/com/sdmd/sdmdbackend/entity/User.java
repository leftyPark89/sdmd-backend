package com.sdmd.sdmdbackend.entity;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class User {
    private Long id;
    private String nickname;
    private String email;
    private String password;
    private String loginType;
    private LocalDateTime createdAt;
}
