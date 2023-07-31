package com.example.demo105.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/contactController")
class HelpPagesContact{
    @GetMapping("/contactGet")
    public String showPostMethodContact(){
        return "contact";
        }
    }