package ru.nsu.mrprince.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.nsu.mrprince.model.entities.Department;
import ru.nsu.mrprince.model.entities.Staff;
import ru.nsu.mrprince.model.entities.StaffType;

import java.time.LocalDate;

@RepositoryRestResource(path = "staff")
public interface StaffRepository extends JpaRepository<Staff, Integer> {

    Page<Staff> findByName(@Param("name") String name, Pageable p);

    Page<Staff> findByDepartment(Department department, Pageable pageable);

    Page<Staff> findByDepartmentAndStaffType(Department department, StaffType staffType, Pageable pageable);

    Page<Staff> findByDepartmentAndBirthDate(Department department, LocalDate birthDate, Pageable pageable);

    Page<Staff> findByDepartmentAndBirthDateBetween(Department department, LocalDate birthDate, LocalDate birthDate2, Pageable pageable);

}
