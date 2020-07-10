package ru.nsu.mrprince.model.dto;


import lombok.Data;

import java.time.LocalDate;

@Data
public class StaffDTO {

    private String name;

    private LocalDate birthDate;

    private String staffType;

    private Integer department;

}
