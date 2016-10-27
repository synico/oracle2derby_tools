package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ACRESGPDES;

public class ACRESGPDESRowMapper<T> implements RowMapper<ACRESGPDES> {

    private static final Logger log = Logger.getLogger(ACRESGPDESRowMapper.class);

	@Override
	public ACRESGPDES mapRow(ResultSet rs, int rowNum) throws SQLException {
		ACRESGPDES obj = new ACRESGPDES();
		
		obj.setACRESGRP_ID(rs.getBigDecimal("ACRESGRP_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDISPLAYNAME(rs.getString("DISPLAYNAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
