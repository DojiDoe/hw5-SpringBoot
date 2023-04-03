package com.example.hw5_springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {


    @RequestMapping("/home")
    public String home(Model page,
     @RequestParam(required = false) String color,
    @RequestParam(required = false) Integer temperature){
        page.addAttribute("color",color);
        page.addAttribute("temperature",temperature.toString());
        return "home.html";
    }



}
