package ru.nsu.mrprince.model.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
public class Project extends AbstractEntity{

    @ManyToOne
    private Leader leader;

    private Date startDate;

    private Date deadline;

    private Date endDate;

    private Integer cost;

    private String name;

    @OneToMany
    private Set<SubOrganizationWork> subOrganizationWork;

}
