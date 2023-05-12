package com.example.SpringProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testcontroller {

    @GetMapping("/")
    public String main() {

        return "main";
    }

    @GetMapping("/board")
    public String Board() {

        return "tables";
    }



}
