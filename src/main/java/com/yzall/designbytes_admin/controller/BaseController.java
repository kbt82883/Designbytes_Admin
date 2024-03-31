package com.yzall.designbytes_admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {
    @GetMapping("/")
    public String defaultView(Model model) {
        return "admin_video";
    }

    @GetMapping("/video")
    public String videoView(Model model) {
        return "admin_video";
    }

    @GetMapping("/member")
    public String memberView(Model model) {
        return "admin_member";
    }

//    @GetMapping("/{a}")
//    public String redirect(@PathVariable String a) {
//        if ("favicon.ico".equals(a)) {
//            return a;
//        }
//        return "html/" + a;
//    }
}
