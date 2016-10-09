package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Numbrusgds;

public class NumbrusgdsRowMapper<T> implements RowMapper<Numbrusgds> {

	@Override
	public Numbrusgds mapRow(ResultSet rs, int rowNum) throws SQLException {
		Numbrusgds obj = new Numbrusgds();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
