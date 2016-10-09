package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Xmdmmaterialsts;

public class XmdmmaterialstsRowMapper<T> implements RowMapper<Xmdmmaterialsts> {

	@Override
	public Xmdmmaterialsts mapRow(ResultSet rs, int rowNum) throws SQLException {
		Xmdmmaterialsts obj = new Xmdmmaterialsts();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStatus(rs.getString("STATUS"));
		obj.setLastupdate(rs.getDate("LASTUPDATE"));
		obj.setMdmmaterialnumber(rs.getString("MDMMATERIALNUMBER"));
		
		return obj;
	}

}
