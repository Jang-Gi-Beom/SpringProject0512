package com.example.SpringProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller //Controller 페이지를 return 아닌 data(JSON) return 함,(정확히는 ResponseBody 반환)
public class userController {
    @Autowired
    UserService userService;


    @GetMapping("/user/list")
    public String getTest(Model model){
        model.addAttribute("list", userService.userList());

        return "index";
    }

}
