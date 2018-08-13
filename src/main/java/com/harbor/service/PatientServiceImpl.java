package com.harbor.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harbor.bo.PatientsBo;
import com.harbor.dao.PatientDao;
import com.harbor.dto.PatientsDto;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
PatientDao dao;
	public String registrationPatient(PatientsDto dto) {
		PatientsBo bo=null;
		int count=0;
		//copuy dto to bo
		bo=new PatientsBo();
		BeanUtils.copyProperties(dto, bo);
		//use dao
		count=dao.insertPatient(bo);
		if(count==0) {
			return "fali";
		}
		return "sucess";
	}

}
