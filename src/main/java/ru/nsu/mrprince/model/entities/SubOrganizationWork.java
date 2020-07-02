package ru.nsu.mrprince.model.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class SubOrganizationWork extends AbstractEntity{

    private Integer cost;

    private String name;

    @ManyToOne
    private Project project;

    @ManyToOne
    private SubOrganization subOrganization;

}
