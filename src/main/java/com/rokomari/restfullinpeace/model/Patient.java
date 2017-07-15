package com.rokomari.restfullinpeace.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
public class Patient  implements Serializable {
  @Id
  @GeneratedValue
  @Column(name="PatientID")
  private Integer id;
  @Column(name="Name")
  private String name;
  @Column(name="Age")
  private Integer age;
  @Column(name = "DiseaseDescription")
  private String diseaseDescription;

    public Patient() {
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDiseaseDescription() {
        return diseaseDescription;
    }

    public void setDiseaseDescription(String diseaseDescription) {
        this.diseaseDescription = diseaseDescription;
    }


}
