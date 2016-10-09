package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Userpwdhst;

public class UserpwdhstRowMapper<T> implements RowMapper<Userpwdhst> {

	@Override
	public Userpwdhst mapRow(ResultSet rs, int rowNum) throws SQLException {
		Userpwdhst obj = new Userpwdhst();
		
		obj.setUsersId(rs.getBigDecimal("USERS_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setUserpwdhstId(rs.getBigDecimal("USERPWDHST_ID"));
		obj.setPasswordcreation(rs.getDate("PASSWORDCREATION"));
		obj.setPrevlogonpassword(rs.getbyte[]("PREVLOGONPASSWORD"));
		obj.setSalt(rs.getString("SALT"));
		
		return obj;
	}

}
