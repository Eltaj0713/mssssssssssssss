package com.example.demo105.Controller;
import com.example.demo105.Services.MethodService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/glassesController")
public class GlassesController{
    private final MethodService methodService;
    public GlassesController(@Qualifier("glassesService")
                             MethodService methodService){
        this.methodService = methodService;
    }
    @GetMapping("/glasses")
    public String showGlases(Model model){
        model.addAttribute("customers",methodService.showFindAll());
        return "glasses";
    }
    @GetMapping("/{id}")
    public String showGlasesById(Model model,
            @PathVariable Integer id){
        model.addAttribute("customer", methodService.getGlassesById(id));
        return "glassesDetail";
    }
}