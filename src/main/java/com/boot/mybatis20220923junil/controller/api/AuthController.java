package com.boot.mybatis20220923junil.controller.api;

import com.boot.mybatis20220923junil.domain.User;
import com.boot.mybatis20220923junil.dto.CMRespDto;
import com.boot.mybatis20220923junil.dto.SignupReqDto;
import com.boot.mybatis20220923junil.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/api/auth")
@RestController
@RequiredArgsConstructor
public class AuthController {

    private final UserRepository userRepository;

    @PostMapping("/signup")
    public ResponseEntity<?> signup(SignupReqDto signupReqDto) {

        log.info("{}", signupReqDto);

        User user = signupReqDto.toEntity();

        int result = userRepository.save(user);

        if(result == 0) {
            return ResponseEntity.internalServerError().body(new CMRespDto<>(1, "회원가입 성공", true));
        }

        return ResponseEntity.ok(new CMRespDto<>(1, "회원가입 성공", true));
    }

}
