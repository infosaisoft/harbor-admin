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
import org.springframework.web.bind.annotation.ModelAttribute;

import com.harbor.bo.DoctorBo;

@Repository
public class DoctorDaoImpl implements DoctorDao {
	private static final String Insert_query = "insert into doctor (Name,PassportPhoto,Address,City,State,PinCode,contact,Email,gendar,Qualification,Speciality,Hospitals) values(?,?,?,?,?,?,?,?,?,?,?,?)";

	private static final String get_all_doctor = "select *  from doctor ";

	private static final String get_doctor_by_sno = "select  id,Name,PassportPhoto,Address,City,State,PinCode,contact,Email,gendar,Qualification,Speciality,Hospitals from doctor  where id=?";

	private static final String update_dcotor_query = "update  doctor set Name=?,PassportPhoto=?,Address=?,City=?,State=?,PinCode=?,contact=?,Email=?,gendar=?,Qualification=?,Speciality=?,Hospitals=?  where id=?";
	
	private static final String delete_doctor_query="delete from doctor where id=?";
	
	@Autowired
	JdbcTemplate jt;

	@Override
	public int insertDoctor(DoctorBo bo) {
		int count = 0;
		count = jt.update(Insert_query, bo.getName(), bo.getPassport(), bo.getAddress(), bo.getCity(), bo.getState(),
				bo.getPincode(), bo.getContact(), bo.getEmail(), bo.getGendar(), bo.getQualification(),
				bo.getSpeciality(), bo.getHospital());

		return count;
	}

	@Override
	public List<DoctorBo> selectAll() {
		List<DoctorBo> listbo = null;

		listbo = jt.query(get_all_doctor, new ResultSetExtractor<List<DoctorBo>>() {

			@Override
			public List<DoctorBo> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<DoctorBo> listbo = null;
				DoctorBo bo = null;
				System.out.println("dao");
				while (rs.next()) {
					bo = new DoctorBo();
					bo.setId(rs.getInt(1));

					bo.setName(rs.getString(2));
					bo.setPassport(rs.getString(3));

					bo.setAddress(rs.getString(4));
					bo.setCity(rs.getString(5));
					bo.setState(rs.getString(6));
					bo.setPincode(rs.getString(7));

					bo.setContact(rs.getString(8));

					bo.setEmail(rs.getString(9));
					bo.setGendar(rs.getString(10));
					bo.setQualification(rs.getString(11));
					bo.setSpeciality(rs.getString(12));
					bo.setHospital(rs.getString(13));
					listbo = new ArrayList<>();
					listbo.add(bo);
				}

				return listbo;
			}

		});
		return listbo;
	}

	@Override
	public DoctorBo getDoctorSno(int sno) {

		DoctorBo bo = null;
		bo = jt.queryForObject(get_doctor_by_sno, new RowMapper<DoctorBo>() {

			@Override
			public DoctorBo mapRow(ResultSet rs, int index) throws SQLException {
				DoctorBo bo = null;
				System.err.println(rs);
				bo = new DoctorBo();
				bo.setId(rs.getInt(1));
				System.out.println(bo.getId());
				bo.setName(rs.getString(2));
				bo.setPassport(rs.getString(3));
				bo.setAddress(rs.getString(4));
				bo.setCity(rs.getString(5));
				bo.setState(rs.getString(6));
				bo.setPincode(rs.getString(7));
				bo.setContact(rs.getString(8));
				bo.setEmail(rs.getString(9));
				bo.setGendar(rs.getString(10));
				bo.setQualification(rs.getString(11));
				bo.setSpeciality(rs.getString(12));
				bo.setHospital(rs.getString(13));
				return bo;
			}
		}, sno);
		return bo;

	}

	@Override
	public int updateDoctor(DoctorBo bo) {
		int count = 0;
		count = jt.update(update_dcotor_query, bo.getName(), bo.getPassport(), bo.getAddress(), bo.getCity(),
				bo.getState(), bo.getPincode(), bo.getContact(), bo.getEmail(), bo.getGendar(), bo.getQualification(),
				bo.getSpeciality(), bo.getHospital(), bo.getId());
		return count;
	}
	
	
	@Override
	public int deletedoctor(int sno) {
		int count=0;
		count=jt.update(delete_doctor_query, sno);
		return 0;
	}

}
