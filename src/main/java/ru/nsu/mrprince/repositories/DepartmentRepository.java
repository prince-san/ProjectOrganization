package ru.nsu.mrprince.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.nsu.mrprince.model.entities.Department;

@RepositoryRestResource(path = "department")
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

    Page<Department> findByNumber(@Param("number") Integer number, Pageable p);

}
