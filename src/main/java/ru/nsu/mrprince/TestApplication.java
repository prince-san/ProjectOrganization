package ru.nsu.mrprince;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.nsu.mrprince.model.entities.Department;
import ru.nsu.mrprince.model.entities.Leader;
import ru.nsu.mrprince.model.entities.Staff;
import ru.nsu.mrprince.model.entities.StaffType;
import ru.nsu.mrprince.repositories.DepartmentRepository;
import ru.nsu.mrprince.repositories.StaffRepository;

import java.time.LocalDate;
import java.util.HashSet;

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

    @Bean
    public CommandLineRunner test(StaffRepository staffRepository, DepartmentRepository departmentRepository) {
        return (args) -> {
            Department department = new Department();
            department.setNumber(101);
            department.setName("Отдел разработки");

            Leader leader = new Leader();
            leader.setBirthDate(LocalDate.of(1970, 1, 1));
            leader.setName("Петров Геннадий Васильевич");
            leader.setDepartment(department);

            Staff staff = new Staff();
            staff.setBirthDate(LocalDate.of(1995, 1, 1));
            staff.setName("Петров Николай Геннадьевич");
            staff.setDepartment(department);

            StaffType staffType = new StaffType();
            staffType.setName("Engineer");

            StaffType staffType1 = new StaffType();
            staffType1.setName("Assistant");

            leader.setStaffType(staffType);
            staff.setStaffType(staffType1);

            HashSet<Staff> staffHashSet = new HashSet<>();
            staffHashSet.add(leader);
            staffHashSet.add(staff);

            department.setLeader(leader);
            department.setStaff(staffHashSet);

            departmentRepository.save(department);

        };
    }

}