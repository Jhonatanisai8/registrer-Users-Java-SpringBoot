package com.isai.registrerusersjava.app.validation.anotations;

import com.isai.registrerusersjava.app.validation.PhoneRegexValidador;
import jakarta.validation.Constraint;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = {PhoneRegexValidador.class})
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface PhoneRegex {
    java.lang.String message() default "Número de telefono incorrecto debe de ser de 9 digitos";

    java.lang.Class<?>[] groups() default {};

    java.lang.Class<? extends jakarta.validation.Payload>[] payload() default {};
}
