package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Cmftgtskrel;

public class CmftgtskrelRowMapper<T> implements RowMapper<Cmftgtskrel> {

	@Override
	public Cmftgtskrel mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cmftgtskrel obj = new Cmftgtskrel();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
