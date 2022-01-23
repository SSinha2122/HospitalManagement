package com.SonalSinha.HospitalManagment.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SonalSinha.HospitalManagment.domain.Staff;
import com.SonalSinha.HospitalManagment.repository.StaffRepository;
import com.SonalSinha.HospitalManagment.vo.StaffVO;

@Service
public class StaffServiceImpl implements StaffService {

	@Autowired
	StaffRepository staffReposioty;

	@Override
	public StaffVO addStaff(StaffVO staffVO) {
		Staff staff = new Staff();
		if (staffVO != null) {
			staff.setAddress(staffVO.getAddress());
			staff.setDepartment(staffVO.getDepartment());
			staff.setMobileNo(staffVO.getMobileNo());
			staff.setName(staffVO.getName());
			staff.setPosition(staffVO.getPosition());
			staff = staffReposioty.save(staff);
			staffVO.setId(staff.getId());
		}
		return staffVO;
	}

	@Override
	public String logInSatff(StaffVO staffVO) throws Exception {
		Optional<Staff> staff = staffReposioty.findById(staffVO.getId());
		if(staff.isPresent() && staff.get().getName().equals(staffVO.getName())) {
			return "LoggedIn";
		}else {
			throw new Exception("SignUp First");
		}
	}
}
