package com.isai.registrerusersjava.app.controllers;

import com.isai.registrerusersjava.app.models.Employee;
import com.isai.registrerusersjava.app.service.implementation.EmployeeServiceImple;
import com.isai.registrerusersjava.app.validation.EmployeeValidador;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("employee")
public class FormController {

    @Autowired
    private EmployeeServiceImple employeeServiceImple;

    @Autowired
    private EmployeeValidador employeeValidador;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.addValidators(employeeValidador);
    }

    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("title", "Registro de Empleados");
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "form";
    }

    @PostMapping("/form")
    public String procesar(Model model,
                           @Valid Employee employee,
                           BindingResult results,
                           SessionStatus status) {
        model.addAttribute("title", "Datos de Empleado");
        if (results.hasErrors()) {
 /*           Map<String, String> errors = new HashMap<>();
            results.getFieldErrors()
                    .forEach(error ->
                            errors.put(error.getField(),
                                    error.getDefaultMessage()));
            model.addAttribute("errors", errors);*/
            return "form";
        }
        employeeServiceImple.save(employee);
        model.addAttribute("employee", employee);
        status.setComplete();
        return "result";
    }
}
