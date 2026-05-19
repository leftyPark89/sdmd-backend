package com.sdmd.sdmdbackend.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Memo {
    private Long id;
    private Long userId;
    private Long districtId;
    private String content;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
}
