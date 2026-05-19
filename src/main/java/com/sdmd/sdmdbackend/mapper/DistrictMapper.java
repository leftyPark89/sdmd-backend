package com.sdmd.sdmdbackend.mapper;

import com.sdmd.sdmdbackend.dto.DistrictResponseDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DistrictMapper {
    List<DistrictResponseDto> selectDistrictList();
}
