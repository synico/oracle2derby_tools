package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.CatgrpdescKey;

public class CatgrpdescKeyRowMapper<T> implements RowMapper<CatgrpdescKey> {

	@Override
	public CatgrpdescKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		CatgrpdescKey obj = new CatgrpdescKey();
		
		obj.setCatgroupId(rs.getBigDecimal("CATGROUP_ID"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		
		return obj;
	}

}
