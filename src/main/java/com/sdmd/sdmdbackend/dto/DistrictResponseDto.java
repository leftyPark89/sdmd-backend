package com.sdmd.sdmdbackend.dto;

import lombok.Data;

@Data
public class DistrictResponseDto {
    private Long id;
    private String guName;
    private String guCode;
    private int hospitalCount;
    private int martCount;
    private int subwayCount;
    private int strongCrimeCount;
    private int theftCrimeCount;
    private int assaultCrimeCount;
    private Double lat;
    private Double lng;
    private boolean isLiked;
}
