package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Cntrname;

public class CntrnameRowMapper<T> implements RowMapper<Cntrname> {

	@Override
	public Cntrname mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cntrname obj = new Cntrname();
		
		obj.setName(rs.getString("NAME"));
		obj.setOrigin(rs.getBigDecimal("ORIGIN"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		
		return obj;
	}

}
