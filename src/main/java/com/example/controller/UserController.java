package com.example.controller;

import com.example.dao.UserDAO;
import com.example.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")

public class UserController {
    @Autowired
    UserDAO dao;
    @RequestMapping(method = RequestMethod.GET)

    public String getUser(Model model) {
        UserVO vo = new UserVO() ;
        vo.setId("kim");
        vo.setPassword("kim123");

        UserVO result = dao.getUser(vo) ;
        System.out.println( result );

        model.addAttribute("id", result.getId());
        model.addAttribute("name", result.getName() );

        return "userinfo";
    }
}