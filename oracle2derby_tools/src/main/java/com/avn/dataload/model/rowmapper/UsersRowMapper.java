package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Users;

public class UsersRowMapper<T> implements RowMapper<Users> {

	@Override
	public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
		Users obj = new Users();
		
		obj.setUsersId(rs.getBigDecimal("USERS_ID"));
		obj.setSetccurr(rs.getString("SETCCURR"));
		obj.setPersonalizationid(rs.getString("PERSONALIZATIONID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setRegistertype(rs.getString("REGISTERTYPE"));
		obj.setProfiletype(rs.getString("PROFILETYPE"));
		obj.setRegistration(rs.getDate("REGISTRATION"));
		obj.setLastsession(rs.getDate("LASTSESSION"));
		obj.setRegistrationupdate(rs.getDate("REGISTRATIONUPDATE"));
		obj.setRegistrationcancel(rs.getDate("REGISTRATIONCANCEL"));
		obj.setPrevlastsession(rs.getDate("PREVLASTSESSION"));
		obj.setDn(rs.getString("DN"));
		obj.setLastorder(rs.getDate("LASTORDER"));
		
		return obj;
	}

}
