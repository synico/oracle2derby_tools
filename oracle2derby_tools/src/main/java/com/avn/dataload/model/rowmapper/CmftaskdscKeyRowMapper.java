package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.CmftaskdscKey;

public class CmftaskdscKeyRowMapper<T> implements RowMapper<CmftaskdscKey> {

	@Override
	public CmftaskdscKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		CmftaskdscKey obj = new CmftaskdscKey();
		
		obj.setCmftaskId(rs.getBigDecimal("CMFTASK_ID"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		
		return obj;
	}

}
