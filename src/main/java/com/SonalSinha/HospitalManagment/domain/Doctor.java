package com.SonalSinha.HospitalManagment.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

import static javax.persistence.GenerationType.SEQUENCE;

@Getter
@Setter
@Entity
@Table(name = "doctor")
public class Doctor {

	@Id
	@GeneratedValue(strategy = SEQUENCE)
	Integer id;
	
	String name;
	
	String speciality;
	
	String mobileNo;

}
