package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Seopagedefsubparam;

public class SeopagedefsubparamRowMapper<T> implements RowMapper<Seopagedefsubparam> {

	@Override
	public Seopagedefsubparam mapRow(ResultSet rs, int rowNum) throws SQLException {
		Seopagedefsubparam obj = new Seopagedefsubparam();
		
		obj.setClassname(rs.getString("CLASSNAME"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setAdmindesc(rs.getString("ADMINDESC"));
		
		return obj;
	}

}
