package com.harbor.dao;

import java.util.List;

import com.harbor.bo.DiseasesBo;

public interface DiseasesDao {
	
	public int insert(DiseasesBo bo);
	
	public List<DiseasesBo> getAllDiseases();
	
	public DiseasesBo getDiseasesBysno(int sno);
	
	public int deleteDiseases(int sno);
public int UpdateDisease(DiseasesBo bo);
}
