package com.isai.registrerusersjava.app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Departament {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer departamentId;

    @NotEmpty
    @Size(max = 50)
    private String departamentName;

    @NotEmpty
    @Size(max = 50)
    private Double Budget;

}
