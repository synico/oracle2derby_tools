package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.OperatrdscKey;

public class OperatrdscKeyRowMapper<T> implements RowMapper<OperatrdscKey> {

	@Override
	public OperatrdscKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		OperatrdscKey obj = new OperatrdscKey();
		
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setOperatorId(rs.getBigDecimal("OPERATOR_ID"));
		
		return obj;
	}

}
