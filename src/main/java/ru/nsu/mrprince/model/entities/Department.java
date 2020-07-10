package ru.nsu.mrprince.model.entities;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Getter
@Setter
public class Department extends AbstractEntity{

    private Integer number;

    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    private Leader leader;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Staff> staff;

}
