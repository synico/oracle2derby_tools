package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.MBRGRP;

public class MBRGRPRowMapper<T> implements RowMapper<MBRGRP> {

    private static final Logger log = Logger.getLogger(MBRGRPRowMapper.class);

	@Override
	public MBRGRP mapRow(ResultSet rs, int rowNum) throws SQLException {
		MBRGRP obj = new MBRGRP();
		
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setMBRGRP_ID(rs.getBigDecimal("MBRGRP_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setOID(rs.getString("OID"));
		obj.setOWNER_ID(rs.getBigDecimal("OWNER_ID"));
		obj.setDN(rs.getString("DN"));
		obj.setMBRGRPNAME(rs.getString("MBRGRPNAME"));
		obj.setLASTUPDATEDBY(rs.getString("LASTUPDATEDBY"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
