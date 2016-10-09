package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.DmelementnvpKey;

public class DmelementnvpKeyRowMapper<T> implements RowMapper<DmelementnvpKey> {

	@Override
	public DmelementnvpKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		DmelementnvpKey obj = new DmelementnvpKey();
		
		obj.setName(rs.getString("NAME"));
		obj.setValue(rs.getString("VALUE"));
		obj.setDmelementId(rs.getBigDecimal("DMELEMENT_ID"));
		
		return obj;
	}

}
