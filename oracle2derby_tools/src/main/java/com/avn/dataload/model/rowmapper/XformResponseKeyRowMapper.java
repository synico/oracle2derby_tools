package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XformResponseKey;

public class XformResponseKeyRowMapper<T> implements RowMapper<XformResponseKey> {

	@Override
	public XformResponseKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		XformResponseKey obj = new XformResponseKey();
		
		obj.setStoreId(rs.getBigDecimal("STORE_ID"));
		obj.setFormId(rs.getBigDecimal("FORM_ID"));
		obj.setFormVersionId(rs.getBigDecimal("FORM_VERSION_ID"));
		obj.setFormResponseId(rs.getBigDecimal("FORM_RESPONSE_ID"));
		
		return obj;
	}

}
