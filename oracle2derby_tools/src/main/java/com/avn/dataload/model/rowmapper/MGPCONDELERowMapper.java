package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.MGPCONDELE;

public class MGPCONDELERowMapper<T> implements RowMapper<MGPCONDELE> {

    private static final Logger log = Logger.getLogger(MGPCONDELERowMapper.class);

	@Override
	public MGPCONDELE mapRow(ResultSet rs, int rowNum) throws SQLException {
		MGPCONDELE obj = new MGPCONDELE();
		
		obj.setTYPE(rs.getString("TYPE"));
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setMBRGRP_ID(rs.getBigDecimal("MBRGRP_ID"));
		obj.setOPERATOR(rs.getString("OPERATOR"));
		obj.setMGPCONDELE_ID(rs.getBigDecimal("MGPCONDELE_ID"));
		obj.setVALUE(rs.getString("VALUE"));
		obj.setVARIABLE(rs.getString("VARIABLE"));
		obj.setCONDNAME(rs.getString("CONDNAME"));
		obj.setNEGATE(rs.getBigDecimal("NEGATE"));
		obj.setPARENT(rs.getString("PARENT"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
