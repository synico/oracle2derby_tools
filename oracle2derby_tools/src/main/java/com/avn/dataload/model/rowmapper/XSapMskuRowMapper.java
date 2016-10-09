package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XSapMsku;

public class XSapMskuRowMapper<T> implements RowMapper<XSapMsku> {

	@Override
	public XSapMsku mapRow(ResultSet rs, int rowNum) throws SQLException {
		XSapMsku obj = new XSapMsku();
		
		obj.setMskuLabst(rs.getBigDecimal("MSKU_LABST"));
		obj.setUpdatedFlag(rs.getString("UPDATED_FLAG"));
		
		return obj;
	}

}
