package com.fastcampus.swagger.controller;

import com.fastcampus.swagger.dto.*;
import com.fastcampus.swagger.global.response.ResponseDTO;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;

@Api(tags = "회원정보 서비스")
//@RestController
public class MemberController {
    @Operation(summary = "회원가입 (토큰 X)", description = "정보를 입력받아 회원가입을 진행 및 DB에 저장")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "이미 존재하는 회원"),
            @ApiResponse(responseCode = "401", description = "탈퇴한 회원"),
            @ApiResponse(responseCode = "404", description = "잘못된 접근"),
            @ApiResponse(responseCode = "500", description = "회원가입 실패 서버에러")
    })
    @PostMapping("/api/signup")
    public ResponseDTO<?> signUp(@RequestBody SignupReqDTO signupReqDTO) {
        return new ResponseDTO<>(200,"회원가입 성공",null);
    }


    @Operation(summary = "로그인 (토큰 X)", description = "입력 받은 데이터와 DB 일치여부를 확인하여 일치하면 토큰 발급")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "비밀번호 불일치"),
            @ApiResponse(responseCode = "401", description = "탈퇴한 회원"),
            @ApiResponse(responseCode = "404", description = "잘못된 접근"),
            @ApiResponse(responseCode = "500", description = "로그인 실패 서버에러")
    })
    @PostMapping("/api/login")
    public TokenDTO login(@RequestBody LoginReqDTO loginReqDTO) {
        return new TokenDTO();
    }

    @Operation(summary = "로그아웃 (토큰 O)", description = "accessToken, refreshToken 을 만료")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "이미 만료된 토큰"),
            @ApiResponse(responseCode = "404", description = "잘못된 접근"),
            @ApiResponse(responseCode = "500", description = "로그아웃 실패 서버에러")
    })
    @PostMapping("/api/logout")
    public ResponseDTO<?> logout(@RequestBody RefreshTokenReqDTO refreshTokenReqDTO) {
        return new ResponseDTO<>(200,"로그아웃 성공",null);
    }

    @Operation(summary = "회원정보 수정 (토큰 O)", description = "현재 회원정보 반환")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "404", description = "잘못된 접근"),
            @ApiResponse(responseCode = "500", description = "로그인 정보 없음")
    })
    @GetMapping("/api/user")
    public LoginReqDTO editUser() {
        return new LoginReqDTO("123@naver.com","123");
    }

    @Operation(summary = "회원정보 수정 (토큰 O)", description = "기존 비밀번호가 일치해야 변경내용 DB에 저장")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "비밀번호 불일치"),
            @ApiResponse(responseCode = "401", description = "탈퇴한 회원"),
            @ApiResponse(responseCode = "404", description = "잘못된 접근"),
            @ApiResponse(responseCode = "500", description = "회원정보수정 실패 서버에러")
    })
    @PatchMapping("/api/user")
    public ResponseDTO<?> updateUser(@RequestBody PatchUserReqDTO patchUserReqDTO) {
        return new ResponseDTO<>(200,"회원정보 수정 완료",new LoginReqDTO("123@naver.com","123"));
    }


    @Operation(summary = "회원탈퇴 (토큰 O)", description = "기존 비밀번호 일치여부 확인후 DB에 탈퇴 회원 표시")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "비밀번호 불일치"),
            @ApiResponse(responseCode = "401", description = "이미 탈퇴한 회원"),
            @ApiResponse(responseCode = "404", description = "잘못된 접근"),
            @ApiResponse(responseCode = "500", description = "회원탈퇴 실패 서버에러")
    })
    @DeleteMapping("/api/user")
    public ResponseDTO<?> deleteUser(@RequestBody DeleteUserReqDTO deleteUserReqDTO) {
        return new ResponseDTO<>(200,"회원탈퇴 완료",null);
    }

    @Operation(summary = "토큰 리프레시", description = "refreshToken을 확인하여 일치하는 토큰이 있다면 accessToken 발급, refreshToken 은 재발급 안함")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "비밀번호 불일치"),
            @ApiResponse(responseCode = "401", description = "이미 탈퇴한 회원"),
            @ApiResponse(responseCode = "404", description = "잘못된 접근"),
            @ApiResponse(responseCode = "500", description = "회원탈퇴 실패 서버에러")
    })
    @PostMapping("/api/refresh")
    public TokenDTO validateRefreshToken(@RequestBody RefreshTokenReqDTO refreshTokenReqDTO) {
        return new TokenDTO("New AccessToken","RefreshToken");

    }
}
