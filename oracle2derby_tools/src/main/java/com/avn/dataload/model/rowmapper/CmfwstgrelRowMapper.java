package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Cmfwstgrel;

public class CmfwstgrelRowMapper<T> implements RowMapper<Cmfwstgrel> {

	@Override
	public Cmfwstgrel mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cmfwstgrel obj = new Cmfwstgrel();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
