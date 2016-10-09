package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Refkeys;

public class RefkeysRowMapper<T> implements RowMapper<Refkeys> {

	@Override
	public Refkeys mapRow(ResultSet rs, int rowNum) throws SQLException {
		Refkeys obj = new Refkeys();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFktableName(rs.getString("FKTABLE_NAME"));
		obj.setFkcolumnName(rs.getString("FKCOLUMN_NAME"));
		obj.setTablename(rs.getString("TABLENAME"));
		
		return obj;
	}

}
