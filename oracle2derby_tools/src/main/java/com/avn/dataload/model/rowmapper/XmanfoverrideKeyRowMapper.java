package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XmanfoverrideKey;

public class XmanfoverrideKeyRowMapper<T> implements RowMapper<XmanfoverrideKey> {

	@Override
	public XmanfoverrideKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		XmanfoverrideKey obj = new XmanfoverrideKey();
		
		obj.setCatgroupId(rs.getBigDecimal("CATGROUP_ID"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		
		return obj;
	}

}
