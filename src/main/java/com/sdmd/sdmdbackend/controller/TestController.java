package com.sdmd.sdmdbackend.controller;

import com.sdmd.sdmdbackend.dto.TestDto;
import com.sdmd.sdmdbackend.mapper.TestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestMapper testMapper;

    @GetMapping("/test")
    public String test() {
        return "success";
    }

    @GetMapping("/tests")
    public List<TestDto> tests() {
        return testMapper.findAll();
    }
}
