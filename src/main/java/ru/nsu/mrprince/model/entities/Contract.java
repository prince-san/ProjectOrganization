package ru.nsu.mrprince.model.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class Contract extends AbstractEntity{

    @ManyToMany
    private Set<Project> project;

    @OneToOne
    private Customer customer;

    private String name;

    @ManyToOne
    private Leader leader;

}
