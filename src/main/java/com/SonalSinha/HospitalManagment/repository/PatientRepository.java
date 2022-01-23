package com.SonalSinha.HospitalManagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SonalSinha.HospitalManagment.domain.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
}
