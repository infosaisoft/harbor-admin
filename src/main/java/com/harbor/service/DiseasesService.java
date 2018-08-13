package com.harbor.service;

import java.util.List;

import com.harbor.dto.DiseasesDto;

public interface DiseasesService {
	public String registrar(DiseasesDto dto);
	
	public List<DiseasesDto>featchall();

	public DiseasesDto featchDiseasesbysno(int sno);
	
	public String removeDisease(int sno);
	
	public String ModifyDisease(DiseasesDto dto);
}
