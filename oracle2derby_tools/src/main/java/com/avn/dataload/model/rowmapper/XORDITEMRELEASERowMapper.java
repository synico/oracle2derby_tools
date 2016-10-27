package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XORDITEMRELEASE;

public class XORDITEMRELEASERowMapper<T> implements RowMapper<XORDITEMRELEASE> {

    private static final Logger log = Logger.getLogger(XORDITEMRELEASERowMapper.class);

	@Override
	public XORDITEMRELEASE mapRow(ResultSet rs, int rowNum) throws SQLException {
		XORDITEMRELEASE obj = new XORDITEMRELEASE();
		
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setXORDITEMRELEASE_ID(rs.getBigDecimal("XORDITEMRELEASE_ID"));
		obj.setORDERITEMS_ID(rs.getBigDecimal("ORDERITEMS_ID"));
		obj.setQUANTITY(rs.getBigDecimal("QUANTITY"));
		obj.setORDRELEASENUM(rs.getBigDecimal("ORDRELEASENUM"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
