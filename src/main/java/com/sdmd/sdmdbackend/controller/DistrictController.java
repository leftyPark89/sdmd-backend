package com.sdmd.sdmdbackend.controller;

import com.sdmd.sdmdbackend.dto.DistrictResponseDto;
import com.sdmd.sdmdbackend.service.DistrictService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/districts")
public class DistrictController {

    private final DistrictService districtService;

    public List<DistrictResponseDto> getAllDistrict() {
        System.out.println(districtService.getAllDistricts());
        return districtService.getAllDistricts();
    }
}
