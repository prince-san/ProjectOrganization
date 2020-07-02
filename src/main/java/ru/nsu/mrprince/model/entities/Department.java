package ru.nsu.mrprince.model.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class Department extends AbstractEntity{

    private String name;

    @ManyToOne
    private Leader leader;

}
