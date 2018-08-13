package com.harbor.service;

import java.util.List;

import com.harbor.dto.DoctorDto;

public interface DoctorService {
	
	public String registrationDoctor(DoctorDto dto);
	
	public List<DoctorDto> featchAll();
	
	public List<String>getAllFile();
	
	public DoctorDto featchBySno(int sno);
	
	public String modifieDoctor(DoctorDto dto);
	
	public String removeDoctro(int id);

}
