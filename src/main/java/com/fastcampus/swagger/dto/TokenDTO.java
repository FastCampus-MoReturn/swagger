package com.fastcampus.swagger.dto;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@ApiModel(value = "토큰 출력 DATA")
public class TokenDTO {

    @ApiModelProperty(value = "엑세스 토큰")
    private String accessToken;
    @ApiModelProperty(value = "리프레시 토큰")
    private String refreshToken;

}

