package com.hospital_management.controller;

import com.hospital_management.entity.Patient;
import com.hospital_management.repository.PatientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    PatientRepository repo;

    @GetMapping
    public List<Patient> getAllPatients() {
        return repo.findAll();
    }

    @PostMapping
    public Patient addPatient(@RequestBody Patient patient) {
        return repo.save(patient);
    }
}