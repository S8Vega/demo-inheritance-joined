package com.s8vega.demo.persist.hibernate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Employee")
@Inheritance(strategy=InheritanceType.JOINED)
public class Employee implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long id;

    private String nif;

    private String name;

    private String phone;

    private String email;
}
