package com.example.demo105.Controller;
import com.example.demo105.Dao.entity.GlassesEntity;
import com.example.demo105.Services.MethodService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
@RequestMapping("/admin")
public class AdminPanelController{
    private MethodService methodService;
    public AdminPanelController(@Qualifier("glassesService")
                      MethodService methodService){
        this.methodService = methodService;
    }
    @GetMapping("panel1")
    public String getAdmin(Model model) {
        model.addAttribute("customers", methodService.showFindAll());
        return "adminPanel";
    }
    @PostMapping("panel2")
        public String setAdmin(@ModelAttribute GlassesEntity glassesEntity,
                               Model model){
            model.addAttribute("customers", methodService.showFindAll());
            methodService.saveC(glassesEntity);
            return "adminPanel";
        }
    @GetMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable Integer id,
                                Model model){
        methodService.deleteProperty(id);
        model.addAttribute("customers", methodService.showFindAll());
        return "adminPanel";
    }
}