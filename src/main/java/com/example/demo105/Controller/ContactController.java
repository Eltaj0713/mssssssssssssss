package com.example.demo105.Controller;
import com.example.demo105.Model.ContactDto;
import com.example.demo105.Services.MethodService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
@RequestMapping("/contactController")
public class ContactController{
    private final MethodService methodService;
    public ContactController(@Qualifier("contactService") MethodService methodService){
        this.methodService = methodService;
    }
    @PostMapping("/contactPost")
    public String saveMyContact(@ModelAttribute ContactDto contactDto){
        methodService.saveContact(contactDto);
        return "contact";
    }
}