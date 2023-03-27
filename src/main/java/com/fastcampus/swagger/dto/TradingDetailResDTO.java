package com.fastcampus.swagger.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@ApiModel(value = "실거래 상세 출력 DATA")
public class TradingDetailResDTO {

    @ApiModelProperty(value = "거래 고유번호", example = "41360-2696")
    private String serialNumber;
    @ApiModelProperty(value = "거래금액", example = "42000")
    private String amount;//거래금액
    @ApiModelProperty(value = "거래유형", example = "직거래, 중개거래")
    private String tradeType;//거래유형
    @ApiModelProperty(value = "건축년도", example = "2010")
    private String buildYear;//건축년도
    @ApiModelProperty(value = "계약 연", example = "2023")
    private String tradeYear; //계약 연
    @ApiModelProperty(value = "계약 월", example = "3")
    private String tradeMonth; //계약 월
    @ApiModelProperty(value = "계약 일", example = "3")
    private String tradeDay; //계약 일
    @ApiModelProperty(value = "법정동시군구코드(숫자5자리)", example = "41360")
    private String siGunguCode; //법정동시군구코드
    @ApiModelProperty(value = "법정동읍면동코드(숫자5자리)", example = "25328")
    private String eupMyunDongCode; //법정동읍면동코드
    @ApiModelProperty(value = "법정동", example = "진접읍 금곡리")
    private String legDong; //법정동
    @ApiModelProperty(value = "거래된 아파트 이름", example = "예당마을신안인스빌")
    private String tradeAptName; //거래된 아파트 이름
    @ApiModelProperty(value = "주소 지번", example = "1117")
    private String jibun; //주소 지번
    @ApiModelProperty(value = "거래된 전용면적", example = "84.985")
    private String tradeExclusiveArea; //거래된전용면적
    @ApiModelProperty(value = "거래된 층", example = "13")
    private String tradefloor; //거래된층
}
