package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XZfcCustmatsplit;

public class XZfcCustmatsplitRowMapper<T> implements RowMapper<XZfcCustmatsplit> {

	@Override
	public XZfcCustmatsplit mapRow(ResultSet rs, int rowNum) throws SQLException {
		XZfcCustmatsplit obj = new XZfcCustmatsplit();
		
		obj.setWerks(rs.getString("WERKS"));
		obj.setErzeit(rs.getDate("ERZEIT"));
		obj.setMfrpn(rs.getString("MFRPN"));
		obj.setMfrnr(rs.getString("MFRNR"));
		obj.setUpdatedFlag(rs.getString("UPDATED_FLAG"));
		
		return obj;
	}

}
