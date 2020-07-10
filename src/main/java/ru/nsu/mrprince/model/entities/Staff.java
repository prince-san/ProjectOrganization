package ru.nsu.mrprince.model.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Staff extends AbstractEntity{

    private String name;

    private LocalDate birthDate;

    @ManyToOne(cascade = CascadeType.ALL)
    private StaffType staffType;

    @ManyToOne
    private Department department;

}
