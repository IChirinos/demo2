package com.example.demo2.controllers;

import com.example.demo2.models.service.IService;
import com.example.demo2.models.service.myService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class indexController {

    @Autowired
    private IService service;

    @GetMapping({"/","","/index"})
    public String index(Model model){
        model.addAttribute("object",service.operation());
        return "index";
    }


}
