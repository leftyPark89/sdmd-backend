package com.sdmd.sdmdbackend.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MemoRequestDto {
    private Long userId; // 로그인 작업전 임시 코드
    private Long districtId;
    private String content;
}
