package com.lamarrulla.cargaCSV.springboot.swagger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SwaggerController {
    @GetMapping("/")
    public String swaggerUI(){
        return "redirect:/swagger-ui.html";
    }
}
