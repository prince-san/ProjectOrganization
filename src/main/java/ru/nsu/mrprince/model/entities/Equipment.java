package ru.nsu.mrprince.model.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Getter
@Setter
public class Equipment extends AbstractEntity{

    @ManyToOne
    private Department department;

    @ManyToOne
    private Technician technician;

}
