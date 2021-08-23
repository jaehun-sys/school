package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/controllertest")
public class ControllerTest1 {
    @RequestMapping(method = RequestMethod.GET) 
    public String test(Model model) { // 함수 이름은 아무거나..
        System.out.println("test");
        return "test"; // templates/test.html 을 의미함
    }
}