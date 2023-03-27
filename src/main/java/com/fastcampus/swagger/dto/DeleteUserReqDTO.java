package com.fastcampus.swagger.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@ApiModel(value = "회원탈퇴 입력 DATA")
public class DeleteUserReqDTO {

    @ApiModelProperty(value = "비밀번호 ", required = true)
    private String password;
}
