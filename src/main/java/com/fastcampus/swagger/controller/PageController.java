package com.fastcampus.swagger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

@Controller
@RequestMapping(value = "/")
@ApiIgnore
public class PageController {

    @RequestMapping("/")
    public String homeRedirect() {
        return "redirect:/swagger-ui/index.html";
    }

}
