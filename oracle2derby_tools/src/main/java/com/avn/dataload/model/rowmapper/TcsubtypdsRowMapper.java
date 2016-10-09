package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Tcsubtypds;

public class TcsubtypdsRowMapper<T> implements RowMapper<Tcsubtypds> {

	@Override
	public Tcsubtypds mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tcsubtypds obj = new Tcsubtypds();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}