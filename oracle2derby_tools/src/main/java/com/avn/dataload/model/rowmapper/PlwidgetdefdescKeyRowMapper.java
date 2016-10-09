package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.PlwidgetdefdescKey;

public class PlwidgetdefdescKeyRowMapper<T> implements RowMapper<PlwidgetdefdescKey> {

	@Override
	public PlwidgetdefdescKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		PlwidgetdefdescKey obj = new PlwidgetdefdescKey();
		
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setPlwidgetdefId(rs.getBigDecimal("PLWIDGETDEF_ID"));
		
		return obj;
	}

}
