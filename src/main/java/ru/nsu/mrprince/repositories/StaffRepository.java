package ru.nsu.mrprince.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.nsu.mrprince.model.entities.Staff;

@RepositoryRestResource(path = "staff")
public interface StaffRepository extends JpaRepository<Staff, Integer> {

    @Query(
            "SELECT DISTINCT s FROM Staff s " +
            "WHERE s.name = :name"
    )
    Page<Staff> findByName(@Param("name") String name, Pageable p);

}
