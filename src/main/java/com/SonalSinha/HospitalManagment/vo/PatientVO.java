package com.SonalSinha.HospitalManagment.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PatientVO {
	
	@JsonInclude(Include.NON_NULL)
	Integer id;
	String name;
	Integer age;
	String room;
	String doctorName;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy")
	Date admitDate;
	double expenses;
	Character isAdmit;
}
