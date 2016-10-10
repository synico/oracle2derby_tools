package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.BLKRSNCODE;

public class BLKRSNCODERowMapper<T> implements RowMapper<BLKRSNCODE> {

	@Override
	public BLKRSNCODE mapRow(ResultSet rs, int rowNum) throws SQLException {
		BLKRSNCODE obj = new BLKRSNCODE();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setBLKRSNCODE_ID(rs.getBigDecimal("BLKRSNCODE_ID"));
		obj.setBLOCKREASONTYPE(rs.getString("BLOCKREASONTYPE"));
		obj.setMANUALBLOCK(rs.getBigDecimal("MANUALBLOCK"));
		obj.setMARKFORDELETE(rs.getString("MARKFORDELETE"));
		
		return obj;
	}

}
