package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.MBRGRP;

public class MBRGRPRowMapper<T> implements RowMapper<MBRGRP> {

	@Override
	public MBRGRP mapRow(ResultSet rs, int rowNum) throws SQLException {
		MBRGRP obj = new MBRGRP();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMBRGRP_ID(rs.getBigDecimal("MBRGRP_ID"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setOID(rs.getString("OID"));
		obj.setOWNER_ID(rs.getBigDecimal("OWNER_ID"));
		obj.setDN(rs.getString("DN"));
		obj.setMBRGRPNAME(rs.getString("MBRGRPNAME"));
		obj.setLASTUPDATEDBY(rs.getString("LASTUPDATEDBY"));
		
		return obj;
	}

}
