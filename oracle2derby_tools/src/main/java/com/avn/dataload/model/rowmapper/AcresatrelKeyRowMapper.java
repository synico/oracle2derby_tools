package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.AcresatrelKey;

public class AcresatrelKeyRowMapper<T> implements RowMapper<AcresatrelKey> {

	@Override
	public AcresatrelKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		AcresatrelKey obj = new AcresatrelKey();
		
		obj.setAcattrId(rs.getBigDecimal("ACATTR_ID"));
		obj.setAcrescgryId(rs.getBigDecimal("ACRESCGRY_ID"));
		
		return obj;
	}

}
