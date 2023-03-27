package com.fastcampus.swagger.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@ApiModel(value = "회원정보수정 입력 DATA")
public class PatchUserReqDTO {

    @ApiModelProperty(value = "기존 비밀번호", required = true)
    private String oldPassword;
    @ApiModelProperty(value = "새로운 비밀번호")
    private String newPassword;
}




