package com.SonalSinha.HospitalManagment.service;

import com.SonalSinha.HospitalManagment.vo.StaffVO;

public interface StaffService {
	
	StaffVO addStaff(StaffVO staffVO);

	String logInSatff(StaffVO staffVO) throws Exception;
}
