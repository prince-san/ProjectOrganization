package ru.nsu.mrprince.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.nsu.mrprince.model.entities.StaffType;

@RepositoryRestResource(path = "staff")
public interface StaffTypeRepository extends JpaRepository<StaffType, Integer> {

    Page<StaffType> findByName(@Param("name") String name, Pageable p);

}
