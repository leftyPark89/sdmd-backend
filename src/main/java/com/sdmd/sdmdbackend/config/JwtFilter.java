package com.sdmd.sdmdbackend.config;

import com.sdmd.sdmdbackend.util.JwtUtil;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Collections;

public class JwtFilter extends OncePerRequestFilter {

    private final JwtUtil jwtUtil;

    public JwtFilter(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain)
            throws ServletException, IOException {

        // 1. Header에서 토큰 꺼내기
        String authHeader = request.getHeader("Authorization");

        if (authHeader != null && authHeader.startsWith("Bearer ")) {

            // 2. "Bearer " 제거하고 순수 토큰만 추출
            String token = authHeader.substring(7);

            // 3. 토큰 유효성 검증
            if (jwtUtil.validateToken(token)) {

                // 4. 토큰에서 userId 꺼내기
                Long userId = jwtUtil.getUserId(token);

                // 5. Spring Security에 인증 정보 등록
                UsernamePasswordAuthenticationToken authentication =
                        new UsernamePasswordAuthenticationToken(
                                userId, null, Collections.emptyList());

                SecurityContextHolder.getContext()
                        .setAuthentication(authentication);
            }
        }

        // 6. 다음 필터로 넘기기
        filterChain.doFilter(request, response);
    }
}
