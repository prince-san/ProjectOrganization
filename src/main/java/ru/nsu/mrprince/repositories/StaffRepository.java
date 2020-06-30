package ru.nsu.mrprince.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.nsu.mrprince.model.entities.Staff;

public interface StaffRepository extends CrudRepository<Staff, Integer> {
}
