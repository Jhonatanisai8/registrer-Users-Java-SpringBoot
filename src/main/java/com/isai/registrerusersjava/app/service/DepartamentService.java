package com.isai.registrerusersjava.app.service;

import com.isai.registrerusersjava.app.models.Departament;

import java.util.List;

public interface DepartamentService {
    List<Departament> getAllDepartaments();

    Departament getDepartamentById(Integer id);
}
