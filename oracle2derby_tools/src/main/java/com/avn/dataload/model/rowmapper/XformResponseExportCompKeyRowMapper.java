package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XformResponseExportCompKey;

public class XformResponseExportCompKeyRowMapper<T> implements RowMapper<XformResponseExportCompKey> {

	@Override
	public XformResponseExportCompKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		XformResponseExportCompKey obj = new XformResponseExportCompKey();
		
		obj.setStoreId(rs.getBigDecimal("STORE_ID"));
		obj.setFormId(rs.getBigDecimal("FORM_ID"));
		obj.setFormVersionId(rs.getBigDecimal("FORM_VERSION_ID"));
		obj.setFormResponseId(rs.getBigDecimal("FORM_RESPONSE_ID"));
		
		return obj;
	}

}
