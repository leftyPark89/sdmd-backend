package com.sdmd.sdmdbackend.mapper;

import com.sdmd.sdmdbackend.dto.LikesRequestDto;
import com.sdmd.sdmdbackend.dto.LikesResponseDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LikesMapper {

    // 목록
    List<LikesResponseDto> selectLikeList();

    // 추가
    void insertLikes(LikesRequestDto dto);

    // 삭제
    void deleteLike(long dto);

}
