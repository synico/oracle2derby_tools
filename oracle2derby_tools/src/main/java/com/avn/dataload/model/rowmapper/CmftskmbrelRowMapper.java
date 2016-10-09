package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Cmftskmbrel;

public class CmftskmbrelRowMapper<T> implements RowMapper<Cmftskmbrel> {

	@Override
	public Cmftskmbrel mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cmftskmbrel obj = new Cmftskmbrel();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
