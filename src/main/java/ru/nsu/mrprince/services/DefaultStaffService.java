package ru.nsu.mrprince.services;

import org.springframework.stereotype.Service;
import ru.nsu.mrprince.model.entities.Staff;
import ru.nsu.mrprince.model.dto.StaffDTO;


@Service
public class DefaultStaffService implements StaffService{

    public StaffDTO StaffToStaffDTO (Staff staff) {
        StaffDTO staffDTO = new StaffDTO();
        staffDTO.setBirthDate(staff.getBirthDate());
        staffDTO.setDepartment(staff.getDepartment().getNumber());
        staffDTO.setName(staff.getName());
        staffDTO.setStaffType(staff.getStaffType().getName());
        return staffDTO;
    }

}
