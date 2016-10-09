package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.SetcurrdscKey;

public class SetcurrdscKeyRowMapper<T> implements RowMapper<SetcurrdscKey> {

	@Override
	public SetcurrdscKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		SetcurrdscKey obj = new SetcurrdscKey();
		
		obj.setSetccurr(rs.getString("SETCCURR"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		
		return obj;
	}

}
