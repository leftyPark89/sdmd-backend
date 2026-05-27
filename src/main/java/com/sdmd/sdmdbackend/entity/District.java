package com.sdmd.sdmdbackend.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class District {
    private Long id;
    private String guName;
    private String dongName;
    private String guCode;
    private int hospitalCount;
    private int martCount;
    private int subwayCount;
    private int strongCrimeCount;
    private int theftCrimeCount;
    private int assaultCrimeCount;
    private LocalDateTime updateAt;
    private Double lat;
    private Double lng;
}
