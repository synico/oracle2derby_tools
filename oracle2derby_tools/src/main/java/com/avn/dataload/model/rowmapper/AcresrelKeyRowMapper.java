package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.AcresrelKey;

public class AcresrelKeyRowMapper<T> implements RowMapper<AcresrelKey> {

	@Override
	public AcresrelKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		AcresrelKey obj = new AcresrelKey();
		
		obj.setAcrelationId(rs.getBigDecimal("ACRELATION_ID"));
		obj.setAcrescgryId(rs.getBigDecimal("ACRESCGRY_ID"));
		
		return obj;
	}

}
