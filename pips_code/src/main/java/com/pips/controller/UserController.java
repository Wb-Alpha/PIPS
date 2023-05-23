package com.pips.controller;

import com.pips.pojo.User;
import com.pips.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping ("/login")
    public String login(Model model, HttpSession session, String id, String password){
        User user = userService.queryUserById(id);
        System.out.println(user.getId()+"&"+user.getPassword()+"&"+id+"&"+password);
        if (user.getId()==null || user.getPassword()==null){
            model.addAttribute("msg","没有此账户");
            return "sign-in";
        }
        if (!user.getPassword().equals(password)){
            model.addAttribute("msg","密码不正确");
            return "sign-in";
        }
        model.addAttribute("user", user.getName());
        return "redirect:/TodoList/toMainPage";
    }
}
