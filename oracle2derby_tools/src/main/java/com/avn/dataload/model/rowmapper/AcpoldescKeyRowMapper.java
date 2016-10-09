package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.AcpoldescKey;

public class AcpoldescKeyRowMapper<T> implements RowMapper<AcpoldescKey> {

	@Override
	public AcpoldescKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		AcpoldescKey obj = new AcpoldescKey();
		
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setAcpolicyId(rs.getBigDecimal("ACPOLICY_ID"));
		
		return obj;
	}

}
