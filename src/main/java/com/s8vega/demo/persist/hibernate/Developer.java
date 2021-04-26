package com.s8vega.demo.persist.hibernate;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Getter
@Setter
@Entity
@PrimaryKeyJoinColumn(name="employeeId")
public class Developer extends Technician {

    private String expertLanguajes = null;

    @Override
    public String toString() {
        return "Developer { developerId=" + id + ", expertLanguajes=" + expertLanguajes + " }";
    }
}

