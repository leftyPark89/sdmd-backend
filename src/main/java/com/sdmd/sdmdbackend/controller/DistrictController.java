package com.sdmd.sdmdbackend.controller;

import com.sdmd.sdmdbackend.dto.DistrictResponseDto;
import com.sdmd.sdmdbackend.service.DistrictService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/districts")
public class DistrictController {

    private final DistrictService districtService;

    @GetMapping("")
    public List<DistrictResponseDto> getAllDistrict() {
        System.out.println(districtService.getAllDistricts());
        return districtService.getAllDistricts();
    }

    @GetMapping("/{id}")
    public DistrictResponseDto getDistrictById(@PathVariable long id) {
        return districtService.getDistrictById(id);
    }

}
