package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Srchconf;

public class SrchconfRowMapper<T> implements RowMapper<Srchconf> {

	@Override
	public Srchconf mapRow(ResultSet rs, int rowNum) throws SQLException {
		Srchconf obj = new Srchconf();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLanguages(rs.getString("LANGUAGES"));
		obj.setConfig(rs.getString("CONFIG"));
		
		return obj;
	}

}
