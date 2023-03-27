package com.fastcampus.swagger.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@ApiModel(value = "리프레시토큰 입력 DATA")
public class RefreshTokenReqDTO {

    @ApiModelProperty(value = "리프레시 토큰")
    private String refreshToken;


}