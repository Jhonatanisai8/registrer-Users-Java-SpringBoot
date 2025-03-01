package com.isai.registrerusersjava.app.service.implementation;

import com.isai.registrerusersjava.app.models.Employee;
import com.isai.registrerusersjava.app.repository.EmployeeRepository;
import com.isai.registrerusersjava.app.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImple
        implements EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Override
    public Employee save(Employee employee) {
        return repository.save(employee);
    }
}
