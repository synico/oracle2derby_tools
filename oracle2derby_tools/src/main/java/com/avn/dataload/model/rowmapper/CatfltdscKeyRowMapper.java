package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.CatfltdscKey;

public class CatfltdscKeyRowMapper<T> implements RowMapper<CatfltdscKey> {

	@Override
	public CatfltdscKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		CatfltdscKey obj = new CatfltdscKey();
		
		obj.setCatfilterId(rs.getBigDecimal("CATFILTER_ID"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		
		return obj;
	}

}
