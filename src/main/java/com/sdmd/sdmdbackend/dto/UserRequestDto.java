package com.sdmd.sdmdbackend.dto;

import lombok.Data;

@Data
public class UserRequestDto {
    private String nickname;
    private String email;
    private String password;
    private String loginType;
}
