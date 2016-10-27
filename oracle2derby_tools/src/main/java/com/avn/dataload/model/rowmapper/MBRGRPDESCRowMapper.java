package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.MBRGRPDESC;

public class MBRGRPDESCRowMapper<T> implements RowMapper<MBRGRPDESC> {

    private static final Logger log = Logger.getLogger(MBRGRPDESCRowMapper.class);

	@Override
	public MBRGRPDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		MBRGRPDESC obj = new MBRGRPDESC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMBRGRP_ID(rs.getBigDecimal("MBRGRP_ID"));
		obj.setDISPLAYNAME(rs.getString("DISPLAYNAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
