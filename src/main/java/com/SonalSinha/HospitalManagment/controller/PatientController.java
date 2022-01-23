package com.SonalSinha.HospitalManagment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SonalSinha.HospitalManagment.service.PatientServce;
import com.SonalSinha.HospitalManagment.vo.PatientVO;

@RestController
@RequestMapping(value = "/app/patient")
public class PatientController {

	@Autowired
	PatientServce patientServce;

	@PostMapping(value = "/admitPatient")
	public PatientVO admitPatient(@RequestBody PatientVO patientVO) {
		return patientServce.admitPatient(patientVO);
	}

	@PostMapping(value = "/dischargePatient")
	public void dischargePatient(@RequestBody PatientVO patientVO) throws Exception {
		patientServce.dischargePatient(patientVO);
	}

	@GetMapping(value = "/getAllPatientsAdmitted")
	public List<PatientVO> getAllPatientsAdmitted() {
		return patientServce.getAllPatientsAdmitted();
	}
	
	@PostMapping(value = "/updatePatientDetails")
	public PatientVO updatePatientDetails(@RequestBody PatientVO patientVO) throws Exception {
		return patientServce.updatePatientDetails(patientVO);
	}
}
