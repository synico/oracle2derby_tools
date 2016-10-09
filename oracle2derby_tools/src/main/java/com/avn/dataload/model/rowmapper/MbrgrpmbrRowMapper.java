package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Mbrgrpmbr;

public class MbrgrpmbrRowMapper<T> implements RowMapper<Mbrgrpmbr> {

	@Override
	public Mbrgrpmbr mapRow(ResultSet rs, int rowNum) throws SQLException {
		Mbrgrpmbr obj = new Mbrgrpmbr();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setCustomerid(rs.getString("CUSTOMERID"));
		obj.setExclude(rs.getString("EXCLUDE"));
		
		return obj;
	}

}
