package com.harbor.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.harbor.bo.DoctorBo;
import com.harbor.dao.DoctorDao;
import com.harbor.dto.DoctorDto;

@Service
public class DoctorServiceImpl implements DoctorService {

	private static final String DOWNLOAD_FOLDER = "E:\\doctor";

	@Autowired
	DoctorDao dao;

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, transactionManager = "transactionManager")
	public String registrationDoctor(DoctorDto dto) {
		DoctorBo bo = null;
		int count = 0;
		// copy dto to bo
		bo = new DoctorBo();
		BeanUtils.copyProperties(dto, bo);
		System.out.println("service");

		System.out.println(bo);
		// use dao
		count = dao.insertDoctor(bo);

		if (count == 0) {
			return "not insert";
		}

		return "insert";
	}

	@Override
	public List<DoctorDto> featchAll() {
		List<DoctorBo> listbo = null;
		List<DoctorDto> listdto = new ArrayList<>();

		// use dao
		listbo = dao.selectAll();
		// copy all bo to dto
		listbo.forEach(bo -> {
			DoctorDto dto = new DoctorDto();
			BeanUtils.copyProperties(bo, dto);
			listdto.add(dto);

		});
		System.out.println("service end");
		return listdto;
	}

	@Override
	public List<String> getAllFile() {
		File folder = null;
		folder = new File(DOWNLOAD_FOLDER);
		File files[] = null;
		List<String> list = null;
		// get all file

		if (folder.isDirectory()) {
			files = folder.listFiles();
		}
		// copy file names to List collection
		list = new ArrayList();
		for (File fname : files) {
			if (!fname.isDirectory()) {
				list.add(fname.getName());
			}
		}
		return list;

	}

	@Override
	public DoctorDto featchBySno(int sno) {
		DoctorBo bo = null;
		DoctorDto dto = null;
		// use dao
		bo = dao.getDoctorSno(sno);

		// copy bo to dto
		dto = new DoctorDto();
		System.out.println("service bo::" + bo.getPincode());
		System.out.println("service:" + bo.getGendar());
		BeanUtils.copyProperties(bo, dto);
		System.out.println("service dto::" + dto.getPincode());
		return dto;
	}

	@Override
	public String modifieDoctor(DoctorDto dto) {
		DoctorBo bo = null;
		int count = 0;
		// copy dto to bo;
		bo = new DoctorBo();
		BeanUtils.copyProperties(dto, bo);
		count = dao.updateDoctor(bo);
		if (count == 0) {
			return "not update";
		}
		return "update successfully";
	}
	
	
	
	@Override
	public String removeDoctro(int id) {
		int count=0;
	
		//use dao
		count=dao.deletedoctor(id);
		if(count==0) {
		return "record not delete";
		}
		
		return "record delete";
	}
}
