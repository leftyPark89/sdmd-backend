package com.sdmd.sdmdbackend.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MemoRequestDto {
    private Long districtId;
    private String content;
}
