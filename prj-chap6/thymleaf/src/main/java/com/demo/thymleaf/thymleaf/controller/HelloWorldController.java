package com.demo.thymleaf.thymleaf.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @RequestMapping("/form")
    public String showForm(){
        return "helloworld-form";
    }

    @RequestMapping("/process")
    public String processForm(){
        return "helloworld";
    }

    @RequestMapping("/processShout")
    public String shoutDude(HttpServletRequest request, Model model){
        String name = request.getParameter("studentName");

        name = name.toUpperCase();

        String result = "Hey! " + name;

        model.addAttribute("msg", result);

        return "helloworld";
    }

    @PostMapping("/processShout1")
    public String shoutDude(@RequestParam("studentName") String name, Model model){

        name = name.toUpperCase();
        String result = "OK! " + name;
        model.addAttribute("msg", result);

        return "helloworld";
    }
}
