package com.harbor.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.harbor.bo.DiseasesBo;

@Repository
public class DiseeasesDaoImpl implements DiseasesDao {
	private static final String Add_query="insert into diseases (Typeofdiseases,Symptoms,DietCharts,Exercises,DosAndDonts) VALUES(?,?,?,?,?)";

	private static final String GET_ALL="SELECT  sno,Typeofdiseases,Symptoms,DietCharts,Exercises,DosAndDonts from  diseases" ;
	
	private static final String Get_query_bysn_sno="select  sno,Typeofdiseases,Symptoms,DietCharts,Exercises,DosAndDonts from  diseases where sno=?";
	
	private static final String Delete_quey="delete from diseases  where sno=?";
	
	private static final String Update_query="update  diseases set Typeofdiseases=?,Symptoms=?,DietCharts=?,Exercises=?,DosAndDonts=? where sno=?";
	
	@Autowired
	private JdbcTemplate jt;
	
	public int insert(DiseasesBo bo) {
		int count=0;
		count=jt.update(Add_query, bo.getTypeofdiseases(),bo.getSymptoms(),bo.getDietCharts(),bo.getExercises(),bo.getDoAndDonts());
		return count;
	}

	public List<DiseasesBo> getAllDiseases() {
		List<DiseasesBo>listbo=null;
		listbo=jt.query(GET_ALL, new ResultSetExtractor<List<DiseasesBo>>() {

			public List<DiseasesBo> extractData(ResultSet rs) throws SQLException, DataAccessException {
			   DiseasesBo bo=null;
			   List<DiseasesBo> listbo=new ArrayList<DiseasesBo>();
			   while(rs.next()) {
				   bo=new DiseasesBo();
				   bo.setSno(rs.getInt(1));
				   bo.setTypeofdiseases(rs.getString(2));
				   bo.setSymptoms(rs.getString(3));
				   bo.setDietCharts(rs.getString(4));
				   bo.setExercises(rs.getString(5));
				   bo.setDoAndDonts(rs.getString(6));
				  
				   listbo.add(bo);
			   }
				return listbo;
			}
			
			
		});
		return listbo;
	}

	public DiseasesBo getDiseasesBysno(int sno) {
		DiseasesBo bo=null;
		
		bo=jt.queryForObject(Get_query_bysn_sno, new DiseasesMapper(), sno);
		return bo;
	}

	public int deleteDiseases(int sno) {
		int count=0;
		count=jt.update(Delete_quey, sno);
		return count;
	}
	
	private  class DiseasesMapper implements RowMapper<DiseasesBo>{

		public DiseasesBo mapRow(ResultSet rs, int index) throws SQLException {
			 DiseasesBo bo=null;
			 bo=new DiseasesBo();
			 bo.setSno(rs.getInt(1));
			 bo.setTypeofdiseases(rs.getString(2));
			 bo.setSymptoms(rs.getString(3));
			 bo.setDietCharts(rs.getString(4));
			 bo.setExercises(rs.getString(5));
			 bo.setDoAndDonts(rs.getString(6));
			return bo;
		}
		
	}
	
	public int UpdateDisease(DiseasesBo bo) {
		int count=0;
		count=jt.update(Update_query, bo.getTypeofdiseases(),bo.getSymptoms(),bo.getDietCharts(),bo.getExercises(),bo.getDoAndDonts(),bo.getSno());
		return count;
	}

}
