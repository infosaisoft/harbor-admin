package com.harbor.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.harbor.bo.PatientsBo;

@Repository
public class PateintDaoImpl implements PatientDao {
	private static final String Insert_query="insert into patient values(?,?,?,?,?,?,?,?,?)";
	
	@Autowired
	JdbcTemplate jt;

	public int insertPatient(PatientsBo bo) {
		int count=0;
		count=jt.update(Insert_query, bo.getName(),bo.getAadar(),bo.getAadress(),bo.getEmail(),bo.getContactus(),bo.getTumbimpresion(),bo.getPhoto(),bo.getGendar(),bo.getAge());
		return 0;
	}

}
