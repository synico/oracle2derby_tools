package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XZfcCustmatCem;

public class XZfcCustmatCemRowMapper<T> implements RowMapper<XZfcCustmatCem> {

	@Override
	public XZfcCustmatCem mapRow(ResultSet rs, int rowNum) throws SQLException {
		XZfcCustmatCem obj = new XZfcCustmatCem();
		
		obj.setUpdatedFlag(rs.getString("UPDATED_FLAG"));
		
		return obj;
	}

}
