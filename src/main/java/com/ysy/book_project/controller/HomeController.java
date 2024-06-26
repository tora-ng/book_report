package com.ysy.book_project.controller;


import com.ysy.book_project.service.HomeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
@RequiredArgsConstructor
public class HomeController {
    private final HomeService homeService;

    @GetMapping("/main")
    public String home() {
        return "/main";
    }
}
