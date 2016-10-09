package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.CrulescaleKey;

public class CrulescaleKeyRowMapper<T> implements RowMapper<CrulescaleKey> {

	@Override
	public CrulescaleKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		CrulescaleKey obj = new CrulescaleKey();
		
		obj.setCalscaleId(rs.getBigDecimal("CALSCALE_ID"));
		obj.setCalruleId(rs.getBigDecimal("CALRULE_ID"));
		
		return obj;
	}

}
