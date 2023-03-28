package com.fastcampus.swagger.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@ApiModel(value = "실거래정보 검색을 위한 주소 입력 DATA")
public class AddressReqDTO {

    @ApiModelProperty(value = "주소", required = true, example = "둥기부등본에서 얻은 address값을 넣어주세요.")
    private String address;

}
