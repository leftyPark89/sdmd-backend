package com.sdmd.sdmdbackend.mapper;

import com.sdmd.sdmdbackend.dto.TestDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface TestMapper {
    List<TestDto> findAll();
}
