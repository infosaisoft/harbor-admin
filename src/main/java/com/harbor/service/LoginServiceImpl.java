package com.harbor.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harbor.bo.LoginBO;
import com.harbor.dao.LoginDAO;
import com.harbor.dto.LoginDTO;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginDAO dao;
	
	public String adminLogin(LoginDTO loginDTO) {
		int count = 0;
		int dataInsert = 0;
		LoginBO bo = new LoginBO();
		
		// convert DTO to BO
		BeanUtils.copyProperties(loginDTO, bo);
		
		// Use DAO
		count = dao.validateAdmin(bo);
		
		if(count == 0) {
			dataInsert = dao.insertAdmin(bo);
			if(dataInsert == 0) {
				return "Data Insertion Failed";
			}else {
				return "Success";
			}			
		}else {
			return "Data Exists";
		}
		
		
	}

}
