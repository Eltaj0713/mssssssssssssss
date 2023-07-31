package com.example.demo105.Controller;
import com.example.demo105.Services.MethodService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/shopController")
public class ShopController{
    private final MethodService methodService;
    public ShopController(@Qualifier("shopService")
                          MethodService methodService){
        this.methodService = methodService;
    }
    @GetMapping("/shop")
    public String showShop(Model model){
        model.addAttribute("shops",methodService.showShopFindAll());
        return "shop";
    }
}