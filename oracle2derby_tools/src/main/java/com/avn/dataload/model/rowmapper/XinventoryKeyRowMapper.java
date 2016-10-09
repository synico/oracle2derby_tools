package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XinventoryKey;

public class XinventoryKeyRowMapper<T> implements RowMapper<XinventoryKey> {

	@Override
	public XinventoryKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		XinventoryKey obj = new XinventoryKey();
		
		obj.setFfmcenterId(rs.getBigDecimal("FFMCENTER_ID"));
		obj.setCatentryId(rs.getBigDecimal("CATENTRY_ID"));
		obj.setStoreId(rs.getBigDecimal("STORE_ID"));
		
		return obj;
	}

}
