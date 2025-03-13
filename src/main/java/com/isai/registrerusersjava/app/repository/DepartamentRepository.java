package com.isai.registrerusersjava.app.repository;

import com.isai.registrerusersjava.app.models.Departament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentRepository
extends JpaRepository<Departament, Integer> {
}
