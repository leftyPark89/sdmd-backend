package com.sdmd.sdmdbackend.service;

import com.sdmd.sdmdbackend.dto.DistrictResponseDto;
import com.sdmd.sdmdbackend.mapper.DistrictMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DistrictService {

    private final DistrictMapper districtMapper;

    public List<DistrictResponseDto> getAllDistricts() {
        return districtMapper.selectDistrictList();
    }


}
