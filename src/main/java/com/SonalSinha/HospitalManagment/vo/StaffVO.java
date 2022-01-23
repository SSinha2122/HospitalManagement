package com.SonalSinha.HospitalManagment.vo;

import lombok.Getter;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Getter
@Setter
public class StaffVO {
	
	@JsonInclude(Include.NON_NULL)
	Integer id;
	String name;
	String mobileNo;
	String address;
	String department;
	String position;
}
