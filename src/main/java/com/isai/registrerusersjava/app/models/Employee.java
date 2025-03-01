package com.isai.registrerusersjava.app.models;

import com.isai.registrerusersjava.app.validation.anotations.PhoneRegex;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;

    //@Pattern(regexp = "[0-9]{8}[A-Z]{1}")//32481596F
    private String nif;

    @Length(max = 50)
    @NotEmpty
    private String firstName;

    @Length(max = 50)
    @NotEmpty
    @Size(max = 50)
    private String lastName;

    @Size(max = 50)
    private String direction;

    @Length(max = 100)
    @NotEmpty
    @Email
    private String email;

    @NotEmpty
    @PhoneRegex
    private String phone;
}
