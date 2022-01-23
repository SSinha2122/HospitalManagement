package com.SonalSinha.HospitalManagment.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.SonalSinha.HospitalManagment.domain.Patient;
import com.SonalSinha.HospitalManagment.repository.PatientRepository;
import com.SonalSinha.HospitalManagment.vo.PatientVO;

@Service
public class PatientServiceImpl implements PatientServce {

	@Autowired
	PatientRepository patientRepository;

	@Override
	public PatientVO admitPatient(PatientVO patientVO) {
		Patient patient = new Patient();
		if (patientVO != null) {
			patient.setAdmitDate(new Date());
			patient.setAge(patientVO.getAge());
			patient.setDoctorName(patientVO.getDoctorName());
			patient.setExpenses(patientVO.getExpenses());
			patient.setIsAdmit('Y');
			patient.setName(patientVO.getName());
			patient.setRoom(patientVO.getRoom());
			patient = patientRepository.save(patient);
			patientVO.setAdmitDate(patient.getAdmitDate());
			patientVO.setIsAdmit(patient.getIsAdmit());
			patientVO.setId(patient.getId());
		}
		return patientVO;
	}

	@Override
	public void dischargePatient(PatientVO patientVO) throws Exception {
		Optional<Patient> patient = patientRepository.findById(patientVO.getId());
		if (patient.isPresent()) {
			patient.get().setIsAdmit('N');
			patientRepository.save(patient.get());
		}else {
			throw new Exception("Patient Not Admitted");
		}
	}

	@Override
	public List<PatientVO> getAllPatientsAdmitted() {
		List<PatientVO> patientVO = new ArrayList<>();
		List<Patient> patients = patientRepository.findAll();
		if(!CollectionUtils.isEmpty(patients)) {
			patients.forEach(patient->{
				if(patient.getIsAdmit().equals('Y')) {
					patientVO.add(mapToPatientVO(patient));
				}
			});
		}
		return patientVO;
	}
	
	PatientVO mapToPatientVO(Patient patient) {
		PatientVO patientVO = new PatientVO();
		patientVO.setAdmitDate(patient.getAdmitDate());
		patientVO.setAge(patient.getAge());
		patientVO.setDoctorName(patient.getDoctorName());
		patientVO.setExpenses(patient.getExpenses());
		patientVO.setId(patient.getId());
		patientVO.setIsAdmit(patient.getIsAdmit());
		patientVO.setName(patient.getName());
		patientVO.setRoom(patient.getRoom());
		return patientVO;
	}

	@Override
	public PatientVO updatePatientDetails(PatientVO patientVO) throws Exception {
		Optional<Patient> patient = patientRepository.findById(patientVO.getId());
		if(patient.isPresent()) {
			patientVO.setDoctorName(patientVO.getDoctorName());
			patientVO.setExpenses(patientVO.getExpenses());
			patientRepository.save(patient.get());
			return patientVO;
		}else {
			throw new Exception("Patient not admitted");
		}
	}
}
