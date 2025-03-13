package com.isai.registrerusersjava.app.service.implementation;

import com.isai.registrerusersjava.app.models.Departament;
import com.isai.registrerusersjava.app.repository.DepartamentRepository;
import com.isai.registrerusersjava.app.service.DepartamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentServiceImpl
        implements DepartamentService {

    @Autowired
    private DepartamentRepository departamentRepository;

    @Override
    public List<Departament> getAllDepartaments() {
        return departamentRepository.findAll();
    }

    @Override
    public Departament getDepartamentById(Integer departamentId) {
        return departamentRepository.getDepartamentById(departamentId);
    }


}
