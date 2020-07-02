package ru.nsu.mrprince.model.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Getter
@Setter
public class SubOrganization extends AbstractEntity{

    private String name;

    @OneToMany
    private Set<SubOrganizationWork> subOrganizationWork;

}
