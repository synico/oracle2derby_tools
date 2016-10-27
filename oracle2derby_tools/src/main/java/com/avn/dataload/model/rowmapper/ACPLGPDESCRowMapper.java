package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ACPLGPDESC;

public class ACPLGPDESCRowMapper<T> implements RowMapper<ACPLGPDESC> {

    private static final Logger log = Logger.getLogger(ACPLGPDESCRowMapper.class);

	@Override
	public ACPLGPDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		ACPLGPDESC obj = new ACPLGPDESC();
		
		obj.setACPOLGRP_ID(rs.getBigDecimal("ACPOLGRP_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDISPLAYNAME(rs.getString("DISPLAYNAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
