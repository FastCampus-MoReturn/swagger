package com.fastcampus.swagger.controller;

import com.fastcampus.swagger.dto.SearchReqDTO;
import com.fastcampus.swagger.dto.SearchResDTO;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Api(tags = "등기부등본 용어해설 서비스")
@RestController
public class GlossaryController {

    @Operation(summary = "용어해설", description = "검색어를 입력받아 DB 저장되어있는 용어중 결과값을 제공")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "404", description = "잘못된 접근"),
            @ApiResponse(responseCode = "500", description = "서버에러")
    })
    @GetMapping("/api/glossary")
    @ResponseBody
    public SearchResDTO termSearch(@RequestBody SearchReqDTO searchReqDTO) {
        return new SearchResDTO();
    }

}
