package com.sdmd.sdmdbackend.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class LikesResponseDto {
    private Long id;
    private Long userId;
    private Long districtId;
    private String guName;
    private String dongName;
    private int hospitalCount;
    private int martCount;
    private int subwayCount;
    private int strongCrimeCount;
    private int theftCrimeCount;
    private int assaultCrimeCount;
    private LocalDateTime createdAt;

    public int getTotalCrime() {
        return strongCrimeCount + theftCrimeCount + assaultCrimeCount;
    }


}
