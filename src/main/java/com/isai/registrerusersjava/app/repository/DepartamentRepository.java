package com.isai.registrerusersjava.app.repository;

import com.isai.registrerusersjava.app.models.Departament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentRepository
        extends JpaRepository<Departament, Integer> {

    @Query(
            value = "SELECT * FROM departament WHERE departament_id = departamentId",
            nativeQuery = true
    )
    Departament getDepartamentById(@Param("departamentId") Integer departamentId);

}
