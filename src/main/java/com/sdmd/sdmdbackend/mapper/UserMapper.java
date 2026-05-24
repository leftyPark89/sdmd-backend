package com.sdmd.sdmdbackend.mapper;

import com.sdmd.sdmdbackend.dto.UserRequestDto;
import com.sdmd.sdmdbackend.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User findByEmail(String email);
    void insertUser(UserRequestDto dto);
}
