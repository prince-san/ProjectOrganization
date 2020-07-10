package ru.nsu.mrprince;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nsu.mrprince.model.entities.Department;
import ru.nsu.mrprince.model.entities.Staff;
import ru.nsu.mrprince.model.entities.StaffType;
import ru.nsu.mrprince.model.dto.StaffDTO;
import ru.nsu.mrprince.repositories.DepartmentRepository;
import ru.nsu.mrprince.repositories.StaffRepository;
import ru.nsu.mrprince.repositories.StaffTypeRepository;
import ru.nsu.mrprince.services.StaffService;

import java.time.LocalDate;

@RestController
@RequestMapping(value = "staffQueries")
@RequiredArgsConstructor
public class StaffController {

    private final StaffRepository staffRepository;

    private final DepartmentRepository departmentRepository;

    private final StaffTypeRepository staffTypeRepository;

    private final StaffService staffService;

    @GetMapping(value = "1/1/{departmentNumber}/{type}")
    public Page<StaffDTO> findByDepartmentAndType(@PathVariable("departmentNumber") Integer departmentNumber, @PathVariable("type") String type) {

        Department department = departmentRepository.findByNumber(departmentNumber, Pageable.unpaged()).toList().get(0);

        StaffType staffType = staffTypeRepository.findByName(type, Pageable.unpaged()).toList().get(0);

        Page<Staff> staffList = staffRepository.findByDepartmentAndStaffType(department, staffType, Pageable.unpaged());

        return staffList.map(staffService::StaffToStaffDTO);
    }

    @GetMapping(value = "1/2/{departmentNumber}/{age}")
    public Page<StaffDTO> findByDepartmentAndAge(@PathVariable("departmentNumber") Integer departmentNumber, @PathVariable("age") Integer age) {
        Department department = departmentRepository.findByNumber(departmentNumber, Pageable.unpaged()).toList().get(0);

        Page<Staff> staffList = staffRepository.findByDepartmentAndBirthDateBetween(department,
                LocalDate.now().minusYears(age + 1).plusDays(1),
                LocalDate.now().minusYears(age),
                Pageable.unpaged());

        return staffList.map(staffService::StaffToStaffDTO);
    }

}
