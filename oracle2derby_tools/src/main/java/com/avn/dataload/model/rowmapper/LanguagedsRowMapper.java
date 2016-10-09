package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Languageds;

public class LanguagedsRowMapper<T> implements RowMapper<Languageds> {

	@Override
	public Languageds mapRow(ResultSet rs, int rowNum) throws SQLException {
		Languageds obj = new Languageds();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
