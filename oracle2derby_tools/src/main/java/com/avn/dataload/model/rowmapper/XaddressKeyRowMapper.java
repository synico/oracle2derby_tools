package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XaddressKey;

public class XaddressKeyRowMapper<T> implements RowMapper<XaddressKey> {

	@Override
	public XaddressKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		XaddressKey obj = new XaddressKey();
		
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setAddressId(rs.getBigDecimal("ADDRESS_ID"));
		
		return obj;
	}

}
