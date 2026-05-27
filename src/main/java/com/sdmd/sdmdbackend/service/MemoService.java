package com.sdmd.sdmdbackend.service;

import com.sdmd.sdmdbackend.dto.MemoRequestDto;
import com.sdmd.sdmdbackend.dto.MemoResponseDto;
import com.sdmd.sdmdbackend.entity.Memo;
import com.sdmd.sdmdbackend.mapper.MemoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemoService {

    private final MemoMapper mapper;

    public void save(MemoRequestDto dto) {
        mapper.insertMemo(dto);
    }

    public void delete(int districtId) {
        mapper.deleteMemo(districtId);
    }

    public void update(int districtId, MemoRequestDto dto) {
        mapper.updateMemo(districtId, dto);
    }

    public MemoResponseDto getFindId(int districtId) {
        return mapper.selectFindId(districtId);
    }
}
