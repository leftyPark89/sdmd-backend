package com.sdmd.sdmdbackend.service;

import com.sdmd.sdmdbackend.dto.LikesResponseDto;
import com.sdmd.sdmdbackend.mapper.LikesMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LikesService {

    private final LikesMapper mapper;

    public List<LikesResponseDto> getAllList() {
        return mapper.selectLikeList();
    }
}
