package com.sdmd.sdmdbackend.service;

import com.sdmd.sdmdbackend.dto.UserRequestDto;
import com.sdmd.sdmdbackend.entity.User;
import com.sdmd.sdmdbackend.mapper.UserMapper;
import com.sdmd.sdmdbackend.util.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;


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

    // 로그인
    public String login(UserRequestDto dto) {

        // 1.이메일로 유저 조회
        User user = userMapper.findByEmail(dto.getEmail());
        if (user == null) {
            throw new RuntimeException("존재하지 않는 이메일입니다.");
        }

        // 2. 비밀번호 확인
        if (!passwordEncoder.matches(dto.getPassword(), user.getPassword())) {
            throw new RuntimeException("비밀번호가 틀렸습니다.");
        }

        // 3. 토큰 발급
        return jwtUtil.generateToken(user.getId(), user.getEmail());

    }

}
