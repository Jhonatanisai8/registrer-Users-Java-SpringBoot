package com.isai.registrerusersjava.app.validation;

import com.isai.registrerusersjava.app.models.Employee;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class EmployeeValidador
        implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Employee.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        //Employee employee = (Employee) target;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "direction", "NotEmpty.employee.direction");
//        //validamos el patron del nif
//        if (!employee.getNif().matches("[0-9]{8}[A-Z]{1}")) {
//            errors.rejectValue("nif", "Pattern.employee.nif");
//        }
    }
}
