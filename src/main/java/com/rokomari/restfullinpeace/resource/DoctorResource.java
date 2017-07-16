package com.rokomari.restfullinpeace.resource;

import com.rokomari.restfullinpeace.formData.DoctorPatients;
import com.rokomari.restfullinpeace.model.Doctor;
import com.rokomari.restfullinpeace.model.Patient;
import com.rokomari.restfullinpeace.repository.DoctorRepository;
import com.rokomari.restfullinpeace.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/rest/doctor")
public class DoctorResource {
    @Autowired
    private DoctorRepository doctorRepository;
    @Autowired
    private PatientRepository patientRepository;

    @GetMapping(value = "/allDoctors")
    public List<Doctor> getAll(){
        return doctorRepository.findAll();
    }

    @PostMapping(value = "/loadDoctor")
    public List<Doctor> persist(@RequestBody final Doctor doctor){
        doctorRepository.save(doctor);
        return doctorRepository.findAll();
    }

    @PutMapping("/updateDoctor")
    public Doctor update(@RequestBody Doctor doctor, @PathVariable Integer id) {
        return doctorRepository.save(doctor);
    }

    @DeleteMapping("/deleteDoctor")
    public void delete(@PathVariable Integer id) {
        patientRepository.delete(id);
    }

    @PostMapping("/create")
    public Doctor createDoctor(@RequestBody Doctor doctor) {
        doctorRepository.save(doctor);
        return doctorRepository.getOne(doctor.getId());
    }

    @PostMapping("/setPatients")
    public Doctor setPatients(@RequestBody DoctorPatients doctorPatients) {
        Doctor doctor =  doctorRepository.getOne(doctorPatients.getDoctorId());
        List<Patient> patients = new ArrayList<>();
        for (Integer patientId : doctorPatients.getPatientIds()) {
            patients.add(patientRepository.getOne(patientId));
        }
        doctor.setPatients(patients);
        return doctorRepository.getOne(doctor.getId());
    }
}
