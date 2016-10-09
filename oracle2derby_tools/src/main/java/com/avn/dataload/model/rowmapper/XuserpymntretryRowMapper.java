package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Xuserpymntretry;

public class XuserpymntretryRowMapper<T> implements RowMapper<Xuserpymntretry> {

	@Override
	public Xuserpymntretry mapRow(ResultSet rs, int rowNum) throws SQLException {
		Xuserpymntretry obj = new Xuserpymntretry();
		
		obj.setUsersId(rs.getBigDecimal("USERS_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setXuserpymntretryId(rs.getBigDecimal("XUSERPYMNTRETRY_ID"));
		obj.setFailureCounter(rs.getBigDecimal("FAILURE_COUNTER"));
		obj.setCvvinvalid(rs.getDate("CVVINVALID"));
		
		return obj;
	}

}
