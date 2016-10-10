package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.MGPCONDELE;

public class MGPCONDELERowMapper<T> implements RowMapper<MGPCONDELE> {

	@Override
	public MGPCONDELE mapRow(ResultSet rs, int rowNum) throws SQLException {
		MGPCONDELE obj = new MGPCONDELE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setMBRGRP_ID(rs.getBigDecimal("MBRGRP_ID"));
		obj.setTYPE(rs.getString("TYPE"));
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setVALUE(rs.getString("VALUE"));
		obj.setOPERATOR(rs.getString("OPERATOR"));
		obj.setVARIABLE(rs.getString("VARIABLE"));
		obj.setCONDNAME(rs.getString("CONDNAME"));
		obj.setNEGATE(rs.getBigDecimal("NEGATE"));
		obj.setPARENT(rs.getString("PARENT"));
		obj.setMGPCONDELE_ID(rs.getBigDecimal("MGPCONDELE_ID"));
		
		return obj;
	}

}
