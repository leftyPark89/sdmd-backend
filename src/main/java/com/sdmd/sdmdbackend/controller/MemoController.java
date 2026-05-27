package com.sdmd.sdmdbackend.controller;

import com.sdmd.sdmdbackend.dto.MemoRequestDto;
import com.sdmd.sdmdbackend.dto.MemoResponseDto;
import com.sdmd.sdmdbackend.entity.Memo;
import com.sdmd.sdmdbackend.service.MemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/memo")
public class MemoController {
    // 커밋용 주석
    private final MemoService service;

    // 등록
    @PostMapping
    public void save(@RequestBody MemoRequestDto dto) {
        service.save(dto);
    }

    // 수정
    @PutMapping("/{districtId}")
    public void updateMemo(@PathVariable int districtId, @RequestBody MemoRequestDto dto) {
        service.update(districtId, dto);
    }

    // 삭제
    @DeleteMapping("/{districtId}")
    public void deleteMemo(@PathVariable int districtId) {
        service.delete(districtId);
    }

    // 조회
    @GetMapping("/{districtId}")
    public MemoResponseDto getMemo(@PathVariable int districtId) {
        return service.getFindId(districtId);
    }
}
