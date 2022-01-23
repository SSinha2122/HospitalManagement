package com.SonalSinha.HospitalManagment.domain;

import static javax.persistence.GenerationType.SEQUENCE;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "staff")
public class Staff {

	@Id
	@GeneratedValue(strategy = SEQUENCE)
	Integer id;
	String name;
	String mobileNo;
	String address;
	String department;
	String position;
}
