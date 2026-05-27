package com.sdmd.sdmdbackend.mapper;

import com.sdmd.sdmdbackend.dto.MemoRequestDto;
import com.sdmd.sdmdbackend.dto.MemoResponseDto;
import com.sdmd.sdmdbackend.entity.Memo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MemoMapper {

    void insertMemo(MemoRequestDto dto);

    void deleteMemo(int districtId);

    void updateMemo(@Param("districtId") int districtId,
                    @Param("dto") MemoRequestDto dto);

    MemoResponseDto selectFindId(int districtId);
}
