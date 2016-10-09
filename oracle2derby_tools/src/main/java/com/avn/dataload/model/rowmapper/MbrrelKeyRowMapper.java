package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.MbrrelKey;

public class MbrrelKeyRowMapper<T> implements RowMapper<MbrrelKey> {

	@Override
	public MbrrelKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		MbrrelKey obj = new MbrrelKey();
		
		obj.setDescendantId(rs.getBigDecimal("DESCENDANT_ID"));
		obj.setAncestorId(rs.getBigDecimal("ANCESTOR_ID"));
		
		return obj;
	}

}
