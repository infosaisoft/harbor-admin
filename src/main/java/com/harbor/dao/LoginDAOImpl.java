package com.harbor.dao;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.harbor.bo.LoginBO;

@Repository
public class LoginDAOImpl implements LoginDAO {
	
	private static final String verifyAdminQuery = "select count(*) from harbor_admin where UserName=? and Password=?";
	private static final String insertAdminQuery = "insert into harbor_admin (AdminName, UserName, Password, CreationDate) values (?, ?, ?, ?)";

	@Autowired
	private JdbcTemplate JT;
	
	public int validateAdmin(LoginBO loginBO) {
		int count = 0;		
		count = JT.queryForObject(verifyAdminQuery, Integer.class, loginBO.getUserName(), loginBO.getPassword());
		return count;
	}
	
	public int insertAdmin(LoginBO loginBO) {
		int insertCount = 0;
		insertCount = JT.update(insertAdminQuery, loginBO.getName(), loginBO.getUserName(), loginBO.getPassword(), new Date());
		return insertCount;
	}

}
