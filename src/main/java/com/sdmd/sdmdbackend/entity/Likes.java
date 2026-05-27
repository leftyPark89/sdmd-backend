package com.sdmd.sdmdbackend.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Likes {
    private Long id;
    private Long userId;
    private Long districtId;
    private LocalDateTime createdAt;
}
