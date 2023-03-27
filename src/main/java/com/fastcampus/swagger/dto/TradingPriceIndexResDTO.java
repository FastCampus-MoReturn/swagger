package com.fastcampus.swagger.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@ApiModel(value = "주간아파트 가격 동향 지수 출력 DATA")
public class TradingPriceIndexResDTO {

    @ApiModelProperty(value = "지역코드", example = "A2000")
    private String region_cd;
    @ApiModelProperty(value = "지역명", example = "수도권")
    private String region_nm;
    @ApiModelProperty(value = "조사 월", example = "20230227")
    private String research_date;
    @ApiModelProperty(value = "지수" ,example = "93.2745535484623")
    private double indices;
    @ApiModelProperty(value = "계약 타입(전세/매매)", example = "S")
    private String tr_gbn;
    @ApiModelProperty(value = "지역구분 레벨", example = "0")
    private String level_no;
}
