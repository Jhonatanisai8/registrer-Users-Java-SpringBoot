package com.isai.registrerusersjava.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("title", "Registro de Empleados");
        return "form";
    }

    @PostMapping("/form")
    public String procesar(Model model,
                          @RequestParam String firstName,
                          @RequestParam String lastName) {
        model.addAttribute("title", "Datos de Empleado");
        model.addAttribute("firstName", firstName);
        model.addAttribute("lastName", lastName);
        return "result";
    }
}
