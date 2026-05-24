package com.sdmd.sdmdbackend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UserRequestDto {
    private String nickname;
    private String email;
    private String password;
    private String loginType;
}
