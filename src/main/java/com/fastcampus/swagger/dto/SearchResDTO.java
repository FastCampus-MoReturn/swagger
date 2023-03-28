package com.fastcampus.swagger.dto;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@ApiModel(value = "용어검색 출력 DATA")
public class SearchResDTO {

    @ApiModelProperty(value = "용어검색에 해당하는 자료 출력", required = true, example = "등기부란 토지ㆍ건물의 등기를 하는 공부로서 해당 등기소에 비치되고 있는데 " +
            "토지등기부와 건물등기부의 2종으로 각각 토지ㆍ건물에 대하여 일정사항을 기재한 등기용지를 편철하고 있다. " +
            "등기부는 토지ㆍ건물에 대한 권리관계를 일반에게 공시하기 위한것으로 누구나 신청하면 이를 열람할 수 있으며 " +
            "등기사항전부증명서나 등기사항일부증명서의 교부를 요구할 수 있다. ")
    private String searchData;

}
