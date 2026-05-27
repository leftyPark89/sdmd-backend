package com.sdmd.sdmdbackend.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class LikesRequestDto {
    private Long userId;
    private Long districtId;
}
