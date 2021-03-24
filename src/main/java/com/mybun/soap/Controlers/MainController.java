package com.mybun.soap.Controlers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")						//какое действие будет выполняться при переходе на главную страницу
    public String home(Model model) {
        model.addAttribute("title1", "Main Page");
        return "home";                      //вызываем нужную страницу
    }

}
