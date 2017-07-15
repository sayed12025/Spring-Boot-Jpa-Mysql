package com.rokomari.restfullinpeace.repository;

import com.rokomari.restfullinpeace.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Integer >{

}
