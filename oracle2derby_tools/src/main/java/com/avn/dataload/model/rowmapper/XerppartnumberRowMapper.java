package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Xerppartnumber;

public class XerppartnumberRowMapper<T> implements RowMapper<Xerppartnumber> {

	@Override
	public Xerppartnumber mapRow(ResultSet rs, int rowNum) throws SQLException {
		Xerppartnumber obj = new Xerppartnumber();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMfcode(rs.getString("MFCODE"));
		obj.setIsactive(rs.getString("ISACTIVE"));
		
		return obj;
	}

}
