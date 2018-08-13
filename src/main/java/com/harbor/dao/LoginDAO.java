package com.harbor.dao;

import org.springframework.stereotype.Repository;

import com.harbor.bo.LoginBO;

@Repository
public interface LoginDAO {
	public int validateAdmin(LoginBO loginBO);
	public int insertAdmin(LoginBO loginBO);
}
