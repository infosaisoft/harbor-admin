package com.harbor.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harbor.bo.DiseasesBo;
import com.harbor.dao.DiseasesDao;
import com.harbor.dto.DiseasesDto;

@Service
public class DiseasesServiceImpl implements DiseasesService {

	@Autowired
	private DiseasesDao dao;
	
	public String registrar(DiseasesDto dto) {
		DiseasesBo bo=null;
		int count=0;
		//convert dto to bo
		 bo=new DiseasesBo();
	BeanUtils.copyProperties(dto, bo);

	  //use dao
	count=dao.insert(bo);
	if(count==0){
		return "fail";
	}
		return "sucess";
	}
	
	public List<DiseasesDto> featchall() {
	List<DiseasesBo>listbo=null;
	
	List<DiseasesDto>listdto=new ArrayList<DiseasesDto>();
	    listbo=dao.getAllDiseases();
	    listbo.forEach(bo->{
	    	
	    	DiseasesDto dto=new DiseasesDto();
	    	BeanUtils.copyProperties(bo, dto);
	    	listdto.add(dto);
	    });
		return listdto;
	}
	
	@Override
	public DiseasesDto featchDiseasesbysno(int sno) {
	  DiseasesBo bo=null;
	  DiseasesDto dto=null;
	
	  //use dao
	  bo=dao.getDiseasesBysno(sno);
	  //convert bo to dto
	  dto=new DiseasesDto();
	  BeanUtils.copyProperties(bo, dto);
		return dto;
	}

	
	@Override
	public String removeDisease(int sno) {
		int 	count=0;
		//use dao
		count=dao.deleteDiseases(sno);
		if(count==0) {
			return  sno+"disease was  not delete";
		}
		return  sno+"disease was   delete";
	}
	
	
	
	@Override
	public String ModifyDisease(DiseasesDto dto) {
	DiseasesBo bo=null;
	int count=0;
	//copy dto to bo
	bo=new DiseasesBo();
	BeanUtils.copyProperties(dto, bo);
	count=dao.UpdateDisease(bo);
	if(count==0) {
		return "not update";
	}
		return  "update sucesfull";
	}
}
