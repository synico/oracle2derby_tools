package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.AcresactKey;

public class AcresactKeyRowMapper<T> implements RowMapper<AcresactKey> {

	@Override
	public AcresactKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		AcresactKey obj = new AcresactKey();
		
		obj.setAcactionId(rs.getBigDecimal("ACACTION_ID"));
		obj.setAcrescgryId(rs.getBigDecimal("ACRESCGRY_ID"));
		
		return obj;
	}

}
