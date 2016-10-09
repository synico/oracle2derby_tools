package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.CmfwkspcdscKey;

public class CmfwkspcdscKeyRowMapper<T> implements RowMapper<CmfwkspcdscKey> {

	@Override
	public CmfwkspcdscKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		CmfwkspcdscKey obj = new CmfwkspcdscKey();
		
		obj.setCmfwkspcId(rs.getBigDecimal("CMFWKSPC_ID"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		
		return obj;
	}

}
