package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XORDITEMRELEASE;

public class XORDITEMRELEASERowMapper<T> implements RowMapper<XORDITEMRELEASE> {

	@Override
	public XORDITEMRELEASE mapRow(ResultSet rs, int rowNum) throws SQLException {
		XORDITEMRELEASE obj = new XORDITEMRELEASE();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setQUANTITY(rs.getBigDecimal("QUANTITY"));
		obj.setXORDITEMRELEASE_ID(rs.getBigDecimal("XORDITEMRELEASE_ID"));
		obj.setORDRELEASENUM(rs.getBigDecimal("ORDRELEASENUM"));
		obj.setORDERITEMS_ID(rs.getBigDecimal("ORDERITEMS_ID"));
		
		return obj;
	}

}
