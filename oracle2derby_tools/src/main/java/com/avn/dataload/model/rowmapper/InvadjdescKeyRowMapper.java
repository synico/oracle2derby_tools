package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.InvadjdescKey;

public class InvadjdescKeyRowMapper<T> implements RowMapper<InvadjdescKey> {

	@Override
	public InvadjdescKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		InvadjdescKey obj = new InvadjdescKey();
		
		obj.setInvadjcodeId(rs.getBigDecimal("INVADJCODE_ID"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		
		return obj;
	}

}
