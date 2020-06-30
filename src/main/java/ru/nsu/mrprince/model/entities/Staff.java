package ru.nsu.mrprince.model.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Staff {
    @Id
    @GeneratedValue
    private Integer staff_id;

    private String name;

    private Integer age;
}
