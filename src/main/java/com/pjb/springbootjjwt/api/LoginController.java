package com.pjb.springbootjjwt.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping(value = "/aaa")
    public String getLoginPage() {
        return "login";
    }
}
