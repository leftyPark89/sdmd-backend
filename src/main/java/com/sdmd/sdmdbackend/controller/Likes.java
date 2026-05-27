package com.sdmd.sdmdbackend.controller;

import com.sdmd.sdmdbackend.dto.LikesResponseDto;
import com.sdmd.sdmdbackend.service.LikesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/likes")
public class Likes {

    // 사용자 > 지역 좋아요
    private final LikesService service;

    // 좋아요 목록 <로그인 필요>
    @GetMapping("/list")
    public List<LikesResponseDto> getAllLikes() {
        return service.getAllList();
    }

    // 좋아요 등록

    // 좋아요 삭제
}
