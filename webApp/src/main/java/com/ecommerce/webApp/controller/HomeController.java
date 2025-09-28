package com.ecommerce.webApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

   @RequestMapping("/")
    public String greed()
    {
        return "welcome to web app";
    }
    @RequestMapping("/about ")
    public String about()
    {
        return "about";
    }
}
