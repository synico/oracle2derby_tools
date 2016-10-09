package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XformVersionKey;

public class XformVersionKeyRowMapper<T> implements RowMapper<XformVersionKey> {

	@Override
	public XformVersionKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		XformVersionKey obj = new XformVersionKey();
		
		obj.setFormId(rs.getBigDecimal("FORM_ID"));
		obj.setFormVersionId(rs.getBigDecimal("FORM_VERSION_ID"));
		
		return obj;
	}

}
