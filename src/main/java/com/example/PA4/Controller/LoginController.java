package com.example.PA4.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    
    @GetMapping("/login")
    public ModelAndView login()
    {
        ModelAndView mv = new ModelAndView("login");
        return mv;
    }
}
