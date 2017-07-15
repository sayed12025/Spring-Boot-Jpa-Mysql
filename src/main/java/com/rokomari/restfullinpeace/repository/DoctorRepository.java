package com.rokomari.restfullinpeace.repository;

import com.rokomari.restfullinpeace.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sayed on 7/14/2017.
 */
public interface DoctorRepository extends JpaRepository<Doctor,Integer> {
}
