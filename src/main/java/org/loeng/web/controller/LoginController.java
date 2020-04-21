package org.loeng.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ss")
public class LoginController {


    @RequestMapping("/login.do")
    public String loginIndex(){

        System.out.println("/ss/login");
        return "index";
    }

}
