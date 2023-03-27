package com.fastcampus.swagger.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@ApiModel(value = "회원가입 입력 DATA")
public class SignupReqDTO {

    @ApiModelProperty(value = "이메일", required = true, example = "123@naver.com")
    private String email;
    @ApiModelProperty(value = "비밀번호", required = true, example = "123")
    private String password;
}


