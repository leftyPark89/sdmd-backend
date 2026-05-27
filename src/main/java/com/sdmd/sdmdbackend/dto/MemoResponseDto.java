package com.sdmd.sdmdbackend.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MemoResponseDto {
    private Long id;
    private Long userId;
    private Long districtId;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
