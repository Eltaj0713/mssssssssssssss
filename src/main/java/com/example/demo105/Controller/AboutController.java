package com.example.demo105.Controller;
import com.example.demo105.Services.MethodService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/aboutController")
public class AboutController{
    private final MethodService methodService;
    public AboutController(@Qualifier("aboutService")
                           MethodService methodService){
        this.methodService = methodService;
    }
    @GetMapping("/about")
    public String showAbout(Model model){
        model.addAttribute("abouts",methodService.showAboutFindAll());
        return "about";
    }
}