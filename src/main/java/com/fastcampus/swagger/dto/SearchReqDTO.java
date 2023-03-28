package com.fastcampus.swagger.dto;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@ApiModel(value = "용어검색 입력 DATA")
public class SearchReqDTO {

    @ApiModelProperty(value = "단어입력", required = true, example = "등기부")
    private String searchString;

}
