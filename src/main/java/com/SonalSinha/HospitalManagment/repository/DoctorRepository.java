package com.SonalSinha.HospitalManagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SonalSinha.HospitalManagment.domain.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

}
