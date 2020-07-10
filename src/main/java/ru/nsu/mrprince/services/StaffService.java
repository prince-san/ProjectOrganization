package ru.nsu.mrprince.services;

import ru.nsu.mrprince.model.entities.Staff;
import ru.nsu.mrprince.model.dto.StaffDTO;

public interface StaffService {
    public StaffDTO StaffToStaffDTO(Staff staff);
}
