package com.SonalSinha.HospitalManagment.service;

import java.util.List;

import com.SonalSinha.HospitalManagment.vo.PatientVO;

public interface PatientServce {

	PatientVO admitPatient(PatientVO patientVO);

	void dischargePatient(PatientVO patientVO) throws Exception;

	List<PatientVO> getAllPatientsAdmitted();

	PatientVO updatePatientDetails(PatientVO patientVO) throws Exception;

}
