package com.isai.registrerusersjava.app.validation;


import com.isai.registrerusersjava.app.validation.anotations.PhoneRegex;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PhoneRegexValidador
        implements ConstraintValidator<PhoneRegex, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        return value.matches("^[0-9]{9}$");
    }
}
