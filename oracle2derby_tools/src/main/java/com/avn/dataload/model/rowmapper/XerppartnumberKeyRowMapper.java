package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XerppartnumberKey;

public class XerppartnumberKeyRowMapper<T> implements RowMapper<XerppartnumberKey> {

	@Override
	public XerppartnumberKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		XerppartnumberKey obj = new XerppartnumberKey();
		
		obj.setCatentryId(rs.getBigDecimal("CATENTRY_ID"));
		obj.setDivisioncode(rs.getString("DIVISIONCODE"));
		obj.setErppartnumber(rs.getString("ERPPARTNUMBER"));
		
		return obj;
	}

}
