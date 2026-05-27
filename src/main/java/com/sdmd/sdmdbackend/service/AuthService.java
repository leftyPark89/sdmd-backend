package com.sdmd.sdmdbackend.service;

import com.sdmd.sdmdbackend.dto.UserRequestDto;
import com.sdmd.sdmdbackend.entity.User;
import com.sdmd.sdmdbackend.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;


    public void signup(UserRequestDto dto) {

        // 이메일 중복 확인
        User isEmail = userMapper.findByEmail(dto.getEmail());
        if(isEmail != null) {
            throw new RuntimeException("이미 가입된 이메일입니다");
        }
        System.out.println("isEmail: " + isEmail);


        // 비밀번호 암호화
        String encodedPassword = passwordEncoder.encode(dto.getPassword());
        dto.setPassword(encodedPassword);
        //DB 저장
        userMapper.insertUser(dto);
    }
}
