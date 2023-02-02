package com.jirepos.autoconfig.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jsp")
public class JspController {

    @RequestMapping("/index")
    public String index() {
        return "/index";
    }
    @RequestMapping("/popup")
    public String login() {
        return "/popup";
    }
    @RequestMapping("/main")
    public String main() {
        return "/main";
    }

}
