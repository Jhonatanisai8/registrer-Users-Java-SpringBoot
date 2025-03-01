package com.isai.registrerusersjava.app.controllers;

import com.isai.registrerusersjava.app.models.Employee;
import com.isai.registrerusersjava.app.service.implementation.EmployeeServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

    @Autowired
    private EmployeeServiceImple employeeServiceImple;

    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("title", "Registro de Empleados");
        return "form";
    }

    @PostMapping("/form")
    public String procesar(Model model,
                           @RequestParam String firstName,
                           @RequestParam String lastName,
                           @RequestParam String email) {
        model.addAttribute("title", "Datos de Empleado");
        Employee employee = new Employee();
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setEmail(email);
        employeeServiceImple.save(employee);
        model.addAttribute("employee", employee);
        return "result";
    }
}
