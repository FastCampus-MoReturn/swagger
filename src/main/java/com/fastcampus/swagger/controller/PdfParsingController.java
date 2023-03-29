package com.fastcampus.swagger.controller;

import com.fastcampus.swagger.dto.PdfParsingResDTO;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;


@Api(tags = "PDF 파싱 서비스")
@RestController
public class PdfParsingController {

    @Operation(summary = "PDF 파싱", description = "encType=\"multipart/form-data input type=\"file\" 업로드 ")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "PDF 파일이 아님"),
            @ApiResponse(responseCode = "404", description = "잘못된 접근"),
            @ApiResponse(responseCode = "500", description = "파싱 실패 서버에러")
    })
    @PostMapping("/api/pdfUpload")
    @ResponseBody
    public PdfParsingResDTO jsonParsing(@ApiIgnore MultipartFile multipartFile) {
        return new PdfParsingResDTO();
    }

}
