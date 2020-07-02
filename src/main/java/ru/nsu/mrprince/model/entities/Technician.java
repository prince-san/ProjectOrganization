package ru.nsu.mrprince.model.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Getter
@Setter
public class Technician extends Staff{

    @OneToMany
    private Set<Equipment> equipment;

}
