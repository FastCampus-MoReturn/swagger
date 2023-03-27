package com.fastcampus.swagger.controller;

import com.fastcampus.swagger.dto.TradingDetailResDTO;
import com.fastcampus.swagger.dto.TradingPriceIndexResDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@Api(tags = "외부 API 서비스")
@RestController
public class ApiController {

    @Operation(summary = "주간아파트 가격 동향 지수", description = "3가지 정보를 입력받아 데이터를 출력한다. 오늘날짜 기준 내림차순으로 데이터를 제공, 값이 여러개일경우 여러개 제공")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "인증정보 오류"),
            @ApiResponse(responseCode = "404", description = "잘못된 접근"),
            @ApiResponse(responseCode = "500", description = "API 서버에러")
    })
    @GetMapping("/tradingPriceIndex/{regionCode}/{contractType}/{researchDate}")  //주간아파트 가격 동향 지수
    public TradingPriceIndexResDTO tradingPriceIndex(
            @PathVariable("regionCode")
            @ApiParam(value = "수도권 A2000, 서울 11000", required = true) String regionCode, // (수도권 A2000, 서울 11000)
            @PathVariable("contractType")
            @ApiParam(value = "매매:S , 전세:D", required = true) String contractType,// (매매:S , 전세:D)
            @PathVariable("researchDate")
            @ApiParam(value = "1년:12, 3개월:3, 6개월:6", required = true) int researchDate // (1년:12, 3개월:3, 6개월:6)
    ) {

        return new TradingPriceIndexResDTO();
    }


    @Operation(summary = "부동산 실거래 상세 자료", description = "현재의 등기부등본의 실거래 자료를 반환 , 값이 여러개일경우 여러개 제공 ")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "인증정보 오류"),
            @ApiResponse(responseCode = "404", description = "잘못된 접근"),
            @ApiResponse(responseCode = "500", description = "API 서버에러")
    })
    @GetMapping("/tradingdetail")  //부동산 실거래 상세 자료
    public TradingDetailResDTO tradingDetail(
            @RequestBody
            @ApiParam(value = "등기부 등본의 adrress 값을 입력해주세요.", required = true) String address) {
        return new TradingDetailResDTO();
    }



}
