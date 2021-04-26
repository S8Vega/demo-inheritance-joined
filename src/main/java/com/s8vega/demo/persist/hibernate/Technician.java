package com.s8vega.demo.persist.hibernate;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Getter
@Setter
@Entity
@PrimaryKeyJoinColumn(name="employeeId")
public class Technician extends Employee {

    private int experienceYears = 0;

    @Override
    public String toString() {
        return "Technician { technicianId=" + super.id + ", experienceYears=" + experienceYears + " }";
    }
}
