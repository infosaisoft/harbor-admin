package com.harbor.dao;

import java.util.List;

import com.harbor.bo.DoctorBo;

public interface DoctorDao {

	public int insertDoctor(DoctorBo bo);
	
	public List<DoctorBo> selectAll();
	
	public DoctorBo getDoctorSno(int sno);
	
	public int updateDoctor(DoctorBo bo);
	
	public int deletedoctor(int sno);
}
