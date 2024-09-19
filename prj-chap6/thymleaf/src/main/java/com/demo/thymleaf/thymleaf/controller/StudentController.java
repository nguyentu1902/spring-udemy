package com.demo.thymleaf.thymleaf.controller;


import com.demo.thymleaf.thymleaf.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}")
    private List<String> countries;

    @Value("${languages}")
    private List<String> langs;

    @Value("${operationsystem}")
    private List<String> os;

    @GetMapping("/formStudent")
    public String showForm(Model model){
        Student sd = new Student();
        model.addAttribute("student", sd);
        model.addAttribute("countries", countries);
        model.addAttribute("langs", langs);
        model.addAttribute("operationSystems", os);
        return "student-form";
    }


    @PostMapping("/processStudent")
    public String processForm(@ModelAttribute("student") Student sd){
        return "student-confirmation";
    }
}
