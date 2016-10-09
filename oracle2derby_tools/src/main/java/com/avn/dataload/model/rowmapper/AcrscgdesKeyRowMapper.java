package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.AcrscgdesKey;

public class AcrscgdesKeyRowMapper<T> implements RowMapper<AcrscgdesKey> {

	@Override
	public AcrscgdesKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		AcrscgdesKey obj = new AcrscgdesKey();
		
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setAcrescgryId(rs.getBigDecimal("ACRESCGRY_ID"));
		
		return obj;
	}

}
