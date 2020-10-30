package com.example.PA4.Controller;

import com.example.PA4.Service.MedService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public class MedController {
   
    @Autowired
    private MedService servico;


    @GetMapping("/medicamentos")
    public ModelAndView getMeds()
    {
        ModelAndView mv = new ModelAndView("medicamentosTemplate");
        mv.addObject("medicamentos", servico.getMeds());

        return mv;
    }
}
