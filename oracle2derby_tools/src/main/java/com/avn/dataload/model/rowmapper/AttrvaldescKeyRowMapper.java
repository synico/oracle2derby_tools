package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.AttrvaldescKey;

public class AttrvaldescKeyRowMapper<T> implements RowMapper<AttrvaldescKey> {

	@Override
	public AttrvaldescKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		AttrvaldescKey obj = new AttrvaldescKey();
		
		obj.setAttrvalId(rs.getBigDecimal("ATTRVAL_ID"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		
		return obj;
	}

}
