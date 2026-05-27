package com.sdmd.sdmdbackend.controller;

import com.sdmd.sdmdbackend.dto.LikesRequestDto;
import com.sdmd.sdmdbackend.dto.LikesResponseDto;
import com.sdmd.sdmdbackend.service.LikesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/likes")
public class LikesController {

    private final LikesService service;

    // 좋아요 목록 <로그인 필요>
    @GetMapping("/list")
    public List<LikesResponseDto> getLikeList() {
        return service.getLikeList();
    }

    // 좋아요 등록
    @PostMapping
    public void selectLike(@RequestBody LikesRequestDto dto) {
        service.addLike(dto);
    }

    // 좋아요 삭제
    @DeleteMapping("/{districtId}")
    public void deleteLike(@PathVariable long districtId) {
        service.deleteLike(districtId);
    }
}
