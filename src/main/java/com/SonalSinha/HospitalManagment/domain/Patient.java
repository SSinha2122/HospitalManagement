package com.SonalSinha.HospitalManagment.domain;

import static javax.persistence.GenerationType.SEQUENCE;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "patient")
public class Patient {

	@Id
	@GeneratedValue(strategy = SEQUENCE)
	Integer id;
	
	String name;
	
	Integer age;
	
	String room;
	
	String doctorName;
	
	Date admitDate;
	
	double expenses;
	
	Character isAdmit;
	
}
