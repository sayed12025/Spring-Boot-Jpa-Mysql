package com.rokomari.restfullinpeace.resource;

import com.rokomari.restfullinpeace.model.Patient;
import com.rokomari.restfullinpeace.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/patient")
public class PatientResource {
    @Autowired
    PatientRepository patientRepository;
    @GetMapping(value ="/allPatients")
    public List<Patient> getAll(){
        return patientRepository.findAll();
    }

    @PostMapping(value = "/loadPatients")
    public List<Patient> persist(@RequestBody final Patient patient){
        patientRepository.save(patient);
        return patientRepository.findAll();
    }
}
