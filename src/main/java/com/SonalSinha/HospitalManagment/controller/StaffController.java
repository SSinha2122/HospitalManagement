package com.SonalSinha.HospitalManagment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SonalSinha.HospitalManagment.service.StaffService;
import com.SonalSinha.HospitalManagment.vo.StaffVO;

@RestController
@RequestMapping(value = "/app/staff")
public class StaffController {

	@Autowired
	StaffService staffService;

	@PostMapping(value = "/signup")
	public StaffVO addStaff(@RequestBody StaffVO staffVO) {
		return staffService.addStaff(staffVO);
	}

	@PostMapping(value = "/login")
	public String logInSatff(@RequestBody StaffVO staffVO) throws Exception {
		return staffService.logInSatff(staffVO);
	}
}
