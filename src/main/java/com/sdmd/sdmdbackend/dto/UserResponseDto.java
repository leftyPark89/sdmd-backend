package com.sdmd.sdmdbackend.dto;

import lombok.Data;

@Data
public class UserResponseDto {
    private Long id;
    private String nickname;
    private String email;
    private String loginType;
}
