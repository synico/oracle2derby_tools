package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XZfcUploadLog;

public class XZfcUploadLogRowMapper<T> implements RowMapper<XZfcUploadLog> {

	@Override
	public XZfcUploadLog mapRow(ResultSet rs, int rowNum) throws SQLException {
		XZfcUploadLog obj = new XZfcUploadLog();
		
		obj.setFcastamended(rs.getBigDecimal("FCASTAMENDED"));
		obj.setFcastraw(rs.getBigDecimal("FCASTRAW"));
		obj.setUpdatedFlag(rs.getString("UPDATED_FLAG"));
		
		return obj;
	}

}
