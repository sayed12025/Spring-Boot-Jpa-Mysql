package com.rokomari.restfullinpeace.model;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
public class Doctor implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "DoctorID")
    private Integer id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Specility")
    private String speciality;
    @Column(name = "AvailableTime")
    private String availableTime;

    @ManyToMany
    private List<Patient> patients;

    public Doctor() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getAvailableTime() {
        return availableTime;
    }

    public void setAvailableTime(String availableTime) {
        this.availableTime = availableTime;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }
}
