package com.example.controller;

import com.example.dao.UserDAO;
import com.example.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.service.UserService;
import org.springframework.web.bind.annotation.ModelAttribute;
import java.util.List;



@Controller
//@RequestMapping("/user")

public class UserController {

    @Autowired
    UserService userService;

    //@Autowired
    //UserDAO dao;
    
    // @RequestMapping(method = RequestMethod.GET)
    // public String getUser(Model model) {
    //     UserVO vo = new UserVO() ;
    //     vo.setId("kim");
    //     vo.setPassword("kim123");

    //     UserVO result = dao.getUser(vo) ;
    //     System.out.println( result );

    //     model.addAttribute("id", result.getId());
    //     model.addAttribute("name", result.getName() );

    //     return "userinfo";
    // }

    @RequestMapping(value = "/get_user_list")
    public String getUserList(Model model) throws Exception {
        List<UserVO> userlist = userService.getUserList();
        model.addAttribute("userlist", userlist);
        return "userlist";
    }

    @RequestMapping(value = "/get_user")
    public String getUser(@ModelAttribute UserVO user, Model model) throws Exception {
        
        System.out.println("입력받은 id = " + user.getId());

        UserVO result = userService.getUser(user);
        
        model.addAttribute("id", result.getId());
        model.addAttribute("password", result.getPassword() );
        
        return "userInfo";
    }

    //login연습
    @RequestMapping(value = "/login")
    public String loginUser(@ModelAttribute UserVO user, Model model) throws Exception {
        
        System.out.println("입력받은 id = " + user.getId());
        System.out.println("입력받은 pw = " + user.getPassword());

        UserVO result = userService.loginUser(user);
        
        model.addAttribute("id", result.getId());
        model.addAttribute("password", result.getPassword() );
        
        return "userInfo";
    }
}